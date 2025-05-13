package edu.fer.getters_setters.exemplos;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println("Digite seu saldo");
        conta.deposita(213);
        conta.saca(221);

        System.out.println("Seu saldo é: " + conta.getSaldo());
    }
}
