package exercicios1ao10;
import java.util.Scanner;
public class Atv3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double notaA = input.nextDouble() * 2;
        double notaB = input.nextDouble() * 3;
        double notaC = input.nextDouble() * 5;
        double soma = notaA + notaB + notaC;
        double media = soma / 10;

        System.out.printf("MEDIA = %.1f\n", media);
    }
}
