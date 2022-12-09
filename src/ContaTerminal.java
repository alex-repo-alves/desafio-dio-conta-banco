import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta:");
        int conta  =  Integer.parseInt(entrada.nextLine());

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = entrada.nextLine();

        System.out.println("Informe o nome:");
        String nome  = entrada.nextLine();

        System.out.println("Informe o saldo:");
        double saldo = Double.parseDouble(entrada.nextLine());

    System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
