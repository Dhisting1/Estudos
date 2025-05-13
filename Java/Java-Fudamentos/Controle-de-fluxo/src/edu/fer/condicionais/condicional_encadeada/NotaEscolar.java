package edu.fer.condicionais.condicional_encadeada;

import java.util.Scanner;

public class NotaEscolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;

        System.out.println("digite sua nota: ");
        nota = input.nextInt();

        if (nota >= 7){
            System.out.println("aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        }else{
            System.out.println("reprovado");
        }
    }
}