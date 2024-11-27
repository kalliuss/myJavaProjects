import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği
//        şifrenin unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip, şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
//        sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

        String name, password, cevap, yenisifre, name2, password2;
        Scanner input = new Scanner(System.in);
        name2 = "Kaan";
        password2 = "1881";

        System.out.println("Kullanıcı Adı: ");
        name = input.nextLine();
        System.out.println("Şifre: ");
        password = input.nextLine();

        if (name.equals(name2)&& password.equals(password2)) {
            System.out.println("Şifre doğru sisteme hoşgeldiniz:)");
        }
        else if (name.equals("Kaan") && !password.equals("1881")) {
            System.out.println("Şifreniz yanlış sıfırlamak ister misiniz ? ");
            cevap = input.nextLine();

            switch (cevap){

                case "evet", "Evet", "EVET":
                    System.out.println();
                    System.out.println("Yeni şifreniz: ");
                    yenisifre = input.nextLine();

                    if (yenisifre.equals(password2)) {
                        System.out.println("Aynı şifreyi kullanamazsın lütfen tekrar başlatıp başka şifre giriniz.");
                    }else
                        System.out.println("Şifreniz başarıyla değiştirildi.");
                    break;

                case "hayır", "hayir", "HAYIR":
                    System.out.println("Şifreniz sıfırlanmayacaktır.");
                    break;

                default:
                    System.out.println("hatalı giriş yaptınız lütfen evet/hayır yazın.");
                    break;
            }
        }

    }
}