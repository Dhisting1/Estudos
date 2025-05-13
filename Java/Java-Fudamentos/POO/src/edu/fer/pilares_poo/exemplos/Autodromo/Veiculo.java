package edu.fer.pilares_poo.exemplos.Autodromo;
//Exemplo de implementação de HERENÇA aonde as classes Carro e Moto herdam fatores em comum
public abstract class Veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void ligar(){}

}
