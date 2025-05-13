package edu.fer.try_catch.exercicios;

import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit");
        String fah = entrada.nextLine();
        System.out.println("Digite a temperatura em Celsius");
        String celsius = entrada.nextLine();

        conversor(celsius, fah);
    }
    static void conversor(String celsius, String fahrenheit){
        try {
            double celsiusParaFahren = ((double) (Integer.parseInt(celsius) * 9) / 5) + 32;
            double fahrenParaCelsius = (double) (Integer.parseInt(fahrenheit) - 32) * 5 / 9;

            System.out.println("A temperatura de fahrenheit para celsius é: " + fahrenParaCelsius + "º C");
            System.out.println("A temperatura de celsius para fahrenheit é: " + celsiusParaFahren + "º F");
        }catch (NumberFormatException e){
            System.err.println("Error: Entrada invalida, digite apenas números!!!");
        }
    }
}
