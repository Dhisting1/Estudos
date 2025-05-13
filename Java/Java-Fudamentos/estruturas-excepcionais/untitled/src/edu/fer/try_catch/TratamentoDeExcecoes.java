package edu.fer.try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeExcecoes {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Digite seu nome: ");
            String nome = input.nextLine();
            System.out.println("Digite seu sobrenome: ");
            String sobreNome = input.nextLine();
            System.out.println("Digite sua idade: ");
            int idade = input.nextInt();
            System.out.println("Digite sua altura: ");
            double altura = input.nextDouble();

            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome: " + sobreNome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);
        } catch (InputMismatchException e){
            System.err.println("Informe os campos corretamente");
            System.err.println("Os campos idade e altura são númericos");
            System.err.println("O campo altura utiliza-se ' . ' ao invés de ' , '");
        }
    }
}