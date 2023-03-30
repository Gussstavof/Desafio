import entities.*;
import services.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // SIMULANDO BANCO DE DADOS

        List<Product> products = new ArrayList<Product>();
        List<Sale> sales = new ArrayList<Sale>();

        Company company = new Company(2, "SafeWay Padaria", "30021423000159", 0.15, 0.0);
        Company company2 = new Company(1, "Level Varejo", "53239160000154", 0.05, 0.0);
        Company company3 = new Company(3, "SafeWay Restaurante", "41361511000116", 0.20, 0.0);

        CompanyService companyService = new CompanyService();

        Product product2 = new Product(2, "Coturno", 10, 400.0);
        Product product3 = new Product(3, "Jaqueta Jeans", 1, 150.0);
        Product product4 = new Product(4, "Calça Sarja", 15, 150.0);

        companyService.addProduct(company2, product2);
        companyService.addProduct(company2, product3);
        companyService.addProduct(company2, product4);

        Product product5 = new Product(5, "Prato feito - Frango", 10, 25.0);
        Product product6 = new Product(6, "Prato feito - Carne", 10, 25.0);
        Product product7 = new Product(7, "Suco Natural", 30, 10.0);

        companyService.addProduct(company3, product5);
        companyService.addProduct(company3, product6);
        companyService.addProduct(company3, product7);

        Product product = new Product(1, "Pão Frances", 5, 3.50);
        Product product8 = new Product(8, "Sonho", 5, 8.50);
        Product product9 = new Product(9, "Croissant", 7, 6.50);
        Product product10 = new Product(10, "Ché Gelado", 4, 5.50);

        companyService.addProduct(company, product);
        companyService.addProduct(company, product8);
        companyService.addProduct(company, product9);
        companyService.addProduct(company, product10);

        Client client = new Client("07221134049", "Allan da Silva", "client", 20);
        Client client2 = new Client("72840700050", "Samuel da Silva", "client2", 24);

        User user2 = new User("company", "1234", null, company, null);
        User user3 = new User("client", "1234", client, null, null);
        User user4 = new User("client2", "1234", client2, null, null);
        User user5 = new User("company2", "1234", null, company2, null);
        User user6 = new User("company3", "1234", null, company3, null);


        List<Client> clients = Arrays.asList(client, client2);
        List<Company> companies = Arrays.asList(company, company2, company3);

        Admin admin = new Admin(companies, clients);

        User user1 = new User("admin", "1234", null, null, admin);

        List<User> users = Arrays.asList(user1, user2, user3, user4, user5, user6);

        executar(users, clients, companies, products, sales);
    }

    public static void executar(List<User> users, List<Client> clients, List<Company> companies,
                                List<Product> products, List<Sale> sales) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu usuário e senha:");
        System.out.print("Usuário: ");
        String username = sc.next();
        System.out.print("Senha: ");
        String password = sc.next();

        LoginService loginService = new LoginService();

        try {
            User userLogged = loginService.login(users, username, password);

            OptionsService
                    .showOptions(
                            new Menu(companies, clients, products, userLogged, sales)
                    )
                    .forEach(
                            menuOption -> menuOption.options(userLogged, sc)
                    );

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            executar(users, clients, companies, products, sales);
        }
    }
}
