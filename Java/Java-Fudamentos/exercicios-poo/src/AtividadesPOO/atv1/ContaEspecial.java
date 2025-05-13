package AtividadesPOO.atv1;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public boolean sacar(double valor){
        double saldoComLimite = this.getSaldo() + limite;

        if ((saldoComLimite - valor) >= 0){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String msg = "ContaEspecial\n[";
        msg += "\nlimite: " + limite;
        msg += "\n; " + super.toString();
        msg += "]" ;
        return msg;
    }
}
