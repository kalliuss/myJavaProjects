package hayvanlar;

public class Hayvan {
    private String ad;
    private int yas;
    private String cinsiyet;

    public Hayvan(){

    }

    public Hayvan(String ad, int yas, String cinsiyet){
        this.ad = ad;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
    }

    public void sesCikar(){
        System.out.println(ad + "ses çıkardı");
    }

    public void hareketEt(){
        System.out.println(ad + "hareket et");
    }

    public void yemekYe(){
        System.out.println(ad + "yemek yedi");
    }

    // getterlar
    public String getAd(){
        return ad;
    }

    public int getYas(){
        return yas;
    }

    public String getCinsiyet(){
        return cinsiyet;
    }

    // setterlar

    public void setAd(String ad){
        this.ad = ad;
    }
    public void setYas(int yas){
        this.yas = yas;
    }
    public void setCinsiyet(String cinsiyet){
        this.cinsiyet = cinsiyet;
    }


}
