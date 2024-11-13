package bankasistemi;

public class BankaMusterisi {
    private String musteriAd;
    private String musteriSoyad;
    private Double hesapBakiyesi;

    public BankaMusterisi(String musteriAd, String musteriSoyad, Double hesapBakiyesi) {
        this.musteriAd = musteriAd;
        this.musteriSoyad = musteriSoyad;
        this.hesapBakiyesi = hesapBakiyesi;

    }

    public  String getMusteriAd() {
        return musteriAd;
    }
    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    public  String getMusteriSoyad() {
        return musteriSoyad;
    }
    public void setMusteriSoyad(String musteriSoyad) {
        this.musteriSoyad = musteriSoyad;
    }

    public Double getHesapBakiyesi() {
        return hesapBakiyesi;
    }
    public void setHesapBakiyesi(Double hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public void paraYatir (double miktar){
        hesapBakiyesi += miktar;
    }
    public void paraCek(double miktar){
        if (miktar > 0){
            if(miktar > hesapBakiyesi){
                System.out.println("Bu kadar paran yok FAKİR");
            }
            else{
                hesapBakiyesi = hesapBakiyesi - miktar;
                System.out.println("Çekilen miktar: " + miktar + " Güncel Bakiye:" + hesapBakiyesi);
            }
        }
        else{
            System.out.println("Geçersiz Miktar");
        }

    }
    public void hesapDurum(){
        if (hesapBakiyesi == 0){
            System.out.println("Hesap boş!");
        } else if (hesapBakiyesi > 0) {
            System.out.println("Hesap Bakiyesi: " + hesapBakiyesi);
            if (hesapBakiyesi > 1000){
                System.out.println("Birikim hesabınız sağlıklı görünüyor.");
            }
        }
    }
    public void hesapOzet(){
        System.out.println("Müşteri: " + getMusteriAd() + " " + getMusteriSoyad());
        System.out.println("Hesap Bakiyesi: " + getHesapBakiyesi());
    }

}
