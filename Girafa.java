public class Girafa extends Animal {
    private float tamanhoPescoco;
    private String nome;
    private int idadeDias;

    public Girafa(int numeroPatas, String genero, float idadeMeses) {
        super(numeroPatas, genero, idadeMeses);
    }

    public float getTamanhoPescoco() {
        return tamanhoPescoco;
    }

    public void setTamanhoPescoco(float tamanhoPescoco) {
        this.tamanhoPescoco = tamanhoPescoco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadeDias() {
        return idadeDias;
    }

    public void setIdadeDias(int idadeDias) {
        this.idadeDias = idadeDias;
    }
    public void zumbir(){
        System.out.println("A girafa está zumbindo!");
    }
}
