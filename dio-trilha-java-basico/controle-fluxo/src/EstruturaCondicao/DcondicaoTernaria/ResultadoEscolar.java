package EstruturaCondicao.DcondicaoTernaria;

public class ResultadoEscolar {
    
    public static void main(String[] args) {
        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
        //Usando Else if(concicional encadeada) na condição ternaria
        String resultado2 = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperacao" : "Reprovado";
        System.out.println(resultado2);


    }
}
