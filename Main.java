public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();


        Produto tv = new ProdutoEletronico("TV", 2500.0);
        Produto iphone = new ProdutoEletronico("Iphone", 4000.0);
        Produto arroz = new ProdutoAlimenticio("Arroz", 10.0);
        Produto maca = new ProdutoAlimenticio("Maça", 5.0);


        estoque.adicionarProduto(tv);
        estoque.adicionarProduto(iphone);
        estoque.adicionarProduto(arroz);
        estoque.adicionarProduto(maca);


        estoque.exibirPrecoDesconto(10.0);
    }
}