import java.util.ArrayList;

public class Arrays {

    //Diziler sabit uzunluktadır; Dizi listeleri ise dinamik uzunluktadır.
    public static void main(String[] args) {
        int[] sayilar = {1, 2, 3, 4};
        System.out.println(sayilar[0]); // ilk eleman

        //en büyük bulma
        int enBuyuk = sayilar[1];

        for(int i = 1; i < sayilar.length; i++){
            if(sayilar[i] > enBuyuk){
                enBuyuk = sayilar[i]; //yeni en büyük değer
            }
        }
        System.out.println("En büyük sayı: " + enBuyuk);

        //dizi listesi

        ArrayList<String> isimler = new ArrayList<>();

        isimler.add("Ali");
        isimler.add("Ayşe");

        System.out.println(isimler.get(0)); //ilk eleman
    }


}
