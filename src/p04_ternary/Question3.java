package p04_ternary;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        // Soru 5-Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise
        //        onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin

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
