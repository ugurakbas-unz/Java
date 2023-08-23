package p03_ifElseStatements;

import java.util.Scanner;

public class Question5 {

    // Soru 5-Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
    //        50’den kucukse “Maalesef kaldin” yazdirin.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" tamsayı olarak notunuzu giriniz");
        int not= scanner.nextInt();

        if (not>=50){
            System.out.println("Sinifi Gectin");
        }else System.out.println("Maalesef kaldin");

    }
}
