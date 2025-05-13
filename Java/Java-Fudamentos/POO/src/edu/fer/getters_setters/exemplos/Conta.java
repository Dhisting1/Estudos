package edu.fer.getters_setters.exemplos;

public class Conta {
    private double saldo;
    private double limite;

    public Conta(){
        this.limite = limite;
    }

    public void deposita (double valorDepositado){
        this.saldo += valorDepositado;
    }

    public void saca(double valorSacado){
        if (this.saldo + this.limite >= valorSacado){
            this.saldo -= valorSacado;
        }else {
            throw  new IllegalArgumentException("estorou o limite!");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
