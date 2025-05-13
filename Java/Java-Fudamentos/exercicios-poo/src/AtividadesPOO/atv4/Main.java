package AtividadesPOO.atv4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String matricula;
        String nome;
        double notaProva1;
        double notaProva2;
        double notaTrabalho;

        System.out.println("Matricula: ");
        matricula = input.nextLine();
        System.out.println("Nome: ");
        nome = input.nextLine();

        System.out.println("Prova 1: ");
        notaProva1 = input.nextDouble();
        System.out.println("Prova 2: ");
        notaProva2 = input.nextDouble();
        System.out.println("Trabalho: ");
        notaTrabalho = input.nextDouble();

        media(notaProva1, notaProva2, notaTrabalho);
    }
    public static double media(double prova1, double prova2, double trabalho){
        double media = ((prova1 * 2.5) + (prova2 * 2.5) + (trabalho * 2) ) / 7;
        if (media >= 5 && media < 7){
            System.out.println("Recuperação!!! Sua nota é: " + media);
        } else if (media <= 4.9) {
            System.out.println("Reprovado!!! Sua nota é: " + media);
        }else {
            System.out.println("Aprovado!!! Sua nota é: " + media);
        }
        return media;
    }

}
