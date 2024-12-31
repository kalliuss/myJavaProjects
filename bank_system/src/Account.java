import java.util.ArrayList;

public class Account {

    private String hesapNumarasi;
    private String hesapSahibi;
    private double bakiye;
    private ArrayList<String> islemGecmisi; //işlem geçmişi

    public Account(String hesapSahibi, String hesapNumarasi, double bakiye) {
        this.hesapSahibi = hesapSahibi;
        this.hesapNumarasi = hesapNumarasi;
        this.bakiye = bakiye;
        this.islemGecmisi = new ArrayList<>(); //işlem geçmişini başlat
    }

    //get ve setterlar
    public String getHesapNumarasi() {
        return hesapNumarasi;
    }

    public void setHesapNumarasi(String hesapNumarasi) {
        this.hesapNumarasi = hesapNumarasi;
    }

    public void setHesapSahibi(String hesapSahibi) {
        this.hesapSahibi = hesapSahibi;
    }

    public String getHesapSahibi() {
        return hesapSahibi;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    //para çekme, yatırma, bakiye sorgulama
    public void paraCek(double miktar){
        if(miktar > 0 && bakiye >= miktar){
            bakiye -= miktar;
            islemGecmisi.add(miktar + " TL çekildi.");
            System.out.println("Çekilen tutar: " + miktar);
            System.out.println("Güncel hesap bakiyesi: " + bakiye);
        }else{
            System.out.println("Yetersiz bakiye vya geçersiz miktar!");
        }
    }

    public void bakiyeSorgula(){

        System.out.println("Güncel hesap bakiyesi: " + bakiye);
        islemGecmisi.add("Bakiyeye bakıldı: " + bakiye + " TL");
    }

    public void paraYatir(double miktar){
        bakiye = bakiye + miktar;
        islemGecmisi.add(miktar + " TL yatırıldı."); //log
        System.out.println("Yatırılan tutar: " + miktar);
        System.out.println("Güncel hesap bakiyesi: " + bakiye);
    }

    //işlem geçmişini görüntüleme metodu
    public void islemGecmisiniGOster(){
        System.out.println("İşlem geçmişi:");
        if (islemGecmisi.isEmpty()){
            System.out.println("Su gibi tertemiz henüz işlem yapılmamış.");
        }else{
            for(String islem : islemGecmisi){
                System.out.println(" -> " + islem);
            }
        }
    }
}
