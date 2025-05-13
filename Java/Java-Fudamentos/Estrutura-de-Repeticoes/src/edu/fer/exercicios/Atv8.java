package edu.fer.exercicios;
import java.util.Scanner;
public class Atv8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
        int tamanho = input.nextInt();

        if (tamanho >= 1 && tamanho <= 100){
            for (int i = 0; i < tamanho; i++){
                for (int j = 0; j < tamanho; j++){
                    if (i == 0 || i == tamanho - 1 || j == 0 || j == tamanho - 1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else {
            System.out.println("tamanho invalido");
        }
    }
}
