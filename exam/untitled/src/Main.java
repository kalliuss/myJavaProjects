import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //scanner nesne oluşturma
        Scanner input = new Scanner(System.in);

        //değişkenleri atama
        int fizik, kimya, mat, turkce, tarih, resim;

        //değer alma
        System.out.print("fizik = ");
        fizik = input.nextInt();

        System.out.print("mat = ");
        mat = input.nextInt();

        System.out.print("kimya = ");
        kimya = input.nextInt();

        System.out.print("turkce = ");
        turkce = input.nextInt();

        System.out.print("tarih = ");
        tarih = input.nextInt();

        System.out.print("resim = ");
        resim = input.nextInt();

        int toplam = fizik + kimya + mat + turkce + tarih + resim;
        double sonuc = toplam / 6;

        String b = sonuc > 60 ? "geçtiniz" : "kaldınız";

        System.out.println( sonuc + " Ortalama ile " + b);



    }
}
