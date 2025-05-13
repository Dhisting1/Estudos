package edu.fer.try_catch.exercicios;

import java.util.Scanner;

/*
*   Manipulando Exceções Personalizadas:
    Crie uma classe de exceção personalizada chamada SaldoInsuficienteException. Em seguida, implemente uma classe ContaBancaria com um método para sacar dinheiro. Se o saldo for insuficiente, lance a exceção SaldoInsuficienteException.
* */
public class Atv2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu saldo bancário: ");
        int saldo = input.nextInt();
        System.out.println("Digite o valor que queira sacar: ");
        int saque = input.nextInt();

        try {
            sacarDinheiro(saque, saldo);
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }

    static void sacarDinheiro(int saque, int saldo) throws SaldoInsuficienteException{
        if (saldo < saque){
            throw new SaldoInsuficienteException();
        }else{
            int valorAtualizado = saldo - saque;
            System.out.println("O seu saldo depois do saque é: R$" + valorAtualizado);
            System.out.println();
        }
    }
}
