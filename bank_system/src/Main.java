
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hesap listesi oluştur.
        ArrayList<Account> hesaplar = new ArrayList<>();

        //örnek hesaplar ekleme
        hesaplar.add(new Account("Ahmet Yılmaz", "12356", 1000.0));
        hesaplar.add(new Account("Ayşe Demir", "654321", 1500.0));
        hesaplar.add(new Account("Mehmet Çelik", "111222", 2000.0));

        Account seciliHesap = null; //kullanıcının seçtiği hesap


        while (true){ // Sonsuz döngü, kullanıcı çıkış yapana kadar devam eder.

            if (seciliHesap == null){
                System.out.println("\n=== Hesaplar ===");
                for (int i = 0; i<hesaplar.size(); i++){
                    Account hesap = hesaplar.get(i);
                    System.out.println((i + 1) + ". " + hesap.getHesapNumarasi() + " - " + hesap.getHesapSahibi());
                }
                System.out.print("İşlem yapmak istediğiniz hesap numarası: ");
                int secim = scanner.nextInt();

                if(secim > 0 && secim <= hesaplar.size()){
                    seciliHesap = hesaplar.get(secim - 1);
                    System.out.println(seciliHesap.getHesapSahibi() + " hesabını seçtiniz.");
                }else{
                    System.out.println("geçersiz işlem tekrar deneyiniz.");
                    continue;
                }
            }

            //Menüyü göster
            System.out.println("1. Para Yatır");
            System.out.println("2. Para Çek");
            System.out.println("3. Bakiye Sorgula");
            System.out.println("4. Hesap değiştir.");
            System.out.println("5. Çıkış");
            System.out.println("6. İşlem Kaydı Görüntüleme");
            System.out.println("7. Hesap Ekleme");
            System.out.println("8. Hesap Ekleme");


            System.out.print("Bir seçim yapın: ");

            int secim = scanner.nextInt(); // Kullanıcıdan seçim al

            //Switch case ile işlemi belirler

            switch (secim){
                case 1:
                //Para Yatırma işlemi
                    System.out.print("Yatırmak istediğiniz miktar: ");
                    double yMiktar = scanner.nextDouble();
                    seciliHesap.paraYatir(yMiktar);

                    break;
                    case 2:

                        System.out.print("Çekilmek istenen tutar: ");
                        double cMiktar = scanner.nextDouble();
                        seciliHesap.paraCek(cMiktar);

                        break;
                        case 3:

                            seciliHesap.bakiyeSorgula();

                            break;
                case 4:
                    seciliHesap = null;
                    break;
                            case 5:
                                System.out.println("Çıkış yapılıyor...");
                                scanner.close();
                                return; // Döngüden çık ve programı sonlandır

                case 6:
                    seciliHesap.islemGecmisiniGOster();
                    break;

                    //hesap ekleme ve silme
                case 7:
                    System.out.println("Yeni hesap bilgilerini girin: ");
                    System.out.println("Hesap numarası: ");
                    String yHesapNumarasi = scanner.next();
                    System.out.print("Hesap Sahibi: ");
                    String yHesapSahibi = scanner.next();
                    System.out.print("Başlangıç bakiyesi: ");
                    double yBakiyesi = scanner.nextDouble();

                    hesaplar.add(new Account(yHesapNumarasi, yHesapSahibi, yBakiyesi));
                    System.out.println(yHesapSahibi + " adlı hesap başarıyla eklendi.");
                    break;

                case 8: //hesap silme
                    System.out.print("Silinmek istenen hesap numarası: ");
                    String silinecekHesapNumarasi = scanner.next();

                    Account silinecekHesap = null;

                    for (Account hesap : hesaplar){
                        if(hesap.getHesapNumarasi().equals(silinecekHesapNumarasi)){
                            silinecekHesap = hesap;
                            break;
                        }
                    }

                    if (silinecekHesap != null){
                        hesaplar.remove(silinecekHesap);
                        System.out.println(silinecekHesap.getHesapSahibi() + " adlı  başarıyla silindi silindi.");
                    }else{
                        System.out.println("Hesap bulunamadı.");
                    }


                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
            }



        }
    }
}
