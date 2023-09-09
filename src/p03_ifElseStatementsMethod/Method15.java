package p03_ifElseStatementsMethod;

import java.util.Scanner;

public class Method15 {
    public static void main(String[] args) {

        // Soru 4-Kullanicidan gun ismini girmesini isteyin,
        //        girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var” seklinde
        //        hafta sonu tatiline kacgun kaldigini yazdirin,
        //        girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.

        isMiTatilMi();

    }

    private static void isMiTatilMi() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("gün ismi giriniz");
        String gun= scanner.next();

        if (gun.equalsIgnoreCase("pazartesi")){
            System.out.println("Simdi calisma zamani tatile 5 gun var");
        } else if (gun.equalsIgnoreCase("salı")) {
            System.out.println("Simdi calisma zamani tatile 4 gun var");

        }else if (gun.equalsIgnoreCase("çarşamba")) {
            System.out.println("Simdi calisma zamani tatile 3 gun var");

        }else if (gun.equalsIgnoreCase("perşembe")) {
            System.out.println("Simdi calisma zamani tatile 2 gun var");

        }else if (gun.equalsIgnoreCase("cuma")) {
            System.out.println("Simdi calisma zamani tatile 1 gun var");

        }else if (gun.equalsIgnoreCase("cumartesi")||gun.equalsIgnoreCase("pazar")) {
            System.out.println("Simdi dinlenme zamani");

        }



    }
}
