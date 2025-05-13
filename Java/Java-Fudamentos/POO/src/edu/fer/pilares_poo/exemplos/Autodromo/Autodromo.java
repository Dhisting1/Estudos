package edu.fer.pilares_poo.exemplos.Autodromo;

public class Autodromo {
    public static void main(String[] args) {
        Carro celta = new Carro();
//        celta.ligar();
        celta.setChassi("25563");
        Moto z400 = new Moto();
        z400.setChassi("36415");

        Veiculo coringa =  celta;
        coringa.ligar();
    }
}
