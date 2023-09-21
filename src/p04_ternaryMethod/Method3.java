package p04_ternaryMethod;

import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {

        // Soru 5-Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise
        //        onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin (method)

        girilenHarfiYadir();

    }

    private static void girilenHarfiYadir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char girilenHarf = scanner.next().charAt(0);


        if (girilenHarf >= 'a' && girilenHarf <= 'z') {
            System.out.println("girilen harf büyük harfe cevrildi: " + ("" + girilenHarf).toUpperCase());

        } else if (girilenHarf >= 'A' && girilenHarf <= 'Z') {
            System.out.println("girilen harf : " + girilenHarf);

        }else System.out.println("yanlış karakter girdirdiniz harf giriniz");
    }
}

