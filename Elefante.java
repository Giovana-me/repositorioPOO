public class Elefante extends Animal{
    private float tamanhoTromba;
    private String nome;
    private int idadeAnos;

    public Elefante(int numeroPatas, String genero, float idadeMeses) {
        super(numeroPatas, genero, idadeMeses);
    }

    public float getTamanhoTromba() {
        return tamanhoTromba;
    }

    public void setTamanhoTromba(float tamanhoTromba) {
        this.tamanhoTromba = tamanhoTromba;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadeAnos() {
        return idadeAnos;
    }

    public void setIdadeAnos(int idadeAnos) {
        this.idadeAnos = idadeAnos;
    }

    public void bramir(){
        System.out.println("O elefante está bramindo!");
    }
}
