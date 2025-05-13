
package edu.fer.enums;


// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {

    SAO_PAULO ("SP","São Paulo", 1),
    RIO_JANEIRO ("RJ", "Rio de Janeiro",2),
    PIAUI ("PI", "Piauí",3),
    MARANHAO ("MA","Maranhão",4),
    GOIAS("GO", "Goiás",5),
    MATO_GROSSO("MT", "Mato Grosso",6),
    TOCANTIS("TO", "Tocantins",7),
    ACRE("AC", "Acre", 8),
    BAHIA("BA", "Bahia", 9),
    MINAS_GERAIS("MG", "Minas Gerais", 10);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public int getIbge(){
        return ibge;
    }
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
