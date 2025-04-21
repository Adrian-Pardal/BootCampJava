package EstruturaExcepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    /*Exeçoes que podem acontecer e vamos tratar essas execeçoes
     * 1 - Não informa o nome e sobrenome
     * 2 - o Valor da idade ter um caractere não numerico
     * 3 - o Valor da altura ter uma virgula ao inves de ser um ponto(conforme o padrao americano)
     */
    public static void main(String[] args) {
        try{
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome ");
        String nome = input.next() ;

        System.out.println("Digite seu sobrenome");
        String sobrenome = input.next();

        System.out.println("Digite sua idade");
        int idade = input.nextInt();

        System.out.println("Digite a sua altura");
        double altura = input.nextDouble();

        System.out.println("Ola , me chmao " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura e " + altura + "cm ");
        input.close();
        }
        catch(InputMismatchException e ){
            System.out.println("Os campos  Idade e Altura precisam ser numericos");
        }
    }
}
