package p02_dataCastingmethod;

import java.util.Scanner;

public class Method3 {

    public static void main(String[] args) {

        intSayiyiByteCastingYap();
    }

    private static void intSayiyiByteCastingYap() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scanner.nextInt();

        byte casting=(byte) sayi;
        System.out.println("sayı byte a cast edildi _ sonuç = "+ casting);

    }
}
