import java.util.Scanner;

public class ContaTerminal{
    String nome;
    int numero;
    String agencia;
    double saldo;
    Scanner scan = new Scanner(System.in);
    
    public void registrar(){
        System.out.println("Digite seu nome:");
        nome = scan.nextLine();
        System.out.println("Digite o número da sua conta: ");
        numero = Integer.parseInt(scan.nextLine());
        System.out.println("Digite a sua agência: ");
        agencia = scan.nextLine();
        System.out.println("Digite o seu saldo: ");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}