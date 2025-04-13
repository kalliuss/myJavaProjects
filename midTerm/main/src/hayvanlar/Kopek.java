package hayvanlar;

public class Kopek extends Hayvan{

    public Kopek(String ad, int yas, String cinsiyet) {
        // üst sınıftaki private değikenlere erişemeyecğeimiz için setter kullanacaz

        setAd(ad);
        setYas(yas);
        setCinsiyet(cinsiyet);
    }

    public void sesCikar(){
        System.out.println(getAd() + " Havhavhav hırr");
    }
}
