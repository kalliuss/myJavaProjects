import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km;
        int yas;
        int tek; //tek / gidiş sönüş
        double mesafe = 0.10;

        System.out.print("Yaşınız: ");
        yas = sc.nextInt();

        System.out.printf("Gidilecek KM: ");
        km = sc.nextInt();

        System.out.println("Tek (1) / Gidiş-Dönüş mü(2) ?");
        tek = sc.nextInt();

        double ucret = mesafe * km;
        System.out.println("bilet parası: " + ucret);
        double toplamUcret;

        if (yas > 0 && km > 0 && (tek == 1 || tek == 2)){

            if (yas < 12){
                System.out.println("12 yaşından küçüklere %50 indirim");
                toplamUcret = ucret - (ucret * 0.50);
                System.out.println("Toplam ücret: " + toplamUcret);
                if (tek == 2){
                    System.out.println("Gidiş - dönüş bileti aldığınız için %20 indirim kazandınız.");
                    toplamUcret = toplamUcret - (ucret * 0.50);
                    System.out.println(toplamUcret * 2);
                }else{
                    System.out.println("Gidiş dönüş indirimi yok");
                }
            }
            if (12 <= yas && yas <= 24){
                System.out.println("12-24 yaş aralığına %20 indirim");
                toplamUcret = ucret - (ucret * 0.10);
                System.out.println("Toplam ücret: " + toplamUcret);
                if (tek == 2){
                    System.out.println("Gidiş - dönüş bileti aldığınız için %20 indirim kazandınız.");
                    toplamUcret = toplamUcret - (toplamUcret * 0.20);
                    System.out.println(toplamUcret * 2);
                }else{
                    System.out.println("Gidiş dönüş indirimi yok");
                }
            }
            if (yas >= 65 ){
                System.out.println("İhtiyarlara özel %30 indirim");
                toplamUcret = ucret - (ucret * 0.30);
                System.out.println("Toplam ücret: " + toplamUcret);
                if (tek == 2){
                    System.out.println("Gidiş - dönüş bileti aldığınız için %20 indirim kazandınız.");
                    toplamUcret = toplamUcret - (ucret * 0.20);
                    System.out.println(toplamUcret * 2);
                }else{
                    System.out.println("Gidiş dönüş indirimi yok");
                }
            }

        }else{
            System.out.println("Hatalı değer girişleri lütfen km,yas,sefer tipi seçiminizi kontrol sağlayınız.");
        }



    }
}