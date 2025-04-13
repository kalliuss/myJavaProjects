package hayvanlar;

public class Koyun extends Hayvan{

    public Koyun(String ad, int yas, String cinsiyet) {
        // üst sınıftaki private değikenlere erişemeyecğeimiz için setter kullanacaz

        setAd(ad);
        setYas(yas);
        setCinsiyet(cinsiyet);
    }

    public void sesCikar(){
        System.out.println(getAd() + " Meeeeeeee!");
    }

}
