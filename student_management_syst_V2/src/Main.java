import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
             OgrenciYonetimi yonetim = new OgrenciYonetimi();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            //menu seçenekleri yazdırma

            System.out.println("\n=== Öğrenci Yönetim Sistemi ===");
            System.out.println("1. Öğrenci Ekle");
            System.out.println("2. Öğrencileri Listele");
            System.out.println("3. Öğrenci Ara");
            System.out.println("4. Öğrenci Sil");
            System.out.println("5. Öğrenciye Not Ekle");
            System.out.println("6. En Başarılı Öğrenciyi Bul");
            System.out.println("7. Genel Ortalama Hesapla");
            System.out.println("8. Çıkış");
            System.out.print("Seçiminizi yapın: ");

            int secim = scanner.nextInt();

            if(secim == 1) {
                System.out.print("Ad: ");
                String ad = scanner.next();
                System.out.print("Soyad: ");
                String soyad = scanner.next();
                System.out.print("Numara: ");
                int numara = scanner.nextInt();
                System.out.print("Sınıfı: ");
                int sinif = scanner.nextInt();

                Student yeniOgrenci = new Student(ad, soyad, numara, sinif);
                yonetim.ogrenciEkle(yeniOgrenci);

            }else if(secim == 2) {
                yonetim.ogrencileriListele();

            }else if(secim == 3) {
                System.out.print("Aranacak öğrenci numarasını girin: ");
                int numara = scanner.nextInt();
                Student bulunanOgrenci = yonetim.ogrenciAra(numara);

                if(bulunanOgrenci != null) {
                    System.out.println("Ad: " + bulunanOgrenci.getAd());
                    System.out.println("Soyad: " + bulunanOgrenci.getSoyad());
                    System.out.println("Numara: " + bulunanOgrenci.getNumara());
                    System.out.println("Sinif: " + bulunanOgrenci.getSinif());
                }else{
                    System.out.println("Öğrenci bulunamadı.");
                }

            }else if (secim == 8) {
                System.out.println("Çıkış yapılıyor...");
                break;
            }

            if (secim == 5) {
                System.out.print("Not eklemek istediğiniz öğrencinin numarasını girin: ");
                int numara = scanner.nextInt();
                System.out.print("Eklemek istediğiniz notu girin: ");
                int not = scanner.nextInt();
                yonetim.ogrenciyeNotEkle(numara, not);

            } else if (secim == 6) {
                yonetim.enBasariliOgrenciyiBul();

            } else if (secim == 7) {
                yonetim.genelOrtalamaHesapla();
            }
            if (secim == 4) {
                System.out.print("Silmek istediğiniz öğrencinin numarasını girin: ");
                int numara = scanner.nextInt();
                yonetim.ogrenciSil(numara);
            }
            if(secim == 1 || secim== 2 || secim == 3 || secim == 4 || secim == 5 || secim == 6 || secim == 7 || secim == 8){
                System.out.println("Doğru seçim devam ediyoruz.");
            }else{
                System.out.println("Geçersiz seçim tekrar deneyin.");
            }
        }

            scanner.close();
    }
}

