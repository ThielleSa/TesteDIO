package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    public static void main (String [] args){
        System.out.println("Processo seletivo:");
        
    }
        
    static void selecionarCandidato(){
        int candidatoAtual = 0; //iterador do array
        int candidatosSelecionados = 0; //iterador
        double salarioBase = 2000.0;
        String [] candidatos = {"Maria", "João", "Clementine", "Josevaldo", "Astolfo", "Gertrudes", "Doroth", "Estevão"};

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = ThreadLocalRandom.current().nextDouble(1800, 2500);
            int i = 0;
            String [] listaSelecionados = new String[5];


            if(salarioPretendido <= salarioBase){
                System.out.println("Candidato selecionado: " + candidato + ", salário pretendido: R$" + salarioPretendido);
                listaSelecionados[i] = candidato;
                candidatosSelecionados++;
                i++;
            }
            candidatoAtual++;
        }
    }
    
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000;

        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato.");
        }else if(salarioBase < salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta.");
        }else{
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
