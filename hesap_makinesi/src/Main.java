import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2;
        char select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayı: ");
        sayi1 = input.nextInt();
        System.out.print("İkinci sayı: ");
        sayi2 = input.nextInt();
        System.out.println("1- Toplama" + " 2-Çarpma" + " 3-Çıkarma" + " 4-Bölme");
        select = input.next().charAt(0);
        switch (select) {
            case '1':
                int toplam = sayi1 + sayi2;
                System.out.println("Toplam = " + toplam);
                break;
                case '2':
                    int carpim = sayi1 * sayi2;
                    System.out.println("Carpim = " + carpim);
                    break;
                    case '3':
                        int fark = sayi1 - sayi2;
                        System.out.println("Fark = " + fark);
                        break;
                        case '4':
                            int bolum = sayi1 / sayi2;
                            System.out.println("Bolum = " + bolum);
                            break;
                            default:
                                System.out.println("geçersiz işlem numarası girdiniz.");
                                break;
        }
    }
}