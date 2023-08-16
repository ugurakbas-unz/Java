package p02_method;

import java.util.Scanner;

public class Method4 {

    public static void main(String[] args) {

        // Soru 4
        //        Kullanicidan iki double sayi alin,
        //        ilk sayiyi ikinci sayiya bolun ve
        //        bolme isleminin sonucununun tamsayi kismini yazdirin.

        ikiSayiyiBol();
    }

    private static void ikiSayiyiBol() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter tusunu kullanarak iki ondalıklı sayı giriniz ");
        double ond1 = scanner.nextDouble();
        double ond2 = scanner.nextDouble();

        int sonuc=(int)(ond1/ond2);

        System.out.println(" bolme isleminin sonucununun tamsayi kismi : "+ sonuc);

    }
}
