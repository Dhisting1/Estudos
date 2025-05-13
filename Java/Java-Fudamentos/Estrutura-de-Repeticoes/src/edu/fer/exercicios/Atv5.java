package edu.fer.exercicios;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        /*
        *Maior Número:
        Solicite 10 números ao usuário e, através de um laço while, determine qual deles é o maior.
        */
        Scanner input = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int numero = 0;
        int contador = 1;

        while (contador <= 10){
            System.out.println("Digite o " + contador + "º número");
            numero = input.nextInt();
            if (numero > maior){
                maior = numero;
            }
            contador++;
        }
        System.out.println("O maior número digitado foi: " + maior);
        input.close();
    }
}
