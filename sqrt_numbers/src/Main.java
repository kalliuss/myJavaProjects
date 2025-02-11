import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
    int k;
    Scanner input = new Scanner(System.in);
    int sayac = 0;
    int sayac2 = 0;

        while (true){


            System.out.print("Sayı girin: ");
            k = input.nextInt();

            System.out.println("4'ün kuvvetleri");

            for(int i = 1; i <= k; i*=4){

                System.out.println(i + " " +  sayac);
                sayac++;

            }

            System.out.println("5'in kuvvetleri");

            for(int j = 1; j <= k; j*=5){
                System.out.println(j + " " +  sayac2);
                sayac2++;
            }

           break;
        }
    }
}