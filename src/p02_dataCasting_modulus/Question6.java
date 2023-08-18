package p02_dataCasting_modulus;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        // Soru 1-Kullanicidan 4 basamakli pozitif bir tamsayi alip
        //        rakamlar toplamini bulalim

        Scanner scanner = new Scanner(System.in);
        System.out.println("dört basamaklı sayı giriniz");
        int girilenSayi= scanner.nextInt();

        int sayi=girilenSayi;
        int birlerBsmg=0;
        int rakamlarTplm=0;

        birlerBsmg=sayi%10;
        rakamlarTplm=birlerBsmg+rakamlarTplm;
        sayi=sayi/10;

        birlerBsmg=sayi%10;
        rakamlarTplm=birlerBsmg+rakamlarTplm;
        sayi=sayi/10;

        birlerBsmg=sayi%10;
        rakamlarTplm=birlerBsmg+rakamlarTplm;
        sayi=sayi/10;

        birlerBsmg=sayi%10;
        rakamlarTplm=birlerBsmg+rakamlarTplm;
        sayi=sayi/10;

        System.out.println(girilenSayi+" sayısının rakamlar toplamı : "+ rakamlarTplm);


    }

}
