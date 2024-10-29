import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy;
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz (kg): ");
        kilo = input.nextInt();
        System.out.print("Boyunuzu giriniz (m): ");
        boy = input.nextDouble();

        double indeks = kilo / boy * boy;

        System.out.print("Vücut kitle İndeksiniz: " + indeks);

    }
}