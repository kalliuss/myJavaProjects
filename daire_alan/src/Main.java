import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //daire alan hesaplama

        double pi = 3.14;
        double alan;
        double cevre;
        int yaricap;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen yarı çapı giriniz: ");
        yaricap = input.nextInt();

        alan = pi * yaricap * yaricap;
        cevre = 2 * pi * yaricap;

        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);

        //daire dilim alan hesaplama

        int aci;
        int dYaricap;

        System.out.print("Hesaplanmasını istediğiniz açı derecesini giriniz: ");
        aci = input.nextInt();
        System.out.print("Dilim için yarıçap giriniz: ");
        dYaricap = input.nextInt();


        //formül (pi (r^2) açı)/360
        double dAlan = (pi * ( dYaricap * dYaricap ) * aci) / 360;
        int dAlan2 = (int) dAlan;
        System.out.print(aci + " lık dilimin alanı: " + dAlan2);


    }
}