package services;

import entities.Menu;
import services.menu.MenuServiceAdminService;
import services.menu.MenuServiceClientService;
import services.menu.MenuServiceCompanyService;
import services.options.AdminOptions;
import services.options.ClientOptions;
import services.options.CompanyOptions;
import services.options.MenuOptions;

import java.util.ArrayList;
import java.util.List;

public class OptionsService {
    public static List<MenuOptions> showOptions(Menu menu){
        System.out.println("Escolha uma opção para iniciar");
        return new ArrayList<>() {{
            add(new AdminOptions(new MenuServiceAdminService(menu)));
            add(new ClientOptions(new MenuServiceClientService(menu)));
            add(new CompanyOptions(new MenuServiceCompanyService(menu)));
        }};
    }

}
