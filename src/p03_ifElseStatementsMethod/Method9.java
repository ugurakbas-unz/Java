package p03_ifElseStatementsMethod;

import java.util.Scanner;

public class Method9 {

    // Soru 5-Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise
    //        onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin
    public static void main(String[] args) {

        harfiDuzenle();

    }
    public static void harfiDuzenle(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char girilenKrktr = scanner.next().charAt(0);

        if (girilenKrktr>='a' && girilenKrktr<='z'){
            System.out.println("girilen harf büyük harfe çevrildi: "+ (girilenKrktr+"").toUpperCase());
        } else if (girilenKrktr>='A' && girilenKrktr<='Z') {
            System.out.println("girilen harf: "+ girilenKrktr);

        }else System.out.println("yanlış giriş yaptınız");


    }

}
