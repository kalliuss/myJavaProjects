public class KalitimPolimorfizm {
    // Kalıtım bir sınıfın başka bir sınıftan özellikler almasıdır.

    // Polimorfizm, aynı isimli yöntemlerin farklı davranışlar göstermesidir.

    class Hayvan{
        void sesCikar(){
            System.out.println("Hayvan ses çıkarıyor.");
        }
    }

    class Kedi extends Hayvan{
        void sesCikar(){
            System.out.println("Miyav");
        }
    }

    class Kopek extends Hayvan{
        void sesCikar(){
            System.out.println("Hav hav");
        }
    }

    public static void main(String[] args) {
        KalitimPolimorfizm program = new KalitimPolimorfizm();
        Kedi kedi1 = program.new Kedi();
        Kopek kopek1 = program.new Kopek();
        Hayvan hayvan1 = program.new Hayvan();
        kedi1.sesCikar();
        kopek1.sesCikar();
        hayvan1.sesCikar();
    }

}
