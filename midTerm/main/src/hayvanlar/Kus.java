package hayvanlar;

public class Kus extends Hayvan{

    public Kus(String ad, int yas, String cinsiyet) {
        // üst sınıftaki private değikenlere erişemeyecğeimiz için setter kullanacaz

        setAd(ad);
        setYas(yas);
        setCinsiyet(cinsiyet);
    }

    public void sesCikar(){
        System.out.println(getAd() + " cik cik cik CİİİK");
    }
}
