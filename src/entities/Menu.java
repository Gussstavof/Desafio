package entities;

import java.util.List;

public class Menu {
    private List<Company> companies;
    private List<Client> clients;
    private List<Product> products;
    private User userLogged;
    private List<Sale> sales;

    public Menu(List<Company> companies, List<Client> clients, List<Product> products, User userLogged, List<Sale> sales) {
        this.companies = companies;
        this.clients = clients;
        this.products = products;
        this.userLogged = userLogged;
        this.sales = sales;
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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getUserLogged() {
        return userLogged;
    }

    public void setUserLogged(User userLogged) {
        this.userLogged = userLogged;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }
}
