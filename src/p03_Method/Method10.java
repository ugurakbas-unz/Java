package p03_Method;

import java.util.Scanner;

public class Method10 {
    public static void main(String[] args) {

        //Soru 1-Kullanicidan cinsiyetini ve yasini alin,
        //       Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //       Cinsiyet ve yasini dikkate alarak
        //       “Emekli olabilirsin” veya
        //       “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.(metod)

        emeklilikHesapla();
    }

    private static void emeklilikHesapla() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("emeklilik hesabı için E yada K olarak cinsiyetinizi giriniz");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);
        System.out.println("emeklilik hesabı için yasınızı giriniz");
        int yas= scanner.nextInt();

        if (cinsiyet=='E'){
            if (yas>=65){
                System.out.println("Emekli olabilirsin");
            }else System.out.println("emekli olabilmen için " + (65-yas ) +" yıl daha calısman gerekiyor");

        } else if (cinsiyet=='K') {
            if (yas>=60){
                System.out.println("Emekli olabilirsin");
            }else System.out.println("emekli olabilmen için " + (60-yas ) +" yıl daha calısman gerekiyor");


        }else
            System.out.println("cinsiyeti E yada K olarak giriniz");
    }

}
