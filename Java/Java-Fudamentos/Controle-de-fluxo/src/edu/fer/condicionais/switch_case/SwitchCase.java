package edu.fer.condicionais.switch_case;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letra;
        System.out.println("Digite uma letra");
        letra = input.nextLine().toUpperCase();

        switch (letra){
            case "P":
                System.out.println("Pequeno");
                    break;
            case "M":
                System.out.println("Medio");
                    break;
            case "G":
                System.out.println("Grande");
                    break;
            default:
                System.out.println("Digite as letras corretas! ");
        }
    }
}
