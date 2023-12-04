public interface Iconta {
   
    public abstract void sacar(double valorSaque);
    public abstract void depositar(double valorDepositado);
    public abstract void transferir(double valorTransferido);
    public abstract void pagar(double valorDevido);
    public static void cadastrar(){};
}
