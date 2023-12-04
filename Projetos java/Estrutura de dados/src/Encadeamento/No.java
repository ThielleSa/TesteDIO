package Encadeamento;
public class No<T>{

    private T conteudo;
    private No<T> proximoNo = null;

    public No(T conteudo){
        this.conteudo = conteudo;
    }
    public No<T> getProximoNo() {
        return proximoNo;
    }
    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{ " + conteudo + " }";
    }

}
