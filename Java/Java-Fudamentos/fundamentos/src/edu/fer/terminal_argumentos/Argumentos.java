package edu.fer.terminal_argumentos;

public class Argumentos {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá me chamo " + nome + " " + sobrenome);
        System.out.println( " Tenho " + idade + " anos e ");
        System.out.println(altura + " de altura.");
    }
}
