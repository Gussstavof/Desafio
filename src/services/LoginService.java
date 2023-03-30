package services;

import entities.User;

import java.util.List;

public class LoginService {
    public User login(List<User> users, String username, String password) throws Exception {
        List<User> userSearches = users
                .stream()
                .filter(x -> x.getUsername().equals(username))
                .toList();

        if (userSearches.size() == 0) {

            throw new Exception("Usuário não encontrado");
        }

        return checkPassword(userSearches, password);
    }

    private User checkPassword(List<User> userSearches, String password) throws Exception {
        User user = userSearches.get(0);
        if (!user.getPassword().equals(password)) {

            throw new Exception("Senha incorreta");
        }

        return user;
    }

}
