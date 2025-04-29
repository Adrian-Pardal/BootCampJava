import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite Seu nome completo:");
        String nomeCliente = input.nextLine();

        System.out.println("Digite o numero da Agencia");
        String agenciaCliente = input.nextLine();

        System.out.println("Digite Numero da Conta");
        int numeroConta = input.nextInt();

        System.out.println("Digite seu Saldo disponivel pra saque");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + " ,obrigado por criar uma conta em nosso banco" +
                          ", sua agencia é " + agenciaCliente + ", seu numero da conta " + numeroConta +
                          " e seu saldo " + saldo + " ja esta disponivel para saque");

        System.out.println("\nAgradecemos pela preferencia pelo nosso banco .");

    }



}