import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Cliente cliente = new Cliente("Mariane", Cliente.conta.CORRENTE, 712.87);
        Saldo saldo = new Saldo(cliente);

        double valor;
        int opcao;

        do {
            System.out.println("Operações");
            System.out.println();
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println();
            System.out.print("Digite a opção desejada: ");

            opcao = scan.nextInt();

            switch (opcao)
            {
                case 1:
                    cliente.exibirSaldo();
                    break;

                case 2:
                    cliente.exibirSaldo();
                    System.out.print("Informe o valor a receber: ");
                    valor = scan.nextDouble();
                    saldo.receberValor(valor);
                    cliente.exibirSaldo();
                    break;

                case 3:
                    cliente.exibirSaldo();
                    System.out.print("Informe o valor que deseja transferir: ");
                    valor = scan.nextDouble();
                    if (cliente.Saldo >= valor)
                        saldo.transferirValor(valor);
                    else
                        System.out.println("Saldo insuficiente!");
                    cliente.exibirSaldo();
                    break;

                case 4:
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

    }
}