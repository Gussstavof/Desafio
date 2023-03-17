package services.menu;

import entities.Client;
import entities.Company;

import java.util.List;
import java.util.Objects;

public abstract class MenuAbstract {

    protected Company company;
    protected List<Company> companies;
    protected List<Client> clients;

    public MenuAbstract(List<Company> companies, List<Client> clients) {
        this.companies = companies;
        this.clients = clients;
    }

    public MenuAbstract() {

    }

    public void showCompanies(List<Company> companies){
        System.out.println("Para realizar uma compra, escolha a empresa onde deseja comprar: ");
        companies.forEach(company1 -> {
            System.out.println(company1.getId() + " - " + company1.getName());
        });
    }
    public void chooseCompany(Integer id, List<Company> companies){

        for (Company c : companies) {
            if (Objects.equals(c.getId(), id)) {
                company = companies.get(id);
                break;
            }
        }
    }

}
