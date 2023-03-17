Mudei o relacionamento  da classe Produto com a classe Company, agora a classe Company tem uma Lista de produtos;

Corrigi um bug que uma empresa poderia vender o produto de outra;

Durante a compra um usuário podia comprar um item sem estoque. Apliquei um regra que abaixo de zero o item não será colocado no carrinho;

Agora o estoque da empresa diminui de acordo com que o usuário coloca o item no carrinho;

Diminui a "responsabilidade" do método executar;

Criei uma classe chamada "LoginService", ela é responsável pelo login;

Refatorei os nomes dos métodos, atributos e das classes. Padronizei para o inglês;

pontos de melhoria
- avaliar melhor as estruturas de dados,
- o código tem um nível de acoplamento alto
- acho que a utilização da classe abstrata MenuAbstract poderia ser melhor
- ainda tem muitos if's e switch cases na classe executar
