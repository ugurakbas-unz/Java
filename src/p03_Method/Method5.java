package p03_Method;

import java.util.Scanner;

public class Method5 {

    public static void main(String[] args) {

        // Soru 5-Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        //        //        50’den kucukse “Maalesef kaldin” yazdirin.(Method)

        sinifiGectimi();
    }

    private static void sinifiGectimi() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" tamsayı olarak notunuzu giriniz");
        int not= scanner.nextInt();

        if (not>=50){
            System.out.println("Sinifi Gectin");
        }else System.out.println("Maalesef kaldin");

    }
}
