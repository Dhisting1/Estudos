package edu.fer.exercicios;

import java.util.Scanner;

public class Atv12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos alunos tem na turma ?");
        int qtdAlunos = input.nextInt();

        double somaNotas = 0.0;
        int count = 0;

        while (count < qtdAlunos){
            count++;
            System.out.println("Digite a nota do aluno " + count + ": ");
            double nota = input.nextDouble();

            somaNotas += nota;
        }
        double media = somaNotas / qtdAlunos;

        System.out.printf("A média da turma é: %.2f", media);

    }
}
