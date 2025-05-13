package exercicios1ao10;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int horasTrabalhadas = input.nextInt();
        double valorHoraTrabalhada = input.nextDouble();

        double salario = valorHoraTrabalhada * horasTrabalhadas;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f", salario);

    }
}
