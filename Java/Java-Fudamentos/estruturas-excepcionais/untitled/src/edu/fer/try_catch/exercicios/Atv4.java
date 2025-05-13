package edu.fer.try_catch.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int soma = 0;

        for (int i = 1; i <= 10; i++){
            while (true){
                try {
                    System.out.println("Digite o " + i + "º valor: ");
                    numeros.add(input.nextInt());
                    break;
                }catch (NumberFormatException e){
                    System.err.println("Você não digitou um número inteiro!!!");
                }
            }
        }

        for (int n: numeros){
            soma += n;
        }
        System.out.println("A soma dos números: ["+ numeros +"] digitados é: "+ soma);
    }
}
