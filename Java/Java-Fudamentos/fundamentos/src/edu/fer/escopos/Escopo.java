package edu.fer.escopos;

public class Escopo {
//    Variável da classe Escopo, ou seja, uma variável a nível de classe
    double saldo = 10.0;

    public void sacar(double valor) {
//        Variável local do método sacar
        double novoSaldo = saldo - valor;
    }
    public void imprimirSaldo(){
//        Disponível em toda classe
        System.out.println(saldo);
//        Somente o método sacar conhece esta variável
//        System.out.println(novoSaldo);
    }
    public double calcularDividaExponencial(){
//        Variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0;

        for(int i = 0; i <= 5; i++){ //i é uma variável de escopo de bloco/fluxo
            double valorCalculado = valorParcela * i;
            valorMontante = valorMontante * valorCalculado;
        }
//        Escopo de bloco/fluxo nunca estará disponível fora do bloco for
        return valorMontante;
    }
}
