package p03_ifElseStatements;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        // Soru 4-Kullanicidan bir karakter girmesini isteyin,
        //        girilen karakterin buyuk harf olup olmadigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char girilenKrktr = scanner.next().charAt(0);

        if (girilenKrktr>='A' && girilenKrktr<='Z'){
            System.out.println("girilen karakter büyük harf");

        }else System.out.println("girilen karakter büyük harf değil");

    }
}
