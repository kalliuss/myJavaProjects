import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        int total = 0;

        Scanner input = new Scanner(System.in);

        while(true){

            System.out.println("Lütfen sayı giriniz: ");
            k = input.nextInt();

            if(k < 0){
                break;
            }else if (k > 0 && k % 2 !=0){
                total = total + k;
            }
            System.out.println("Toplam: " + total);
        }


    }
}