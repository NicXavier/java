import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        // Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagns para o nosso usuário
        System.out.println("Por favor, digite seu nome completo: ");
        String fullName = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        int branch = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        String account = scanner.next();
        //usei uma string para o caso do usuário digitar com o hífenN

        System.out.println("Por favor, digite o valor do depósito: ");
        double moneyAvailable = scanner.nextDouble();
               
        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        System.out.println("Olá " + fullName + ", obrigado por criar uma conta em nosso banco! Seja bem-vindo! Sua agência é " + branch + ", conta " 
        + account + " e seu saldo " + moneyAvailable + " já está disponível para saque.");

        scanner.close();
       
    }
}
