package EstruturaCondicao.EswitchCase;
import java.util.Locale;
import java.util.Scanner;
public class PlanoTelefonico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("--------------------");
        System.out.println("       PLANOS       ");
        System.out.println("--------------------");
        System.out.println("BASIC igual a B");
        System.out.println("MIDIA igual a M");
        System.out.println("TURBO igual a T");
        System.out.println("--------------------");

        System.out.println("Qual desses planos acima esta interesado a ver?");
        String plano = input.next().toUpperCase();

      
        switch (plano) {
            case "T":{
                System.out.println("5Gb youtube");
                
            }
            case "M":{
                System.out.println("Whats e Instagram gratis");
                
            }case "B":{
                System.out.println("100 minutos de ligacao");
                break;
            }
            default:
                System.out.println("Essa letra nao existe nas opcoes do quadro");
        }
    }
}
