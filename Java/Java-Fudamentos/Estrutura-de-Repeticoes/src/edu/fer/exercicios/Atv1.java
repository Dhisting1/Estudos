package edu.fer.exercicios;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        *   Programa dos Patinhos da Xuxa:
            Xuxa criou uma música sobre patinhos que foram passear. O formato é o seguinte:
        *
            n patinhos foram passear
            Além das montanhas
            Para brincar
            A mamãe gritou: Quá, quá, quá, quá
            Mas só n-1 patinhos voltaram de lá.

            * O programa deve receber um número inteiro positivo do usuário e exibir a música completa na tela, onde o número recebido representa o número inicial de patinhos que foram passear.
        */
        int nPatos = 0;
        int voltaramDeLa;

        while (nPatos == 0){
            System.out.println("Digite quantos patos foram passear: ");
            voltaramDeLa = input.nextInt();

                if (voltaramDeLa > 10){
                    System.out.println("Numero maximo de patos que podem passear é 10! ");
                    break;
                }
            System.out.println(" ");
                System.out.println(
                    voltaramDeLa + " patinhos foram passear\n" +
                    "Além das montanhas\n" +
                    "Para brincar\n" +
                    "A mamãe gritou: Quá, quá, quá, quá\n" +
                    "Mas só " + (voltaramDeLa - 1) + " patinhos voltaram de lá.");
            }

    }
}
