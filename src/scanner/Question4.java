package scanner;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        //Soru 4-Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        //       dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("dikdörtgenin kısa ve uzun kenar uzunluklarını girip enter tusuna basınız");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        double dikdortgeninAlani=kenar1*kenar2;

        System.out.println("girilen degerlere göre dikdortgenin alani = "+ dikdortgeninAlani);

    }
}
