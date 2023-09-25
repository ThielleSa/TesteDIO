import java.util.Scanner;
import java.io.IOException;


public class Teste{
    String nome;
    int idade;
    String endereco;
    int telefone;

    Scanner sc = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        if(!n.isEmpty()){
            this.nome = n;
        };
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        try{
            this.idade = i;
            if(idade < 18){
                throw new ArithmeticException("Menor de idade!");
            }
        }catch(Exception e){
            System.out.println("Volte daqui a " + (18 - idade));
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String end) {
        if(!end.isEmpty()){
            this.endereco = end;
        }
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int tel) {
        try{
            this.telefone = tel;
        }catch(NumberFormatException e){
            System.out.println("Erro do tipo: " + e.getMessage());
            System.out.println("Só use números (sem símbolos)!");
        }

    }

    public void cadastrar(){
        System.out.println("Qual é o seu nome?");
        nome = sc.nextLine();
        System.out.println("Qual é a sua idade?");
        idade = Integer.parseInt(sc.nextLine());
        System.out.println("Qual é o seu endereço?");
        endereco = sc.nextLine();
        System.out.println("Qual é o seu número de telefone?");
        telefone = Integer.parseInt(sc.nextLine());
    }
}
