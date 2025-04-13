package yonetim;

import hayvanlar.Hayvan;

public class HayvanatBahcesi {

    private Hayvan[] hayvanlar; // en fazla 5 hayvan tutacak
    private int index; // kaç hayvan var bilgisini tutar

    public HayvanatBahcesi(){
        hayvanlar = new Hayvan[5];
        index = 0;
    }

    // hayvan ekleme metodu

    public void hayvanEkle(Hayvan hayvan){
        if (index < hayvanlar.length){
            hayvanlar[index] = hayvan;
            System.out.println(hayvan.getAd() + " hayvan hayvanat bahçesine eklendi");
            index++;
        }else {
            System.out.println("Hyavanat bahçesi dolu! Yeni hayvan eklenemez");
        }
    }

    // Hayvanları listeleme

    public void hayvanlariListele(){
        System.out.println("Hayvanat bahçesindeki Hayvanlar:");
        for (int i = 0; i < index; i++) {
            Hayvan h = hayvanlar[i];
            System.out.println((i + 1) + ". " + h.getAd() + " - " +h.getCinsiyet() + " - Yaş: " + h.getYas());
        }
    }

    // tün hayvanları ses çıkarttıran metot

    public void tumHayvanlariSesCikarttir(){
        System.out.println("Tüm hayvanlar ses çıkarıyor:");
        for (int i = 0; i < index; i++) {
            hayvanlar[i].sesCikar();
        }
    }
}
