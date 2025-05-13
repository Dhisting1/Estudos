package edu.fer.exercicios;

public class Atv9 {
    public static void main(String[] args) {
        int numeros = 1;

        while (numeros <= 100){
            String resultado = numeros % 2 == 0 ? numeros + "" : numeros + " impar";
            numeros++;
            System.out.println(resultado);
        }

    }
}
