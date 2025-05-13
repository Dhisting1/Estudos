package AtividadesPOO.atv2;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }

    public void latir(){
        System.out.println("O dog está latindo!!!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au!!!");
    }
}
