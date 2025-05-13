package edu.fer.heranca;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSN msn = new MSN();
        msn.enviarMensagem();
        msn.receberMensagem();

        Facebook fbm = new Facebook();
        fbm.enviarMensagem();
        fbm.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
