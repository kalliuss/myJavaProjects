package hayvanlar;

public class Kedi extends Hayvan{

    public Kedi(String ad, int yas, String cinsiyet) {
        // üst sınıftaki private değikenlere erişemeyecğeimiz için setter kullanacaz

        setAd(ad);
        setYas(yas);
        setCinsiyet(cinsiyet);
    }


    @Override // DENİYOR BUNA
    public void sesCikar(){
        System.out.println(getAd() + " Meeeeeoow");
    }
}
