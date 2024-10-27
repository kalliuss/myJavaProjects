import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // a^2+b^2=c^2
        Scanner sc = new Scanner(System.in);
        int k1,k2;
        System.out.println("*** Dik Üçgenler ***");
        System.out.print("Birinci dik kenar uzunluğu: ");
        k1 = sc.nextInt();
        System.out.print("İkinci dik kenar uzunluğu: ");
        k2 = sc.nextInt();
        int kareToplam = k1*k1 + k2*k2;
//        System.out.println(kareToplam);
        int hipotenus = (int) Math.sqrt(kareToplam);
        System.out.println("Hipotenüs: " + hipotenus);

        // Üçgen Çevresini
        int cevre = k1 + k2 + hipotenus;
        System.out.println("Cevre: " + cevre);

        //Alan
        int alan = k1 * k2 / 2;
        System.out.print("Alan: " + alan);
    }
}