import java.util.Scanner;

public class Banco extends Cliente{
    int resposta;
    Scanner sc = new Scanner(System.in);
    
    public void entradaDados(){    
        System.out.println("Já tem conta na instituição? (Responda 1 para 'sim' ou 2 para 'não')");
        resposta = Integer.parseInt(sc.nextLine());
        if(resposta == 2){
            System.out.println("Deseja realizar cadastro? (Responda 1 para 'sim' ou 2 para 'não')");
            resposta = Integer.parseInt(sc.nextLine());
            if(resposta == 1){                
                Cliente.cadastrar();
            }
        }else if(resposta == 1){
            System.out.println("Deseja fazer login? (Responda 1 para 'sim' ou 2 para 'não')");
            resposta = Integer.parseInt(sc.nextLine());
            if(resposta == 1){

            }else if(resposta == 2){
                
            }
        }        
    }
        

}
