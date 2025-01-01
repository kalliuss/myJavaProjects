public class WrapperClasses {
    public static void main(String[] args) {
        // ** Sarmalıyıcı sınıf örnek kullanımları

            //** İlkel tipleri nesnelere dönüştürme

            int sayi = 10;
            Integer sarmalSayi = Integer.valueOf(sayi); //ilkelden nesneye
            System.out.println("Sarmalaşmış sayı: " + sarmalSayi);


            //** Nesneleri ilkel yapma

            Integer sarmalSayi2 = Integer.valueOf(20);
            int sayi2 = sarmalSayi2.intValue(); // nesnelden ilkele
            System.out.println("İlkel Sayı: " + sayi2);


            //** Otomatik Sarmalama ve Çözme (Autoboxing/Unboxing)

            //Autoboxing : İlkel tip, otomatik olarak sarmalıyıcı sınıfa dönüştürülür.
            //Unboxing : Sarmalaıcı sınıf otomatik olarak ilkel tipe dönüştürülür.

            //Autoboxing
            int sayi3 = 10;
            Integer sarmalSayi3 = sayi3; //otomatik sarmalama

            //Unboxing
            Integer yeniSayi = 30;
            int ilkelSayi = yeniSayi; //otomatik çözme

            System.out.println("Autoboxing: " + sarmalSayi3);
            System.out.println("Unboxing: " + ilkelSayi);

            // **String'den İlkele Dönüştürme

            String sayiMetin = "123";
            int sayi4 = Integer.parseInt(sayiMetin); // String -> int
            System.out.println("Dönüştürülmüş sayı: " + sayi4);

            // **String'den Nesneye
            String sayiMetin2 = "45";
            Integer sarmalSayi4 = Integer.valueOf(sayiMetin2); // String -> Integer
            System.out.println("Sarmalanmış sayı: " + sarmalSayi4);

            // Sayıyı string yapma
            int s = 123;
            String sayiString = String.valueOf(s);
            System.out.println("String: " + sayiString);

            // Integer.toString();
            int s2 = 15;
            String sayiString2 = Integer.toString(s2);
            System.out.println("String2: " + sayiString2);

            // Double.toString()
            double d = 10.34;
            String dayiString = Double.toString(d);
            System.out.println("String: " + dayiString);

            // +""

            int s3 = 15;
            String intSayi = sayi + "";
            System.out.println("String: " + intSayi);

            // int -> double
            int sayi7 = 42;
            double sonuc = sayi7;
            System.out.println("İnt -> double: " + sonuc);

            // double -> int (manuel yapılır çünkü veri kaybı olabilir.)
            double dSayi = 42.75;
            int sonuc2 = (int) dSayi;
            System.out.println("Double -> int: " + sonuc2);

    }
}
