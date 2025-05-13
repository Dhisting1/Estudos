package AtividadesPOO.atv1;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento(){
        return diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxaRendimento){
        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String msg = "Conta Poupança\n [";
        msg += "\n Rendimento do dia: " + diaRendimento;
        msg += "\n " + super.toString();
        msg += "]";
        return msg;
    }
}
