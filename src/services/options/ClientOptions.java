package services.options;

import entities.*;
import services.menu.MenuServiceClientService;

import java.util.Scanner;

public class ClientOptions implements MenuOptions {

    private MenuServiceClientService menuClientService;

    public ClientOptions(MenuServiceClientService menuClientService) {
        this.menuClientService = menuClientService;
    }

    @Override
    public void options(User user, Scanner sc) {
        if (user.IsCliente()) {
            {
                System.out.println("1 - Relizar Compras");
                System.out.println("2 - Ver Compras");
                System.out.println("0 - Deslogar");
                int escolha = sc.nextInt();

                switch (escolha) {
                    case 1: {

                        menuClientService.chooseCompany(escolha);
                        menuClientService.chooseProduct(sc);

                    }
                    case 2: {

                        menuClientService.purchase();

                    }
                    case 0: {

                    }

                }
            }
        }
    }
}
