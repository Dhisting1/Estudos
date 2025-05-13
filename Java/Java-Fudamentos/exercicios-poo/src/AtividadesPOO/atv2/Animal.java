package AtividadesPOO.atv2;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void emitirSom(){
        System.out.println("Qual som o animal faz? ");
    }
}
