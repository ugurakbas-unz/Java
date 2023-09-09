package p04_ternary;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        // Soru 1-Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //       “Sayi 5’in tam kati” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir tamsyı giriniz");
        int sayi= scanner.nextInt();

        System.out.println(sayi%5==0 ? "Sayi 5’in tam kati" : "");

    }
}
