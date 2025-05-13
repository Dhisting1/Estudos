package edu.fer.try_catch.exercicios;

import java.util.Objects;
import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        String num = in.nextLine();

        if (Objects.equals(num, "0")){
            throw new ArithmeticException("Impossivel divisão por 0!");
        }
        try{
            int i = Integer.parseInt(num);
            System.out.println("String formatado para inteiro: " + num);
        }catch (NumberFormatException e){
            System.err.println("Número com o formato errado!");
        }finally {
            in.close();
        }
    }
}
