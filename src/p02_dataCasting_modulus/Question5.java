package p02_dataCasting_modulus;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        //Soru 5-Kullanicidan bir double, bir  tamsayi alin,
        // double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter tusunu kullanarak bir ondalıklı bir de tamsayı giriniz ");
        double ond1 = scanner.nextDouble();
        int tamsayi = scanner.nextInt();

        int sonuc=(int) (ond1/tamsayi);
        System.out.println("bolum isleminin sonucununun tamsayi kismi : "+sonuc);
    }
}
