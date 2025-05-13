package edu.fer.exercicios;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int menor = Integer.MAX_VALUE;
        int numero = 0;
        int contador = 1;

        while (contador <= 10){
            System.out.println("Digite o " + contador + "º número");
            numero = in.nextInt();
            if (numero < menor){
                menor = numero;
            }
            contador++;
        }
        System.out.println("O menor numero é: "+ menor);
    }
}
