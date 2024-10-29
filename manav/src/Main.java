import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Manav stokları
        double armut, elma, domates, muz, patl, toplam;

        // Fiyatlar

        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patl = 5.00;

//        System.out.println(armut + elma + domates + muz + patl);  kontrol etme amaçlı atadık.


        // Alınacak kilo miktar değişken ataması ve kullanıcıdan veri alma
        int a, e, d, m, p;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut istenilen kg: ");
        a = input.nextInt();
        System.out.print("Elma istenilen kg: ");
        e = input.nextInt();
        System.out.print("Domates istenilen kg: ");
        d = input.nextInt();
        System.out.print("Muz istenilen kg: ");
        m = input.nextInt();
        System.out.print("Patl istenilen kg: ");
        p = input.nextInt();

        toplam = (a * armut) + (e * elma) + (d * domates) + (m * muz) + (p * patl);
        System.out.print("Toplam tutar: " + toplam);

    }
}