package edu.fer.pilares_poo.exemplos.MSN;

public class MSN {
//    No encapsulamento de classes, o modificador de acesso private é utilizado para restringir o acesso a métodos e atributos de uma classe.
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}