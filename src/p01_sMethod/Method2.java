package p01_sMethod;

import java.util.Scanner;

public class Method2 {

    public static void main(String[] args) {

        // Soru 2-Kullanicidan bir double, bir de int sayi alip
        //        bunlarin toplamini ve carpimini yazdirin.(metod)

        doubleVeIntToplaCarp();
    }

    private static void doubleVeIntToplaCarp() {

        Scanner scanner =new Scanner(System.in);
        System.out.print("bir double sayi giriniz : ");
        double girilenDbl= scanner.nextDouble();
        System.out.print("bir int sayi giriniz : ");
        int girilenInt= scanner.nextInt();

        System.out.println("girilen sayıların çarpımı = "+ girilenDbl*girilenInt+
                "\ngirilen sayıların toplamı = "+ (girilenDbl+girilenInt));
    }
}
