package services.menu;

import entities.*;

public class MenuServiceAdmin extends MenuService {

    public MenuServiceAdmin(Menu menu) {
        super(menu);
    }

    public void companyList(){
        System.out.println("Empresas: ");
        companies.forEach(company1 -> System.out.println(
                company1.getId() +
                " - " + company1.getName() +
                " - " + company1.getCnpj())
        );
    }

    public void clientList(){
        System.out.println("Clients: ");
        clients.forEach(client1 -> System.out.println(
                client1.getUsername() +
                " - " + client1.getName() +
                " - " + client1.getCpf()
        ));
    }
}
