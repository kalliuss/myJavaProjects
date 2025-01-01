public class MathIslev {

    public static void main(String[] args) {

        // **temel matematiksel yöntemler

    /*

    Math.abs(double a) : Mutlak değer döner.
    Math.pow(double a, double b) : a üzeri b 'yi hesaplar.
    Math.sqrt(double a) : kare kökünü alır.
    Math.cbrt(double a) : küp kökünü alır.

     */

        System.out.println("Mutlak değer: " + Math.abs(-10)); // 10
        System.out.println("2 üzeri 3: " + Math.pow(2,3)); // 8.0
        System.out.println("16 nın Karekökü: " + Math.sqrt(16)); // 4.0
        System.out.println("27'nin Küp kökü: " + Math.cbrt(27)); // 3.0

    // **yuvarlama yöntemleri

    /*

     Math.ceil(double a) : Yukarı yuvarlar.
     Math.floor(double a) : Aşağı yuvarlar.
     Math.round(double a) : En yakın tam sayıya yuuvarlar.

     */

        System.out.println("Yukarı yuvarla: " + Math.ceil(4.3)); // 5
        System.out.println("Aşağı yuvarla: " + Math.floor(4.7)); // 4
        System.out.println("Yakın yuvarla: " + Math.round(4.5)); // 5

    // **Rastgele sayılar

    /*

    Math.random(): 0.0 - 1.0 arasında rastgele bir sayı döner.

     */

    double rastgeleSayi = Math.random() * 100; // 0 - 100 arası
        System.out.println("Rastgele sayı: " + rastgeleSayi);

    }
}
