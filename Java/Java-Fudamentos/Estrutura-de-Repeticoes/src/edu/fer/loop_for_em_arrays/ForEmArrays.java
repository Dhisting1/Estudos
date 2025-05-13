package edu.fer.loop_for_em_arrays;

public class ForEmArrays {
    public static void main(String[] args) {
        String[] alunos = {"Felipe", "Lucas", "Julia", "Marcos"};
//      Em arrays o indice sempre começa com 0.
        for (int x = 0; x < alunos.length; x++){
            if (x == 3){
                break;
            }
            System.out.println("Aluno no indices " + (x + 1) +" se chama " + alunos[x]);
        }

//      For each, forma melhorada de se trabalhar com o loop for comum
        for(String aluno : alunos){
            if (aluno.equals("Felipe")){
                continue;
            } else if (aluno.equals("Lucas")) {
                break;
            }else{
                System.out.println("Ok");
            }
            System.out.println(aluno);
        }
    }
}
