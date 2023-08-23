package p03_Method;

import java.util.Scanner;

public class Method1 {

    public static void main(String[] args) {

        // Soru 1-Kullanicidan bir sayi isteyin,
        //        sayiyi kontrol edip 5 ile bolunebiliyorsa
        //        “Sayi 5’in tam kati” yazdirin.

        sayiyiKontrolEt();
    }

    private static void sayiyiKontrolEt() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi%5==0) System.out.println("Sayi 5’in tam kati");
    }
}
