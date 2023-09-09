package p03_ifElseStatementsMethod;

import java.util.Scanner;

public class Method12 {
    public static void main(String[] args) {

        // Soru 3-Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        //        Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        indirimHesapla();
    }

    private static void indirimHesapla() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("musteri kartınız var mı? E yada H olarak giriniz");
        char kart = scanner.next().toUpperCase().charAt(0);
        System.out.println("aldıgınız urun adedini giriniz");
        double adet = scanner.nextInt();
        System.out.println("aldıgınız urunün liste fiyatını giriniz");
        double fiyat = scanner.nextInt();


        if (kart == 'E') {
            if (adet > 10) {
                System.out.println("%20 indirimli toplam tutar " + (adet * (fiyat / 100 * 80)));
            } else
                System.out.println("%15 indirimli toplam tutar " + (adet * (fiyat / 100 * 85)));


        } else if (kart == 'H') {
            if (adet > 10) {
                System.out.println("%15 indirimli toplam tutar " + (adet * (fiyat / 100 * 85)));
            } else
                System.out.println("%10 indirimli toplam tutar " + (adet * (fiyat / 100 * 90)));


        } else
            System.out.println("yanlış kart girişi");


    }
}


