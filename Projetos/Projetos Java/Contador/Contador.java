import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = Integer.parseInt(terminal.nextLine());
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = Integer.parseInt(terminal.nextLine());
		terminal.close();
		
		try {
			contar(parametroUm, parametroDois);
		}catch (Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}	
	}
	static void contar(int parametroUm, int parametroDois )throws ParametroInvalidoException{
        int contagem = 0;
        if(parametroDois > parametroUm){
		    contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
            for(int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }else
            throw new ParametroInvalidoException();
	}
}
