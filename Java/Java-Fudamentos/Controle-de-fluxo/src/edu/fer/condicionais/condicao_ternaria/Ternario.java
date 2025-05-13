package edu.fer.condicionais.condicao_ternaria;

public class Ternario {
    public static void main(String[] args) {
        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado"  : nota >= 5 && nota < 7 ? "recuperacao" : "reprovado";

        System.out.println(resultado);
    }
}
