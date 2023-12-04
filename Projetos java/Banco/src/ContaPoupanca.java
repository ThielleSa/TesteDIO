import java.util.Random;


public class ContaPoupanca implements Iconta {
   
    double saldo;
    double valorSaque;
    double valorDepositado;
    double valorDevido;
    double valorTransferido;
    double taxaJuros;
    String escolha;
    static Random rand = new Random();
    private static int conta;
    private static int agencia;
    
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

    public static void gerarConta(){
        agencia = rand.nextInt(9000) + 1000; //Gera um número aleatório entre 1000 e 9999
        conta = rand.nextInt(900000) + 100000; //Gera um número aleatório entre 900000 e 100000

        System.out.println("Sua conta é 018-" + conta + "\nE sua agência é " + agencia);//Dígito fictício 018

    }



}
