package edu.fer.exercicios;

import java.util.Scanner;

public class Atv13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int maior = Integer.MIN_VALUE;

        while (count <= 10){
            count++;
            System.out.println("Digite o " + count + "º número: ");
            int numero = input.nextInt();

            if (maior < numero) maior = numero;
        }
        System.out.println("O maior número é: " + maior);
    }
}
