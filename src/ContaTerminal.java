
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da Agência ! ");
        int numero = scanner.nextInt();
        System.out.print("Digite a Agência! ");
        String agencia = scanner.next();
        System.out.print("Digite o titular! ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o saldo! ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                            + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
