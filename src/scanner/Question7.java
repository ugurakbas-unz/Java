package scanner;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        // Soru 7 (Interview)
        //      -Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("bir tamsayı giriniz");
        int tamsayi1 = scanner.nextInt();

        System.out.println("bir tamsayı daha giriniz");
        int tamsayi2 = scanner.nextInt();

        int temp=tamsayi1;

        tamsayi1=tamsayi2;

        tamsayi2=temp;


        System.out.println("girilen sayılar degiştirildi : " +
                "\nilk sayi: " + tamsayi1 +
                "\nikinci sayi: " +tamsayi2);






    }
}

