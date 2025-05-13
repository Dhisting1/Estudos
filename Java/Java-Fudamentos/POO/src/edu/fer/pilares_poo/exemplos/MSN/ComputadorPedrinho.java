package edu.fer.pilares_poo.exemplos.MSN;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
    public static void main(String[] args) {
//      abrindo MSN Messenger

        MSN msn = new MSN();
//    enviando e recebendo mensagens no MSN Messenger
//        O método enviarMensagem() é público, portanto, pode ser acessado de qualquer lugar do código.
        msn.enviarMensagem();
        msn.receberMensagem();
    }
}