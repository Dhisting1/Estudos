package edu.fer.exercitando.exercicio1.controle;

public class SmartTV {
    public boolean ligado = false;
    public int canal = 1;
    public int volume = 10;

    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Volume diminuido para: " + volume);
    }
    public void mudarCanal(int canal){
        this.canal = canal;
        System.out.println("Canal mudado para: " + canal);
    }
    public void subirCanal(){
        canal++;
        System.out.println("Canal subido para: " + canal);
    }
    public void descerCanal(){
        canal--;
        System.out.println("Canal descido para: " + canal);
    }
//    Nem todos os métodos precisam ter retorno, alguns podem ser void
}
