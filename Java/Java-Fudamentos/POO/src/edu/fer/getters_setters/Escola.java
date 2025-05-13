package edu.fer.getters_setters;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        String aluno1 = input.nextLine();
        aluno.setNome(aluno1);

        System.out.println("Digite o endereço: ");
        String endereco = input.nextLine();
        aluno.setEndereco(endereco);

        System.out.println("Digite o sobrenome: ");
        String sobreNome = input.nextLine();
        aluno.setSobreNome(sobreNome);

        System.out.println("Digite a idade: ");
        int idade = input.nextInt();
        aluno.setIdade(idade);


        System.out.println("Nome: "+aluno.getNome() + "\t Idade: "+aluno.getIdade());
        System.out.println("Sobrenome: " + aluno.getSobreNome() + "\t Endereço: " + aluno.getEndereco());
    }
}

