public class Conta implements Iconta {
    
    static double saldo = 0;

    public void sacar(double valor) {
        if(saldo >= valor){
            saldo = saldo - valor;
        }else{
            System.out.println("Você não tem saldo suficiente!");
        }
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void transferir(double valor, Iconta contaDestino) {
        if(saldo >= valor){
            saldo = saldo - valor;
        }else{
            System.out.println("Você não tem saldo suficiente!");
        }
    }

    public void imprimirExtrato() {
        System.out.println("-----------------------------------");
        System.out.println("************* EXTRATO *************");
        System.out.println("-----------------------------------");
        System.out.println("Seu saldo é de: R$" + saldo);
        System.out.println("-----------------------------------");

    }
}
