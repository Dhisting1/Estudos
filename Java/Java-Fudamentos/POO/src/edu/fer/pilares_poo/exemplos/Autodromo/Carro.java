package edu.fer.pilares_poo.exemplos.Autodromo;

public class Carro extends Veiculo{
    //    Isso é o método de Encapsulamento no POO, onde nem tudo fica publico para o usuario.
    public void ligar(){
        conferirCombustivel();
        conferirCambio();
        System.out.println("Carro ligado");
    }


    private void conferirCombustivel(){
        System.out.println("conferindo combustivel");
    }
    private void conferirCambio(){
        System.out.println("conferindo cambio");
    }


}
