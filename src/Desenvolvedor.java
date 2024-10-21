public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome) {
        super(nome);
    }
    public double calcularSalario(){
        double salarioBase = 4000.00;
        double bonusPorProjeto = 500.00;
        int numeroDeProjetos = 3;
        return salarioBase + (bonusPorProjeto * numeroDeProjetos);
    }
    public String descreverResponsabilidades(){
        return "O Desenvolvedor é responsável por escrever, testar e manter o código," +
                " além de colaborar com a equipe para resolver problemas e implementar novas funcionalidades.";
    }
}
