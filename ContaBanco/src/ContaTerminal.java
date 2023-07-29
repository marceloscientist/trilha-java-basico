import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numeroAgencia = 0;
        String nomeAgencia = "";
        String nomeCliente = "";
        double saldoInicial = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos cadastrar uma nova conta?");

        System.out.println("Por favor, digite o número da Agência!");
        numeroAgencia = scan.nextInt();
        scan.nextLine(); // Consume the newline character

        System.out.println("Por favor, digite o nome da Agência!");
        nomeAgencia = scan.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o número saldo!");
        saldoInicial = scan.nextDouble();


        scan.close();
        
        String welcomingMessage = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %.2f já está disponível para saque",
                nomeCliente, numeroAgencia, nomeAgencia, saldoInicial);


        System.out.println(welcomingMessage);

    }


}
