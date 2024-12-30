import java.util.ArrayList;

public class Student {
    private String ad, soyad;
    private int numara;
    private int sinif;

    private ArrayList<Integer> notlar;

    public Student(String ad, String soyad, int numara, int sinif) {
        this.ad = ad;
        this.soyad = soyad;
        this.numara = numara;
        this.sinif = sinif;

        this.notlar = new ArrayList<>();
    }

    public String getAd() {
        System.out.println(ad);
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getNumara() {
        return numara;
    }
    public void setNumara(int numara) {
        this.numara = numara;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }



    public void notEkle (int not){
        notlar.add(not);
    }

    public void notlariGoster(){
        System.out.println("Öğrenci notlar: ");
        for (int not : notlar){
            System.out.println(not);
        }
    }

    public double ortalamaHesapla(){
        if (notlar.isEmpty()){
            return 0;
        }

        int toplam = 0;
        for (int not : notlar){
            toplam += not;
        }
        return (double) toplam / notlar.size();
    }

    public void durumBelirle(){
        double ortalama = ortalamaHesapla();
        if (ortalama >= 50){
            System.out.println("Durum: Geçti");
        }
        else{
            System.out.println("Durum: Kaldı");
        }
    }




}
