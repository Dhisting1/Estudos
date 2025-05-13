package edu.fer.metodos;

public class Metodos {
    public double somar(int n1, int n2) {
        return n1 + n2;
    }

    public void imprimir(String texto) {
        System.out.println(texto);
    }

    public double dividir(int dividendo, int divisor) throws Exception {
        return dividendo / dividendo;
    }
    public void validar(){
//        Este método deveria retornar algum valor
//        no caso boolean (true ou false)
//        então seguindo as normas e boas práticas esse método está errado
    }

    public void calcularEnviar(){
//        Um método deve representar uma única responsabilidade
//        então esse método está errado
//        O certo seria: calcular() ou enviar()
    }

    public void gravarCliente(String nome, String cpf, String endereco){
//        Este método tem a finalidade de gravar informações de um cliente
//        Por que não criar um objeto cliente e passar como parâmetro?
    }
//    public void gravarCliente(Cliente cliente){
//
//    }
}
