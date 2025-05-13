package edu.fer.exercicios;

public class Atv11 {
    public static void main(String[] args) {
        int numeros = 1;

        while (numeros <= 100){
            String resultado = numeros % 2 == 0 ? "\t\t\t\t" + numeros + " par" : numeros + " impar" ;
            numeros++;
            System.out.println(resultado);
        }
    }
}
