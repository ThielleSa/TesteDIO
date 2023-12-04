package Encadeamento;
public class AppNo {
    public static void main(String[] args) {
        No<String> no1 = new No<String>("Maria");
        
        No<String> no2 = new No<String>("João");
        no1.setProximoNo(no2);

        No<String> no3 = new No<String>("Claudia");
        no2.setProximoNo(no3);

        No<String> no4 = new No<String>("Felipe");
        no3.setProximoNo(no4);
    
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
