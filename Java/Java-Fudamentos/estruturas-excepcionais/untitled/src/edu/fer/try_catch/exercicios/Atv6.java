package edu.fer.try_catch.exercicios;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Para fim do programa digite: 'fim' ");

        do{
            try{
                System.out.println("Digite alguma coisa: ");
                 String entrada = input.nextLine();

                if (entrada.equals("fim")) {
                    System.out.println("Programa finalizado!");
                    break;
                }
                int resultado = Integer.parseInt(entrada);
                System.out.println("Numero digitado foi: " + resultado);
            }catch (NumberFormatException e){
                System.err.println("Apenas numeros");
            }
        }while (true);
    }
}
