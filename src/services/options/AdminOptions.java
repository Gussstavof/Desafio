package services.options;

import entities.*;
import services.menu.MenuServiceAdminService;

import java.util.Scanner;

public class AdminOptions implements MenuOptions {

    private final MenuServiceAdminService menuAdminService;

    public AdminOptions(MenuServiceAdminService menuAdminService) {
        this.menuAdminService = menuAdminService;
    }

    @Override
    public void options(User user, Scanner sc) {
        if (user.IsAdmin()) {
            System.out.println("1 - Listar Empresas");
            System.out.println("2 - Listar Usuarios");
            System.out.println("0 - Deslogar");

            int escolha = sc.nextInt();
            switch (escolha) {
                case 1: {

                    menuAdminService.companyList();

                }
                case 2: {

                    menuAdminService.clientList();

                }
                case 0: {

                }

            }
        }
    }
}
