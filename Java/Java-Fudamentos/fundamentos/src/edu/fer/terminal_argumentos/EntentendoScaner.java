package edu.fer.terminal_argumentos;
import java.util.Scanner;
public class EntentendoScaner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        input.close();
    }
}
