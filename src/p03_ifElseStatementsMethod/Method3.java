package p03_ifElseStatementsMethod;

import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {

        //Soru 3-Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //       sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.(method)

        sayi3eMiBolunyor5eMi();
    }

    private static void sayi3eMiBolunyor5eMi() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz");
        int girilenSayi= scanner.nextInt();

        if (girilenSayi%5==0){
            System.out.println("Bes ile bolunebilen sayi");

        }
        if (girilenSayi%3==0) {
            System.out.println("Uc ile bolunebilen sayı");
        }
    }
}
