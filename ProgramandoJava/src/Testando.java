public class Testando {
    public static void main (String [] args){
        String nome = "Ary";
        String sobrenome = "Monovale";

        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String nome, String sobrenome){
        return nome.concat(" ").concat(sobrenome);
    }
}
