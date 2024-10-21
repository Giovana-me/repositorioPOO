public class ProdutoAlimenticio extends Produto{
    ProdutoAlimenticio(String nome, double preco) {
        super(nome, preco);
    }


    @Override
    double calcularDesconto(double porcentagem) {
        return preco - (preco * porcentagem / 100);
    }

}
