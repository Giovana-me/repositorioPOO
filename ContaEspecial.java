public class ContaEspecial extends Conta{
    private float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void saque (float valor) {
        if (saldo + limite < valor) {
            System.out.println("Saldo insuficiente...");
        }else{
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
        }
    }

}
