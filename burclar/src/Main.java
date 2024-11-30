import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gun;
        String ay;
        Scanner input = new Scanner(System.in);

        System.out.print("Gün giriniz: ");
        gun = input.nextInt();
        System.out.print("Ay giriniz: ");
        ay = input.next();

        switch (ay){
            case "ocak":
                if (gun >= 22){
                    System.out.println("Burcunuz kova");
                }else{
                    System.out.println("Burcunuz oğlak");
                }
                break;
                
            case "şubat":
                if (gun >= 20){
                    System.out.println("Burcunuz balık");
                }else{
                    System.out.println("Burcunuz kova");
                }
                break;

            case "mart":
                if (gun >= 21){
                    System.out.println("Burcunuz koç");
                }else{
                    System.out.println("Burcunuz balık");
                }
                break;

            case "mayıs":
                if (gun >= 22){
                    System.out.println("Burcunuz ikizler");
                }else{
                    System.out.println("Burcunuz boğa");
                }
                break;

            case "nisan":
                if (gun >= 21){
                    System.out.println("Burcunuz boğa");
                }else{
                    System.out.println("Burcunuz koç");
                }
                break;

            case "haziran":
                if (gun >= 23){
                    System.out.println("Burcunuz yengeç");
                }else{
                    System.out.println("Burcunuz ikizler");
                }
                break;

            case "temmuz":
                if (gun >= 23){
                    System.out.println("Burcunuz aslan");
                }else{
                    System.out.println("Burcunuz yengeç");
                }
                break;

            case "ağustos":
                if (gun >= 23){
                    System.out.println("Burcunuz başak");
                }else{
                    System.out.println("Burcunuz aslan");
                }
                break;

            case "eylül":
                if (gun >= 23){
                    System.out.println("Burcunuz terazi");
                }else{
                    System.out.println("Burcunuz başak");
                }
                break;

            case "ekim":
                if (gun >= 23){
                    System.out.println("Burcunuz akrep");
                }else{
                    System.out.println("Burcunuz terazi");
                }
                break;

            case "kasım":
                if (gun >= 22){
                    System.out.println("Burcunuz yay");
                }else{
                    System.out.println("Burcunuz akrep");
                }
                break;

            case "aralık":
                if (gun >= 22){
                    System.out.println("Burcunuz oğlak");
                }else{
                    System.out.println("Burcunuz yay");
                }
                break;

        }

    }
}