package services.menu;

import entities.*;
import services.menu.MenuAbstract;

import java.util.List;

public class MenuCompanyService extends MenuAbstract {
    private User user;

    public MenuCompanyService(User user) {
        super();
        this.user = user;
    }

    public void salesMade(List<Sale> sales){
        System.out.println();
        System.out.println("************************************************************");
        System.out.println("VENDAS EFETUADAS");
        sales.forEach(sale -> {
            if (sale.getEmpresa().getId().equals(user.getCompany().getId())) {
                System.out.println("************************************************************");
                System.out.println("entities.Sale de código: " + sale.getId() + " no CPF "
                        + sale.getCliente().getCpf() + ": ");
                sale.getItems().forEach(x -> {
                    System.out.println(x.getId() + " - " + x.getName() + "    R$" + x.getPrice());
                });
                System.out.println("Total entities.Sale: R$" + sale.getPrice());
                System.out.println("Total Taxa a ser paga: R$" + sale.getCommissionSystem());
                System.out.println("Total Líquido  para empresa"
                        + (sale.getPrice() - sale.getCommissionSystem()));
                System.out.println("************************************************************");
                System.out.println("Saldo entities.Company: " + user.getCompany().getBalance());
                System.out.println("************************************************************");
            }
        });
    }

    public void showProducts(){

        company = user.getCompany();

        company.getProducts().forEach(product -> {
            if (company.getId().equals(user.getCompany().getId())) {
                System.out.println();
                System.out.println("************************************************************");
                System.out.println("MEUS PRODUTOS");
                System.out.println("************************************************************");
                System.out.println("Código: " + product.getId());
                System.out.println("entities.Product: " + product.getName());
                System.out.println("Quantidade em estoque: " + product.getQuantity());
                System.out.println("Valor: R$" + product.getPrice());
                System.out.println("************************************************************");
                System.out.println("Saldo entities.Company: " + user.getCompany().getBalance());
                System.out.println("************************************************************");
            }
        });
    }
}
