package edu.fer.exercicios;

public class Atv2 {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++){
            String impar = i % 2 == 0 ? "" : i + " Impar";
            System.out.println(impar);
        }
        String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"};
        System.out.print(nomes.length);



    }
}
