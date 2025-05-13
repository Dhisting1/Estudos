package AtividadesPOO.atv4;

public class RespostaAluno2 {
    public static void main(String[] args) {
        RespostaAluno aluno = new RespostaAluno(12345, "Fernando", 7,2,3.3);

        System.out.println("Média do aluno " + aluno.getNome() + ": " + aluno.media());
        double notaFinalNecessaria = aluno.finalNecessaria();

        if (notaFinalNecessaria > 0) {
            System.out.printf("O aluno precisa de %.2f",notaFinalNecessaria);
            System.out.println(" na final para ser aprovado.");
        } else {
            System.out.println("O aluno não precisa fazer a prova final.");
        }
    }
}
