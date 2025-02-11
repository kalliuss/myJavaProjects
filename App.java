import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int k;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        k = input.nextInt();

        int sayac = 0;
        int toplam = 0;
        int ortalama;

        for(int i = 0; i <= k; i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.println(i);
                sayac++;
                
                toplam += i;
                
                

            }
        }
        System.out.println("Toplam: " + toplam);
        System.out.println("Bulunan sayı adedi: " + sayac);

        ortalama = toplam / sayac;
        System.out.println("Bulunan sayıların ortalaması: " + ortalama );
    }
}
