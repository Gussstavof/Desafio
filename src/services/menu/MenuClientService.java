package services.menu;

import entities.*;
import services.menu.MenuAbstract;

import java.util.List;
import java.util.Scanner;

public class MenuClientService extends MenuAbstract {

    private List<Product> products;
    private  User userLogado;
    private List<Sale> sales;

    public MenuClientService(List<Company> companies, List<Product> products, List<Client> clients, User userLogado, List<Sale> sales) {
        super(companies, clients);
        this.userLogado = userLogado;
        this.products = products;
        this.sales = sales;
    }
    public void chooseProduct(Scanner sc){
        showCompanies(companies);
        Integer escolhaEmpresa = sc.nextInt();
        int escolhaProduto = -1;

        do {
            System.out.println("Escolha os seus products: ");
            company.getProducts()
                    .forEach(
                            x -> System.out.println(x.getId() +
                                    " - " + x.getName() +
                                    " - " + x.getQuantity()
                            )
                    );
            System.out.println("0 - Finalizar compra");
            escolhaProduto = sc.nextInt();
            for (Product productSearch : company.getProducts()) {
                if (productSearch.getId().equals(escolhaProduto) && productSearch.getQuantity() > 0) {
                    productSearch.setQuantity(productSearch.getQuantity() - 1);
                    products.add(productSearch);
                }
            }
        } while (escolhaProduto != 0);

        bill(escolhaEmpresa);
    }

    public void purchase() {
        System.out.println();
        System.out.println("************************************************************");
        System.out.println("COMPRAS EFETUADAS");
        sales.forEach(sale -> {
            if (sale.getCliente().getUsername().equals(userLogado.getUsername())) {
                System.out.println("************************************************************");
                System.out.println("Compra de código: " + sale.getId() + " na empresa "
                        + sale.getEmpresa().getName() + ": ");
                sale.getItems()
                        .forEach(
                                x -> System.out.println(x.getId() + " - " + x.getName() + "    R$" + x.getPrice()
                                ));
                System.out.println("Total: R$" + sale.getPrice());
                System.out.println("************************************************************");
            }

        });
    }

    private void bill(Integer escolhaEmpresa){
        System.out.println("************************************************************");
        System.out.println("Resumo da compra: ");
        products
                .forEach(
                        x -> System.out.println(x.getId() + " - " + x.getName() + "    R$" + x.getPrice()
                        ));
        Company companyEscolhida = companies.stream().filter(x -> x.getId().equals(escolhaEmpresa))
                .toList().get(0);
        Client clientLogado = clients.stream()
                .filter(x -> x.getUsername().equals(userLogado.getUsername()))
                .toList().get(0);
        Sale sale = criarVenda(products, companyEscolhida, clientLogado, sales);
        System.out.println("Total: R$" + sale.getPrice());
        System.out.println("************************************************************");
        products.clear();
    }

    private Sale criarVenda(List<Product> carrinho, Company company, Client client, List<Sale> sales) {
        Double total = carrinho.stream().mapToDouble(Product::getPrice).sum();
        Double comissaoSistema = total * company.getRate();
        int idVenda = sales.isEmpty() ? 1 : sales.get(sales.size() - 1).getId() + 1;
        Sale sale = new Sale(idVenda, carrinho.stream().toList(), total, comissaoSistema, company, client);
        company.setBalance(company.getBalance() + total);
        sales.add(sale);
        return sale;
    }
}
