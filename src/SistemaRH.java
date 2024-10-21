public class SistemaRH {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luciana");
        gerente.calcularSalario();
        gerente.descreverResponsabilidades();

        Desenvolvedor desenvolvedor = new Desenvolvedor("Giovana");
        desenvolvedor.calcularSalario();
        desenvolvedor.descreverResponsabilidades();

        System.out.println("Informações do (a) Gerente");
        System.out.println("Nome: " + gerente.getNome());
        System.out.printf("Salário: %.2f%n", gerente.calcularSalario());
        System.out.println("Responsabilidades: " + gerente.descreverResponsabilidades());

        System.out.println("------------------------------");

        System.out.println("\nInformações do (a) Desenvolvedor");
        System.out.println("Nome: " + desenvolvedor.getNome());
        System.out.printf("Salário: %.2f%n", desenvolvedor.calcularSalario());
        System.out.println("Responsabilidades: " + desenvolvedor.descreverResponsabilidades());
    }
}
