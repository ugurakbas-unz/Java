package p04_ternary;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        //Soru 1-Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //       “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir ucgenin kenarlarını giriniz");
        System.out.print("kenar 1 : ");
        int kenar1 = scanner.nextInt();

        System.out.print("kenar 2 : ");
        int kenar2 = scanner.nextInt();

        System.out.print("kenar 2 : ");
        int kenar3 = scanner.nextInt();

        System.out.println(kenar1 == kenar2 && kenar1 == kenar3 ?
                         "ucgen eskenar" : "ucgen eskenar degil");


    }
}
