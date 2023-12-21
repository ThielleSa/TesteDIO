import java.util.Scanner;

public class Cliente {
    String nome;
    int cpf;
    String endereco;
    int telefone;

    public void cadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite seu CPF: ");
        cpf = Integer.parseInt(sc.nextLine());
        System.out.println("Digite seu endereço: ");
        endereco = sc.nextLine();
        System.out.println("Digite seu telefone: ");
        telefone = Integer.parseInt(sc.nextLine());
    }
}


