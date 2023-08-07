package scannerMetodOlustur;

import java.util.Scanner;

public class Method5 {

    public static void main(String[] args) {

        //Soru 5-Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //       girilen bilgiler : J Doe, 44

        isimSoyisimYazdir();
    }

    public static void isimSoyisimYazdir() {

        Scanner scanner=new Scanner(System.in);
        System.out.print("isminizi giriniz : ");
        String girilenIsim= scanner.nextLine();
        System.out.print("soyisminizi giriniz : ");
        String girilenSoyisim= scanner.nextLine();
        System.out.print("yaşınızı giriniz : ");
        int girilenYas= scanner.nextInt();

        char isimIlkHarf=girilenIsim.toUpperCase().charAt(0);
        girilenSoyisim=girilenSoyisim.toUpperCase().charAt(0) +girilenSoyisim.substring(1).toLowerCase();

        System.out.println("girilen bilgiler: " + isimIlkHarf+" "+girilenSoyisim+", "+girilenYas);



    }
}
