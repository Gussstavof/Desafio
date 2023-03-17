package services;

import entities.Company;
import entities.Product;

public class CompanyService {
    public void addProduct(Company company, Product product){
        company.getProducts().add(product);
    }

}
