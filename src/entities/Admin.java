package entities;

import java.util.List;

public class Admin {

    private List<Company> companies;

    private List<Client> clients;

    public Admin(List<Company> companies, List<Client> clients) {
        this.companies = companies;
        this.clients = clients;
    }
    public List<Company> getCompanies() {
        return companies;
    }
    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
