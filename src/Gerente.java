public class Gerente extends Funcionario{
    public Gerente(String nome) {
        super(nome);
    }
    public double calcularSalario(){
        double salarioBase = 3000.00;
        double bonus = 1000.00;
        return salarioBase + bonus;
    }
    public String descreverResponsabilidades(){
        return "O Gerente é responsável por liderar a equipe, definir metas e garantir " +
                "a qualidade do trabalho.";
    }
}
