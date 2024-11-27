import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık kaç gurban: ");
        sicaklik = input.nextInt();

        int kategori = -1;

        if(sicaklik < 5){
            kategori = 1;
        } else if (sicaklik < 15) {
            kategori = 2;
        }else if (sicaklik < 25) {
            kategori = 3;
        }else if (sicaklik > 25) {
            kategori = 4;
        }

        switch(kategori){
            case 1:
                System.out.println("Kayak yap gurban");
                break;
                case 2:
                    System.out.println("Sinema izle gurban");
                    break;
                    case 3:
                        System.out.println("Yengeyi gızı al pikniğe git");
                        break;
                        case 4:
                            System.out.println("Yaprak kımıldamıyor yüzmeye git");
                            break;
                            default:
                                System.out.println("geçersiz derecce");
                                break;

        }
    }
}