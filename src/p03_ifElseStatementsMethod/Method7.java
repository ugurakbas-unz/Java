package p03_ifElseStatementsMethod;

import java.util.Scanner;

public class Method7 {

    public static void main(String[] args) {

        // Soru 3-Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //        yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.(method)

        emekliMi();
    }

    private static void emekliMi() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("emeklilik hesabı için yasınızı giriniz");
        int yas= scanner.nextInt();

        if (yas>=65){
            System.out.println("Emekli olabilirsin");

        }else System.out.println("emekli olabilmen için " + (65-yas ) +" yıl daha calısman gerekiyor" );

    }
}
