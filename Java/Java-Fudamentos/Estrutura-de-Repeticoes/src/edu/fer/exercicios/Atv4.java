package edu.fer.exercicios;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos alunos há na turma? ");
        int numeroAlunos = input.nextInt();

        double somaNotas = 0.0;
        int contadorAlunos = 0;

        while (contadorAlunos < numeroAlunos){
            contadorAlunos++;
            System.out.println("Digite a nota do aluno " + contadorAlunos + ": ");
            double nota = input.nextDouble();
            somaNotas+= nota;
        }
        double media = somaNotas / numeroAlunos;

        System.out.printf("A média da turma é: %.2f", media);
    }
}
