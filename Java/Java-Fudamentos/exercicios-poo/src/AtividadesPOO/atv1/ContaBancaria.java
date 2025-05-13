package AtividadesPOO.atv1;

public class ContaBancaria {
    private String nomeCliente;
    private String numeroConta;
    private double saldo;

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor){
        if ((saldo - valor) >= 0){
            saldo -= valor;
            return true;
        }
        System.out.println("Valor para saque indisponivel!!!");
        return false;
    }

    public void depositar(double valorDeposito){
        saldo += valorDeposito;
        System.out.println("Valor depositado com sucesso!!!");
    }

    @Override
    public String toString(){
        String mensagem = "Conta Bancaria \n[ ";
        mensagem += "\nNome do Cliente: " + nomeCliente;
        mensagem += "\nNumero da conta: " + numeroConta;
        mensagem += "\nSaldo: R$ " + saldo;
        mensagem += " \n]";
        return mensagem;
    }

}
