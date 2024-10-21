import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;


    public Estoque(List<Produto> produtos) {
        this.produtos = produtos;
    }


    public Estoque() {
        this.produtos = new ArrayList<>();
    }


    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }


    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }


    public void exibirPrecoDesconto(double porcentagem) {
        if (produtos.isEmpty()) {
            System.out.println("O estoque está vazio.");
            return;
        }


        for (Produto produto : produtos) {
            double precoDesconto = produto.calcularDesconto(porcentagem);
            System.out.printf("Produto: %s | Preço com desconto: R$ %.2f%n", produto.getNome(), precoDesconto);
        }
    }


    public List<Produto> getProdutos() {
        return produtos;
    }

}
