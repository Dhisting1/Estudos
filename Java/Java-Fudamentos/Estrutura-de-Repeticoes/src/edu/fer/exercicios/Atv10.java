package edu.fer.exercicios;

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeros = 1;

        while (numeros <= 100){
            String resultado = numeros % 2 == 0 ? numeros + " par" : numeros + "";
            numeros++;
            System.out.println(resultado);
        }
    }
}
