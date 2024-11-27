import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner not = new Scanner(System.in);

        System.out.print("Mat: ");
        mat = not.nextInt();

        if(0 <= mat && mat <= 100) {
            System.out.println("Mat: " + mat);
        }
        else{
            System.out.println("hatalı not girişi");
        }

        System.out.print("Fizik: ");
        fizik = not.nextInt();

        if(0 <= fizik && fizik <= 100) {
            System.out.println("Fizik: " + fizik);

        }
        else{
            System.out.println("hatalı not girişi");
        }

        System.out.print("Turkce: ");
        turkce = not.nextInt();
        if(0 <= turkce && turkce <= 100) {
            System.out.println("Turkce: " + turkce);
        }
        else{
            System.out.println("hatalı not girişi");
        }


        System.out.print("Kimya: ");
        kimya = not.nextInt();
        if(0 <= kimya && kimya <= 100) {
            System.out.println("Kimya: " + kimya);
        }
        else{
            System.out.println("hatalı not girişi");
        }


        System.out.print("Muzik: ");
        muzik = not.nextInt();
        if(0 <= muzik && muzik <= 100) {
            System.out.println("Müzik: " + muzik);
        }
        else{
            System.out.println("haatalı not girişi");
        }


        double ortalama = (mat + fizik + turkce + kimya + muzik) / 5;

        if (ortalama < 55){
            System.out.println("Ortalama: " + ortalama);
            System.out.println("Kaldınız aferin çalışma sen");
        }
        else {
            System.out.println("Ortalama: " + ortalama);
            System.out.println("Geçtiniz");
        }





    }
}