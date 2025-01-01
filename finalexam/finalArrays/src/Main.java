import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] isimler = {"Cemal", "Banu", "Ayşe", "Ferit", "Emel"};

        System.out.println(isimler[1]); //banu

        isimler[1] = "Caner";

        System.out.println(isimler[1]); //caner
        System.out.println(isimler.length); //5

        // **Arrays.toString()

        double[] fiyatlar = {13.15, 15.87, 14.22, 16.66};

        System.out.println(Arrays.toString(fiyatlar));
        //System.out.println(Arrays.toString(isimler));

        ArrayList<String> arabaListe = new ArrayList<>();
        arabaListe.add("ferrari"); // [ferrari]
        arabaListe.add("fiat"); // [ferrari, fiat]

        arabaListe.add(1, "opel"); // [ferrari, opel, fiat] //önceki 1 yana kaydı.
        arabaListe.add(2, "porsche"); // [ferrari, opel, porsche, fiat] olur.

        ArrayList<String> isimler2 = new ArrayList<>();
        isimler2.add(0, "Cemal");
        isimler2.add(1, "Banu");
        isimler2.add(2, "Ayşe");
        isimler2.add(3, "Ferit");
        isimler2.add(4, "Ender");



        System.out.println(isimler2);
        System.out.println("İismler2 öge sayısı: " + isimler2.size()); //.size öge sayısı döndürür.
        System.out.println("İismler2 2. indeksdeki öge: " + isimler2.get(2)); //indeksdeki ögeyi çağırma

        //isimler2.remove(2); // indekse karşılık gelen ögeyi dizeden siler.
        //isimler2.remove("Ayşe"); // yapılabilir.
        //System.out.println(isimler2);
        //System.out.println(isimler2.size()); // 1 öge silinde toplam öge 4'e düştü

        isimler2.set(1, "Caner"); //1. indeksi caner yaptı
        System.out.println(isimler2);



    }
}