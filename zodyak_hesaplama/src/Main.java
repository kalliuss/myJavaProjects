import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dYil;
        int zodyak = 12;


        System.out.println("*** Çin Zodyağını Bul ***");
        System.out.println(" ");
        System.out.print("Doğum Yılınız: ");
        dYil = sc.nextInt();
        
        switch(dYil % zodyak){
            case 0:
                System.out.println("Zodyağınız Maymun");
                break;
            case 1:
                System.out.println("Zodyağınız Horoz");
                break;
            case 2:
                System.out.println("Zodyağınız Köpek");
                break;
            case 3:
                System.out.println("Zodyağınız Domuz");
                break;
            case 4:
                System.out.println("Zodyağınız Fare");
                break;
            case 5:
                System.out.println("Zodyağınız Öküz");
                break;
            case 6:
                System.out.println("Zodyağınız Kaplan");
                break;
            case 7:
                System.out.println("Zodyağınız Tavşan");
                break;
            case 8:
                System.out.println("Zodyağınız Ejderha");
                break;
            case 9:
                System.out.println("Zodyağınız Yılan");
                break;
            case 10:
                System.out.println("Zodyağınız At");
                break;
            case 11:
                System.out.println("Zodyağınız Koyun");
                break;


        }


    }
}