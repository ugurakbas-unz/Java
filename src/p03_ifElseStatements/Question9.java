package p03_ifElseStatements;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

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
