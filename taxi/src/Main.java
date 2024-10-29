import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //taksimetre hesaplama

        int km;
        int taxi_metres = 10;
        int min = 20;
        double perKm = 2.20, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kilometreyi giriniz: ");
        km = input.nextInt();

        total = km * perKm + taxi_metres;

//        System.out.print("Taksimetre ücreti olmadan tutar: " + total);

        if (total <= min){
            System.out.println("İndi-bindi dahilinde ücretiniz " + min + " tl'dir.");
        } else if (total > min) {
            System.out.println("Toplam ödeneccek tutar" + total + " tl'dir.");

        }


    }
}