package AtividadesPOO.atv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** CONTA BANCARIA ***");
        ContaBancaria contaBancaria = new ContaBancaria();

        System.out.println("Digite o nome do cliente: ");
        String nome = input.nextLine();
        contaBancaria.setNomeCliente(nome);

        System.out.println("Digite o número da conta: ");
        String numConta = input.nextLine();
        contaBancaria.setNumeroConta(numConta);

        System.out.println("Informe o valor do deposito: ");
        double deposito = input.nextDouble();
        contaBancaria.depositar(deposito);

        System.out.println("Informe o valor do saque: ");
        double saque = input.nextDouble();
        realizarSaque(contaBancaria, saque);

        System.out.println(contaBancaria);

        System.out.println("*** CONTA POUPANÇA ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();

        System.out.println("Digite o nome do cliente: ");
        String nome2 = input.nextLine();
        contaPoupanca.setNomeCliente(nome2);

        System.out.println("Digite o número da conta: ");
        String numConta2 = input.nextLine();
        contaBancaria.setNumeroConta(numConta2);

        System.out.println("Digite os dias de rendimento: ");
        int rendimento = input.nextInt();
        contaPoupanca.setDiaRendimento(rendimento);


        System.out.println("Informe o valor do deposito: ");
        double deposito2 = input.nextDouble();
        contaBancaria.depositar(deposito2);

        System.out.println("Informe o valor do saque: ");
        double saque2 = input.nextDouble();
        realizarSaque(contaBancaria, saque2);

        String result = contaPoupanca.calcularNovoSaldo(0.5) ? "Rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo() : "Hoje não é dia de rendimento, novo saldo não calculado";

        System.out.println(result);
        System.out.println(contaPoupanca);

        System.out.println("*** CONTA ESPECIAL ***");

        ContaEspecial contaEspecial = new ContaEspecial();

        System.out.println("Digite o nome do cliente: ");
        String nome3 = input.nextLine();
        contaEspecial.setNomeCliente(nome3);

        System.out.println("Digite o número da conta: ");
        String numConta3 = input.nextLine();
        contaEspecial.setNumeroConta(numConta3);

        System.out.println("Digite o limite: ");
        double limite = input.nextInt();
        contaEspecial.setLimite(limite);

        System.out.println("Informe o valor do deposito: ");
        double deposito3 = input.nextDouble();
        contaBancaria.depositar(deposito3);

        System.out.println("Informe o valor do saque: ");
        double saque3 = input.nextDouble();
        realizarSaque(contaBancaria, saque3);
    }
    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)){
            System.out.println("Rendimento aplicado, novo saldo é de = " + conta.getSaldo());
        }
    }
}
