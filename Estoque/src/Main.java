import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        while (true) {
            System.out.println("Sistema de Estoque:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Buscar Produto");
            System.out.println("4. Listar Produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                	System.out.println(" --- Cadastrar Produto --- ");
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade do produto: ");
                    int quantidade = scanner.nextInt();
                    Produto produto = new Produto(nome, preco, quantidade);
                    estoque.adicionarProduto(produto);
                    break;

                case 2:
                	System.out.println(" --- Remover Produto --- ");
                    System.out.print("Nome do produto a remover: ");
                    String nomeRemover = scanner.nextLine();
                    estoque.removerProduto(nomeRemover);
                    break;

                case 3:
                	System.out.println(" --- Buscar Produto --- ");
                    System.out.print("Nome do produto a buscar: ");
                    String nomeBuscar = scanner.nextLine();
                    Produto produtoEncontrado = estoque.buscarProduto(nomeBuscar);
                    if (produtoEncontrado != null) {
                        System.out.println(produtoEncontrado);
                    }
                    break;

                case 4:
                	System.out.println(" --- Lista de Produtos --- ");
                    estoque.listarProdutos();
                    break;

                case 5:
                    System.out.println("Você escolheu sair!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
