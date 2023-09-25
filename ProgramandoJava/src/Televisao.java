public class Televisao {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;
    
    public void ligar(){
        ligada  = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void abaixarVolume(){
        volume--;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    
}