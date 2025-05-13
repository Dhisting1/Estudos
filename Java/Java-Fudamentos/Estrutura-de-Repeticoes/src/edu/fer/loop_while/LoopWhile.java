package edu.fer.loop_while;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LoopWhile {
    public static void main(String[] args) {
        double mesada = 10.0;

        while (mesada > 0){
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: " + valorDoce + "Adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou toda sua mesada!");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(0, 1);
    }
}
