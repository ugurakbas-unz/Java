package p03_Method;

import java.util.Scanner;

public class Method13 {

    public static void main(String[] args) {

        // Soru 4-Kullanicidan mesafeyi kilometre olarak alin ve istedigi birimi sorun,
        //        istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        //        “istediginiz birim sisteme kayitli degil” yazdirin.(method)

        uzunlukHesapla();



    }

    private static void uzunlukHesapla() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("kilometre olarak mesafa giriniz");
        double km= scanner.nextDouble();
        System.out.println("cevirmek istediginiz birim için" +
                "\n metre yada santimetre yazınız" );
        String birim= scanner.next();


        if (birim.equalsIgnoreCase("metre")){
            System.out.println("sonuç: "+km+" kilometre "+ (km*1000)+" metre eder");

        }else if(birim.equalsIgnoreCase("santimetre")){
            System.out.println("sonuç:"+km+" kilometre "+ (km*100000)+" santimetre eder");

        }else
            System.out.println("istediginiz birim sisteme kayitli degil");

    }
}
