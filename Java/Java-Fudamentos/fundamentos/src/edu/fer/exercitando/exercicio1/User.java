package edu.fer.exercitando.exercicio1;


import edu.fer.exercitando.exercicio1.controle.SmartTV;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();
        Scanner input = new Scanner(System.in);

        System.out.println("TV ligada ? :" + smartTV.ligado);
        System.out.println("Canal atual ? :" + smartTV.canal);
        System.out.println("Volume atual ? :" + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status - TV ligada ? :" + smartTV.ligado);

        smartTV.desligar();
        System.out.println("Novo Status - TV ligada ? :" + smartTV.ligado);

        smartTV.aumentarVolume();
        System.out.println("Novo Volume ? :" + smartTV.volume);


        smartTV.diminuirVolume();
        System.out.println("Novo Volume ? : " + smartTV.volume);

        System.out.println("Digite o canal desejado: ");
        int canal = input.nextInt();
        smartTV.mudarCanal(canal);
    }
}
