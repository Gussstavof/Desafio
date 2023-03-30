package services;

import entities.Menu;
import services.menu.MenuServiceAdmin;
import services.menu.MenuServiceClient;
import services.menu.MenuServiceCompany;
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
            add(new AdminOptions(new MenuServiceAdmin(menu)));
            add(new ClientOptions(new MenuServiceClient(menu)));
            add(new CompanyOptions(new MenuServiceCompany(menu)));
        }};
    }

}
