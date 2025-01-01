import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı 1: ");
        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println("Girdiğiniz sayı çifttir.");
        }else {
            System.out.println("Girdiğiniz sayı tektir.");
        }

        // Ternary Operators

        // Söz dizimi -  deger = (kosul) ? dogru : yanlis;


        String sonuc = (a > 0) ? "Pozitif" : "Negatif";
        System.out.println("Sayı: " + sonuc ); // pozitif

    }
}
