import java.io.BufferedReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class OgrenciYonetimi {

    ArrayList<Student> ogrenciler;

    public OgrenciYonetimi() {
        ogrenciler=new ArrayList<>();
    }

    public void ogrenciEkle(Student ogrenci){
        ogrenciler.add(ogrenci);
        System.out.println(ogrenci.getAd() + "listeye eklendi.");
    }

    public void ogrencileriListele(){
        System.out.println("Tüm Öğrenciler");
        for(Student ogrenci : ogrenciler){
            System.out.println("Ad: " + ogrenci.getAd() + ", Soyad: " + ogrenci.getSoyad() +
                    ", Numara: " + ogrenci.getNumara() + ", Sınıf: " + ogrenci.getSinif());
        }
    }

    public Student ogrenciAra(int numara){
        for(Student ogrenci : ogrenciler){
            if(ogrenci.getNumara() == numara){
                return ogrenci;
            }
        }
        return null;
    }


    public void ogrenciyeNotEkle (int numara, int not){
        Student ogrenci = ogrenciAra(numara);
        if(ogrenci != null){
            ogrenci.notEkle(not);
            System.out.println(ogrenci.getAd() + " adlı öğrenciye " + not + " notu eklendi.");


        }else{
            System.out.println("Öğrenci bulunamadı");
        }
    }

    //en başarılı öğrenciyi  bulma
    public void enBasariliOgrenciyiBul(){
        if (ogrenciler.isEmpty()){
            System.out.println("Hiç öğrenci yok.");
            return;
        }

        Student enBasarili = ogrenciler.get(0);

        for(Student ogrenci : ogrenciler){
            if(ogrenci.ortalamaHesapla() > enBasarili.ortalamaHesapla()){
                enBasarili = ogrenci;
            }
        }

        System.out.println("En başarılı öğrenci: " + enBasarili.getAd() + " " + enBasarili.getSoyad());
        System.out.println("Ortalaması: "+ enBasarili.ortalamaHesapla());
    }

    //tüm öğrencilerin genel ortalama hesaplama

    public void genelOrtalamaHesapla(){
        if (ogrenciler.isEmpty()){
            System.out.println("Hiç öğrenci yok.");
            return;
        }

        double toplam = 0;
        int ogrenciSayisi = 0;

        for (Student ogrenci : ogrenciler){
            toplam += ogrenci.ortalamaHesapla();
            ogrenciSayisi++;
        }

        double genelOrtalama = toplam / ogrenciSayisi;
        System.out.println("Tüm öğrencilerin genel ortalaması: " + genelOrtalama);
    }

    public void ogrenciSil(int numara){
        Student ogrenci = ogrenciAra(numara);
        if(ogrenci != null){
            ogrenciler.remove(ogrenci);
            System.out.println(ogrenci.getAd() + " adlı öğrenci listeden silindi.");
        }
        else{
            System.out.println("öğrenci bulunmadı.");
        }
    }


}
