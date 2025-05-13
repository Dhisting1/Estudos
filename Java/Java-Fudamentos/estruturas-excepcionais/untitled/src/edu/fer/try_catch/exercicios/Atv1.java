        /*
            Tratamento de Exceção Básico: Crie um programa que solicite ao usuário um número inteiro e, em seguida, divida 10 por esse número. Utilize um, bloco try-catch para tratar a possível exceção de divisão por zero.
        * */
package edu.fer.try_catch.exercicios;
import java.util.Scanner;
public class Atv1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Digite um número");
//      Solução 1
            try {
                int num = input.nextInt();
                int resultado = 10 / num;
                System.out.println(resultado);
            }catch (ArithmeticException e){
                System.err.println("Impossível dividir por 0");
            }
//            Solução 2

            int numero = input.nextInt();
            double resultado = (double) 10 / numero;
            if (numero == 0){
                throw new IllegalArgumentException("Impossível dividir por 0");
            }
        System.out.println("O resultado é: " + resultado);
    }
}
