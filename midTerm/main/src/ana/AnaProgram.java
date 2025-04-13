package ana;
import hayvanlar.*; // Kedi, köpek, kus, koyun sınıflarını içeri aktardık.
import yonetim.HayvanatBahcesi; // HayvanatBahcesi sınıfını içeri aktardık.

public class AnaProgram {
    public static void main(String[] args) {

        // hayvanat bahçesi nesnesi oluşturuluyor

        HayvanatBahcesi bahce = new HayvanatBahcesi();

        // Hayvalar nesneleri oluşturuluyor

        Kedi kedi1 = new Kedi("Minnoş", 3, "Dişi");
        Kopek kopek1 = new Kopek("Karabaş", 5, "Erkek");
        Kus kus1 = new Kus("Cikcik", 1, "Dişi");
        Koyun koyun1 = new Koyun("Pamuk", 4, "Erkek");


        // hayvanları hayvanat bahçesine ekleyelim.

        bahce.hayvanEkle(kedi1);
        bahce.hayvanEkle(kopek1);
        bahce.hayvanEkle(kus1);
        bahce.hayvanEkle(koyun1);

        // Hayanları Listele
        System.out.println("\n--- Hayvanlar Listeleniyor ---");
        bahce.hayvanlariListele();

        // Tüm hayvanalra ses çıkarmasını sağla
        System.out.println("\n--- Tüm hayvanlar ses çıkarıyor ---");
        bahce.tumHayvanlariSesCikarttir();
    }
}
