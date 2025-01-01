public class Araba {
    String marka;
    int model;

    void bilgiYazdir(){
        System.out.println("Marka: "+marka + " Model: " + model);

    }

    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.marka = "Audi";
        araba.model = 2017;
        araba.bilgiYazdir();
    }
}
