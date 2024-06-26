import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(String nome) {
        Produto produtoParaRemover = null;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtoParaRemover = produto;
                break;
            }
        }
        if (produtoParaRemover != null) {
            produtos.remove(produtoParaRemover);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        System.out.println("Produto não encontrado.");
        return null;
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        System.out.println();
    }
}
