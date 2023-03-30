package services.options;

import entities.*;
import services.menu.MenuServiceCompany;

import java.util.Scanner;

public class CompanyOptions implements MenuOptions {

    private MenuServiceCompany menuCompanyService;

    public CompanyOptions(MenuServiceCompany menuCompanyService) {
        this.menuCompanyService = menuCompanyService;
    }

    @Override
    public void options(User user, Scanner sc) {
        if (user.IsEmpresa()) {
            System.out.println("1 - Listar vendas");
            System.out.println("2 - Ver produtos");
            System.out.println("0 - Deslogar");
            Integer escolha = sc.nextInt();


            switch (escolha) {
                case 1: {
                    menuCompanyService.salesMade();
                }
                case 2: {
                    menuCompanyService.showProducts();
                }
                case 0: {
                }
            }

        }
    }
}
