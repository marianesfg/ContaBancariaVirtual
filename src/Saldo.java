public class Saldo {

    Cliente cliente;

    public Saldo(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public Double receberValor(Double valor)
    {
        return this.cliente.Saldo += valor;
    }

    public Double transferirValor(Double valor)
    {
        return this.cliente.Saldo -= valor;
    }
}
