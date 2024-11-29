import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double s1, s2, s3;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı1: ");
        s1 = input.nextDouble();

        System.out.print("Sayı2: ");
        s2 = input.nextDouble();

        System.out.print("Sayı3: ");
        s3 = input.nextDouble();



        if (s1 > s2 && s1 > s3){
            System.out.println("En büyük sayı s1'dir.");
            if (s2 > s3){
                System.out.println("İkinci en büyük sayı s2dir.");
                System.out.println("Küçükten büyüğe sıralama: s3 < s2 < s1");
            } else{
                System.out.println("İkinci en büyük sayı s3dür");
                System.out.println("Küçükten büyüğe sıralama: s2 <s3 < s1");

            }
        } else if (s2 > s1 && s2 > s3) {
            System.out.println("En büyük sayı s2dir");
            if (s3 > s1){
                System.out.println("En büyük 2. sayı s3dür");
                System.out.println("Küçükten büyüğe: s1 < s3 <s2");
            }else{
                System.out.println("En büyük 2.sayı s1 dir.");
                System.out.println("Küçükten büyüğe sıralama: s3 < s1 < s2");

            }

        } else if (s3 > s1 && s3 > s2) {
            System.out.println("En büyük sayı s3dir");
            if (s1 > s2){
                System.out.println("En büyük 2.sayı s1dir");
                System.out.println("Küçüktn büyüğe: s2 < s1 < s3");
            }else {
                System.out.println("En büyük 2.sayı s2 dir");
                System.out.println("Küükten byüğe: s1 < s2 < s3");
            }

        }

    }
}