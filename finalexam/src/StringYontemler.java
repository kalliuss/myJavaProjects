import java.sql.SQLOutput;

public class StringYontemler {

    public static void main(String[] args) {
        String ad = "Merhaba ";

        // **String manipülasyonu

        System.out.println(ad.toUpperCase()); //Büyük harfe çevir
        System.out.println(ad.length());  //uzunuluğu gösterir.
        System.out.println(ad.toLowerCase()); //Küçük harfe çevirir.
        System.out.println(ad.trim()); //Başındaki ve sonundaki boşlukları siler.
        System.out.println(ad.charAt(3)); //Belirilen indeksteki karakteri döner.
        System.out.println(ad.substring(0,4)); //0dan başlar ve 4'e kadar (4 dahil değil) stringin bir kısmını alır.

        // **String karşılaştırma

        // equals(String other) : İki stringin aynı olup olmadığını kontrol eder.
        // egualsIgnoreCase(String other) : Büyük/küçük harf duyarsız karşılaştırma yapar.
        // compareTo(String other) : Alfabetik sıralamaya göre karşılaştırma yapar. 0 dönerse eşittir. Negatif/pozitif dönerse farklıdır.

        String s1 = "Java";
        String s2 = "java";

        System.out.println("Eşit mi? " + s1.equals(s2)); // false
        System.out.println("Harf duyarsız eşitlik: " + s1.equalsIgnoreCase(s2)); // true
        System.out.println("Karşılaştırma: " + s1.compareTo(s2)); // -32

        // **String İçerik Kontrolü

        /*
        contains(String seq) : String içinde belirli bir ifadeyi arar.
        startsWith(String prefix) : String belirtilen ifadeyle başlıyor mu ?
        endsWith(String suffix) : String belirtilen ifadeyle bitiyor mu ?
         */

        String metin = "Java Programlama Dili";
        System.out.println("İçeriyor mu ? " + metin.equals("Program")); // true
        System.out.println("Java ile başlıyor mu ? " + metin.startsWith("Java")); // true
        System.out.println("Dili ile bitiyor mu ? " + metin.endsWith("Dili")); // true


        // **String Arama

        /*
        indexOf(String s) : Belirtilen ifadenin ilk indeksini döner.
        lastIndexOf(String s) : Belirtilen ifadenin son indeksini döner.
         */

        String metin2 = "Java Programlama Dili";

        System.out.println("Program'ın İlk İndeksi " + metin2.indexOf("Program")); //5
        System.out.println("i'nin son indeksi " + metin.lastIndexOf("i")); //20

        // **String Değiştirme

        // replace(char oldChar, char newChar) : Belirtilen karakterleri değiştirir.
        // replaceAll(String regex, String replacement) : Belirtilen desenle eşleşen kısımları değiştirir.

        System.out.println("a'ları x ile ddeğiştir: " + metin2.replace('a', 'x')); // Jxvx Progrxmglm Dili
        System.out.println("Tüm boşlukları kaldır: " + metin.replaceAll(" ", "")); // JavaProgramlamaDili


    }
}
