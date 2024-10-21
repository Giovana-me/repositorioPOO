public class ProdutoEletronico extends Produto{
    ProdutoEletronico(String nome, double preco) {
        super(nome, preco);
    }


    @Override
    double calcularDesconto(double porcentagem) {
        return preco - (preco * (porcentagem * 0.5) / 100);
    }

}
