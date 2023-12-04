import java.util.Scanner;
import java.util.Random;

public class Cliente {
    static String nome;
    static String cpf;
    static String endereco;
    static String telefone;
    static int resposta;
    static int agencia;
    static int conta;
    static Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void cadastrar(){
        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite o seu CPF (sem símbolos):");
        String c = sc.nextLine();
        if(c.length() == 9){
            cpf = c;
        }
        System.out.println("Digite o seu endereço:");
        endereco = sc.nextLine();
        System.out.println("Digite o seu número de telefone (sem símbolos, 11 dígitos):");
        String tel = sc.nextLine();
        if(tel.length() == 11){
            telefone = tel;
        }
        System.out.println("Deseja criar uma conta corrente ou poupança? (Digite 1 para 'corrente' e 2 para 'poupança')");
        resposta = Integer.parseInt(sc.nextLine());
        if(resposta == 1){
            ContaCorrente.gerarConta();
        }else if(resposta == 2){
            ContaPoupanca.gerarConta();
        }
    }
}
