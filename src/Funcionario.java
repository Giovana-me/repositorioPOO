abstract class Funcionario implements IFuncionario {
    String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
