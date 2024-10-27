import java.io.Console;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar;
        System.out.print("Tutarı giriniz: ");
        tutar = input.nextDouble();
        if (tutar >= 0 && tutar <= 1000) {
            System.out.println("***Tutar 0-1000 arasında KDV %18 olarak hesaplanacaktır.***");
            double kdv = 18;
            double kdvTutar = tutar * kdv / 100;
            double toplamTutar = tutar + kdvTutar;
            int intToplam = (int) toplamTutar;
            System.out.println("Kdv Tutarı: " + kdvTutar);
            System.out.println("Toplam Fiyat: " + intToplam);
        } else if (tutar > 1000) {
            System.out.println("***Tutar 1000'den büyük KDV %8 olarak hesaplanacaktır.***");
            double kdv = 8;
            double kdvTutar = tutar * kdv / 100;
            double toplamTutar = tutar + kdvTutar;
            int intToplam = (int) toplamTutar;
            System.out.println("Kdv Tutarı: " + kdvTutar);
            System.out.println("Toplam Fiyat: " + intToplam);
        }

    }
}