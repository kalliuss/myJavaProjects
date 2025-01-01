public class Main {
    public static void main(String[] args) {
        String ad = "Kaan";
        int yas = 19;
        double not = 56.5;
        boolean mezunDurum = true;

        if (mezunDurum == true){
            System.out.println("Mezun olmuş.");
        }else {
            System.out.println("Mezun olamamıştır");
        }

        calisan kaan =  new calisan();

        kaan.setMaas(1500.0);
        System.out.println(kaan.getMaas());


        System.out.println("Ad: " + ad + " Yaş: " + yas + " Not: " + not + " Mezun: " + mezunDurum);
    }
}
