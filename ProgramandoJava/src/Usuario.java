public class Usuario{
    public static void main(String[] args){
        Televisao tv = new Televisao();

        tv.ligar();
        tv.aumentarVolume();
        tv.aumentarCanal();

        System.out.println("A tv está ligada? " + tv.ligada);
        System.out.println("Qual é o canal atual? " + tv.canal);
        System.out.println("Qual o volume atual? " + tv.volume);


    }
}
