package p04_ternaryMethod;

import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {

        //Soru 1-Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //       “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.(Method)

        eskenaeMiDegilMi();
    }

    private static void eskenaeMiDegilMi() {
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
