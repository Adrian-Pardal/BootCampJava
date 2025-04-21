package EstruturaRepeticao.For;

public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS" ,"JULIA" , "MARCOS"};
        
        //forma abreviado do for
        for (String aluno : alunos){
            System.out.println("Nome do aluno e " + aluno);
        }
    }
}
