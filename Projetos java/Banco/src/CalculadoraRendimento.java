import java.util.Scanner;

public class CalculadoraRendimento {
    double valor;
    double juros;
    double porcentagemJuros;
    double rendimento;
    double imposto;
    String escolha;
    double resultado;
    double selic = 0.1275;
    double cdi = 0.1265;
    int prazoDias; //em dias
    int prazoMeses; //em meses
    int prazoAnos; // em anos
    Scanner scan = new Scanner(System.in);

    public double investir(){
        System.out.println("--------------------------------------------------");
        System.out.println("Escolha o tipo de investimento da sua preferência:");
        System.out.println("--------------------------------------------------");
        System.out.println("CDB, com cerca de 13,65% ao ano");
        System.out.println("LCI, com 9% ao ano");
        System.out.println("LCA, com % ao ano");
        escolha = scan.nextLine();

        if(escolha == "CDB"){
            System.out.println("Você prefere (escolha o número):\n 1- Pré-fixado(valor preestabelecido);\n 2- Pós-fixado(valor definido no momento do resgate);\n 3- Híbrida(Uma parte fixada e a outra baseada em uma taxa variável definida no momento do resgate).");
            escolha = scan.nextLine();
            switch(escolha){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;


            }
   
        }else if(escolha == "LCI"){

        }else if(escolha == "LCA"){

        }
        return 0;
    }

    public void valorImposto(){ //Quanto maior o prazo, menor é a taxa de imposto
        if(prazoMeses <= 6 || prazoDias <= 180){
            imposto = 0.225;
        }else if(prazoMeses > 6 && prazoMeses <= 12 || prazoDias >= 181 && prazoDias <= 360){
            imposto = 0.20;
        }else if(prazoMeses > 12 && prazoMeses <= 24 || prazoDias >= 361 && prazoDias <= 720){
            imposto = 0.175;
        }else if(prazoMeses > 24 || prazoDias > 720){
            imposto = 0.15;
        }
    }

    public void calculoJuros(){
        juros = valor * porcentagemJuros / 100;
    }
}
