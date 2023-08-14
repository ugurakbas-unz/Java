package p02_dataCasting_modulus;

import java.util.Scanner;

public class Questions3 {

    public static void main(String[] args) {

        //Soru 3-Kullanicidan bir sayi alin,
        //       kullanici kac degerini girerse girsin,
        //       o sayiyi -128 ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scanner.nextInt();

        byte casting=(byte) sayi;
        System.out.println("sayı byte a cast edildi _sonuç = "+ casting);

    }
}
