package edu.fer.exercicios;

public class Atv3 {
    public static void main(String[] args) {

        for(int i = 0; i <= 100; i++){
            String par = i % 2 == 0 ? i + " par" : "";
            System.out.println(par);
        }
    }
}
