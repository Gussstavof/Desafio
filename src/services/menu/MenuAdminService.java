package services.menu;

import entities.Client;
import entities.Company;
import services.menu.MenuAbstract;

import java.util.List;

public class MenuAdminService extends MenuAbstract {


    public MenuAdminService(List<Company> companies, List<Client> clients) {
        super(companies, clients);
    }

    public void companyList(){
        System.out.println("Empresas: ");
        companies.forEach(company1 -> {
            System.out.println(company1.getId() +
                    " - " + company1.getName() +
                    " - " + company1.getCnpj());
        });
    }

    public void clientList(){
        System.out.println("Clients: ");
        clients.forEach(client1 -> {
            System.out.println(client1.getUsername() +
                    " - " + client1.getName() +
                    " - " + client1.getCpf()
            );
        });
    }
}
