package services.menu;

import entities.*;

import java.util.List;

public abstract class MenuService {

    protected List<Company> companies;
    protected List<Client> clients;
    protected List<Product> products;
    protected User userLogged;
    protected List<Sale> sales;

    public MenuService(Menu menu) {
        this.companies = menu.getCompanies();
        this.clients = menu.getClients();
        this.products = menu.getProducts();
        this.userLogged = menu.getUserLogged();
        this.sales = menu.getSales();
    }
}
