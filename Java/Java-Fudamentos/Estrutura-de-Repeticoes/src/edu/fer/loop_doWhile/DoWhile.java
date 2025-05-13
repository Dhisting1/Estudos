package edu.fer.loop_doWhile;

import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            System.out.println("Telefone tocando...");
        }while (tocando());
        System.out.println("Alouu!!! ");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(2) == 1;
        System.out.println("Atendeu ? " + atendeu);
        return !atendeu;
    }
}
