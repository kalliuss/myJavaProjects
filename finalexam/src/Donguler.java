import java.sql.SQLOutput;

public class Donguler {
    public static void main(String[] args) {

        /* 1- For Döngüsü - Amaç; belirli bir başlangıç, bitiş ve
        artış/değişim koşuluyla tekrar eden işlemleri yapmak. */
        System.out.println("*** For Döngüsü ***");
        /*
        for (baslangic ; kosul; artış/azalış){

        }*/

        for(int i = 0; i < 5; i++){
            System.out.println("Merhaba");
            //ekrana 5 kez merhaba yazılacak
            //0 dan başlattığım için 5 kez yazıldı 1 den başlatsam 4 kez yazılırdı.
            // 0,1,2,3,4
        }


        /* 2- While Döngüsü - Amaç; Koşul doğru olduğu sürece işlemleri tekrarlar*/
        System.out.println("*** While Döngüsü ***");
        /* while(koşul) {}*/

        int i = 0;
        while (i < 5){
            System.out.println("Sayı: " + i);
            i++;
            // 0 itibariyle  4'e kadar sayacak.
        }

        /* 3- Do-While Döngüsü - Amaç: En az bir kere çalışması gereken işlemleri tekrarlar.*/
        System.out.println("*** Do-While Döngüsü ***");
        /*
        do{
        //tekrarlanacak işlem
        }while(kosul)
        */

        int k = 0;
        do{
            System.out.println("Sayı: " + k);
            k++;

            //2 kez 5'e kadar sayacak ilk sayım do dan kaynaklı ikinci sayım while dan
        }while(k < 5);

        /* 4- Foreach Döngüsü - Amaç: Dizi veya koleksiyonlardaki her bir elemanı dolaşmak için kullanılır. */
        System.out.println("*** Forreach Döngüsü ***");
        /*
        for (verTipi eleman : koleksiyon){
        //tekrarlanacak işlemler
        }
        */

        int[] sayilar = {10, 20, 30, 40};
        for (int sayi : sayilar){
            System.out.println("Sayı: " + sayi);
        }

        // dizi içindeki her bir eleman sayi değişkenine atanır.
        // döngü her çalıştığında dizi elamanları sırayla kullanılır.


    }
}
