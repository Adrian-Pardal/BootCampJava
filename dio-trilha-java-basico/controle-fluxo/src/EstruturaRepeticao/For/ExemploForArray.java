package EstruturaRepeticao.For;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS" ,"JULIA" , "MARCOS"};
        
        for (int x=0 ; x < alunos.length ; x++){
            System.out.println("O aluno no indice X = " + x + " e " + alunos[x]);
        }
    }
}
