package AtividadesPOO.atv4;

public class RespostaAluno {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double trabalho;

    public RespostaAluno(int matricula, String nome, double nota1, double nota2, double trabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho = trabalho;
    }

    public double media(){

        return (nota1 * 2.5 + nota2 * 2.5 + trabalho * 2) / 7;
    }

    public double finalNecessaria(){
        double mediaMinima = 6;
        double mediaAtual = media();

        if (mediaAtual >= mediaMinima){
            return 0;
        }else {
            return mediaMinima - mediaAtual;
        }

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }
}
