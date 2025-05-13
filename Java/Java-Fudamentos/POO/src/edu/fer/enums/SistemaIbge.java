package edu.fer.enums;
import java.util.Scanner;


// qualquer classe do sistema poderá obter os objetos de EstadoBrasileiro
public class SistemaIbge {
    public static void main(String[] args) {

        for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) {
            int a = randomico(1, 10);
            if (uf.getIbge() == a){
                System.out.println("O estado escolhido pelo número do IBGE é: " + a);
                System.out.println(uf.getSigla() + " - " + uf.getNome() + " - " + uf.getIbge());
            }
        }
    }
    static int randomico(int min, int max){
        int range = (max - min) + 1;
        int random = (int) (( range * Math.random()) + min);
        return random;
    }
}
