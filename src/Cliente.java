public class Cliente {

    public enum conta
    {
        CORRENTE,
        POUPANCA
    }

    String Nome;

    conta tipoConta;

    Double Saldo;

    Double Limite;

    public Cliente(String nome, conta tipoConta, double saldo)
    {
        this.Nome = nome;
        this.tipoConta = tipoConta;
        this.Saldo = saldo;
        this.Limite = 1000.00;
    }

    public void exibirSaldo()
    {
        System.out.println("Saldo da conta: " + this.Saldo);
    }

}
