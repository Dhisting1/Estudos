package edu.fer.operadores.operadorTernario;

public class Ternario {
    public static void main(String[] args) {
        int a, b;

        a=55;
        b=10;

        if (a != b){
            System.out.println("A é diferente que B");
        }else {
            System.out.println("B é igual que A");
        }

        String c = a > b ? "A é maior que B" : "A é menor que B";
        System.out.println(c);
    }
}
