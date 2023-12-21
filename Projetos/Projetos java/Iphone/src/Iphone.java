public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Página carregada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página recarregada");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void ligar(int num) {
        System.out.println("Ligando para " + num);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void recusar() {
        System.out.println("Chamada recusada");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada finalizada");
    }

    @Override
    public void vivaVoz() {
        System.out.println("Viva-voz ativado");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }

    @Override
    public void passarMusica() {
        System.out.println("Indo para próxima música");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Retornando para a música anterior");
    }
    
}
