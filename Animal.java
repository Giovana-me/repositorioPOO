public class Animal {
    private int numeroPatas;
    private String genero;
    private float idadeMeses;

    public Animal (int numeroPatas, String genero, float idadeMeses){
        this.numeroPatas = numeroPatas;
        this.genero = genero;
        this.idadeMeses = idadeMeses;
    }

    public void comer(){
        System.out.println("O animal está comendo agora...");
    }
}
