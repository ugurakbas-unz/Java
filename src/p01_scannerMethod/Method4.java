package p01_scannerMethod;

import java.util.Scanner;

public class Method4 {

    public static void main(String[] args) {

        //Soru 4-Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        //       dikdortgenin alanini yazdirin.(method)


        dikdortgeninAlaniniHesapla();
    }

    public static void dikdortgeninAlaniniHesapla() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("dikdörtgenin kısa kenar uzunlugu için pozitif tamsayı giriniz");
        int kisaKenar= scanner.nextInt();
        System.out.println("dikdörtgenin uzun kenar uzunlugu için pozitif tamsayı giriniz");
        int uzunKenar= scanner.nextInt();

        int diktorgeninAlani=uzunKenar*kisaKenar;
        System.out.println("Girilen Değerlere Göre Diktorgenin Alani: "+ diktorgeninAlani);

    }

}
