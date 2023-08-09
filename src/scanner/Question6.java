package scanner;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        //Soru 6-Kullanicidan bir yaricap alip,
        //       cevresini ve direnin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("alan ve cevre hesaplamak için bir yarıçap giriniz");
        double yaricap = scanner.nextDouble();

        double pi = 3.14;
        double cemberinCevresi=2*pi*yaricap;
        double daireninAlani=pi*yaricap*yaricap;

        System.out.println("çemberin çevrisi = "+cemberinCevresi+
                "\ndairenin alanı = "+daireninAlani);

    }
}
