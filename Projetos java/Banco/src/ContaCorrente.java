import java.util.Random;
import java.util.Scanner;

public class ContaCorrente implements Iconta {
    
    double saldo;
    double emprestimo;
    double valorSaque;
    double valorDepositado;
    double valorDevido;
    double valorTransferido;
    static Random rand = new Random();
    private static int agencia;
    private static int conta;
    private static int senha;

    public void sacar(double valorSaque){
        if(saldo >= valorSaque){
            saldo -= valorSaque;
        }
    }

    public void depositar(double valorDepositado){
        saldo += valorDepositado;
    }

    public void transferir(double valorTransferido){
        if(saldo >= valorTransferido){
            saldo -= valorTransferido;
        }
    }

    public void pagar(double valorDevido){
        if(saldo >= valorDevido){
            saldo -= valorDevido;
        }
    }

    public double solicitarEmprestimo(double valor){ //Rever esse método
        double taxa = 0.25;
        emprestimo = valor + valor * taxa;
        return emprestimo;
    }

    public static void gerarConta() {
        agencia = rand.nextInt(9000) + 1000; //Gera um número aleatório entre 1000 e 9999
        conta = rand.nextInt(900000) + 100000; //Gera um número aleatório entre 900000 e 100000

        System.out.println("Parabéns! \nSua conta é: " + conta + "\nE sua agência é: " + agencia + "\nCrie uma senha (6 dígitos): ");
        Scanner sc = new Scanner(System.in);
        senha = Integer.parseInt(sc.nextLine());
        sc.close();
    }

}
