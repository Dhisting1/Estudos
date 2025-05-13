package edu.fer.condicionais.condicional_simples;
public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 20.00;
        double valorSolicitado = 19.00;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }else{
            System.out.println("Saldo insuficiente");
        }
        System.out.println(saldo);
    }
}
