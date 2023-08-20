package p03_Method;

import java.util.Scanner;

public class Method2 {

    public static void main(String[] args) {

        // Soru 2-Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //        Kullanici o veya O yazdiginda output Ocak olsun.(if ile çözümü)

        harfAlAyYazdir();
    }

    private static void harfAlAyYazdir() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ay yazdırmak için bir harf giriniz");
        char girilenHarf=scanner.next().toLowerCase().charAt(0);

        if (girilenHarf=='o'){
            System.out.println("ocak");
        }
        if (girilenHarf=='s'){
            System.out.println("subat");
        }
        if (girilenHarf=='m'){
            System.out.println("mart");
        }
        if (girilenHarf=='n'){
            System.out.println("nisan");
        }
        if (girilenHarf=='m'){
            System.out.println("mayıs");
        }
        if (girilenHarf=='h'){
            System.out.println("haziran");
        }
        if (girilenHarf=='t'){
            System.out.println("temmuz");
        }
        if (girilenHarf=='a'){
            System.out.println("agust");
        }
        if (girilenHarf=='e'){
            System.out.println("eylul");
        }
        if (girilenHarf=='e'){
            System.out.println("ekim");
        }
        if (girilenHarf=='k'){
            System.out.println("kasım");
        }
        if (girilenHarf=='a'){
            System.out.println("aralık");

        }



    }
}
