package scannerMetodOlustur;

import java.util.Scanner;

public class Method8 {

    public static void main(String[] args) {

        //Soru 8 (Interview)-Kullanicidan iki sayi alip,
        // ucuncu bir degisken kullanmadan ikisinin
        //degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("bir tamsayı giriniz");
        int tamsayi1 = scanner.nextInt();

        System.out.println("bir tamsayı daha giriniz");
        int tamsayi2 = scanner.nextInt();

        tamsayi2=tamsayi1+tamsayi2;
        tamsayi1=tamsayi2-tamsayi1;
        tamsayi2=tamsayi2-tamsayi1;


        System.out.println("girilen sayıların yerleri degiştirildi; son durumda : " +
                "\nilk sayi: " + tamsayi1 +
                "\nikinci sayi: " +tamsayi2);


    }
}
