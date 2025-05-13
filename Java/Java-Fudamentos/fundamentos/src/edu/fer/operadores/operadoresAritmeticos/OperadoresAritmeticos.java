package edu.fer.operadores.operadoresAritmeticos;

public class OperadoresAritmeticos {
// Exemplos de operadores Aritméticos
    int a = 10;
    int b = 20;

    int soma = a + b; // Soma
    int subtracao = a - b; // Subtração
    int multiplicacao = a * b; // Multiplicação
    int divisao = a / b; // Divisão
    int resto = a % b; // Resto da divisão

    public static void main(String[] args) {
    String concatenacao = "?";
        System.out.println(concatenacao);
    concatenacao = 1+1+"1"; // 21
        System.out.println(concatenacao);
    concatenacao = 1+"1"+1; // 111
        System.out.println(concatenacao);
    concatenacao = "1"+1+1+"1";
        System.out.println(concatenacao);
    }
}
