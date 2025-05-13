package edu.fer.operadores.operadoresLogicos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if(a && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }else{
            System.out.println("Fim");
        }

        if(a || (7 < 4)){
            System.out.println("Pelo menos uma condição é verdadeira");
        }else{
            System.out.println("Nenhuma condição é verdadeira");
        }
        System.out.println("fim");
    }
}
