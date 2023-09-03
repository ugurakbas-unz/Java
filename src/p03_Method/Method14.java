package p03_Method;

import java.util.Scanner;

public class Method14 {

    public static void main(String[] args) {

        //Soru 3-Kullanicidan bir sayi alin
        //       sayi tek ise negatif veya pozitif tek sayi mi oldugunu yazdirin,
        //       sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin.

        sayiyiKontrolEt();
    }

    private static void sayiyiKontrolEt() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz");
        double girilenSayi= scanner.nextDouble();

        if (girilenSayi%2==0) {
            if (girilenSayi % 10 == 0) {
                System.out.println("girilen sayı 10 un tam katı");
            } else
                System.out.println("girilen sayı 10 un tam katı degil");

        }else
        if (girilenSayi>0){
            System.out.println("girilen sayı pozitif tek sayı");

        }else if(girilenSayi<0){
            System.out.println("girilen sayı negatif tek sayı");
        }

    }
}
