package p03_ifElseStatements;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("emeklilik hesabı için yasınızı giriniz");
        int yas= scanner.nextInt();

        if (yas>=65){
            System.out.println("Emekli olabilirsin");

        }else System.out.println("emekli olabilmen için " + (65-yas ) +" yıl daha calısman gerekiyor" );

    }
}
