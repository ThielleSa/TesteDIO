import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nome;
        int numero;
        String agencia;
        double saldo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = sc.nextLine();
        System.out.println("Digite o número da sua conta: ");
        numero = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a sua agência: ");
        agencia = sc.nextLine();
        System.out.println("Digite o seu saldo: ");
        saldo = Double.parseDouble(sc.nextLine());

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}