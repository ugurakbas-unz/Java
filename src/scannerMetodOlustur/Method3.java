package scannerMetodOlustur;

import java.util.Scanner;

public class Method3 {

    //Soru 3-Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
    //       Isminiz : John
    //       Soyisminiz : Doe
    //       Yasiniz : 44
    //       Kaydiniz basariyla tamamlanmistir. (Method ile)

    public static void main(String[] args) {
        isimYazdir();
    }

    private static void isimYazdir() {

        Scanner scanner =new Scanner(System.in);
        System.out.print("isminizi giriniz : ");
        String girilenIsim= scanner.nextLine();
        System.out.print("soyisminizi giriniz : ");
        String girilenSoyisim= scanner.nextLine();
        System.out.print("yaşınızı giriniz : ");
        int girilenYas= scanner.nextInt();

        girilenIsim=girilenIsim.toUpperCase().charAt(0)+girilenIsim.substring(1).toLowerCase();
        girilenSoyisim=girilenSoyisim.toUpperCase().charAt(0)+girilenSoyisim.substring(1).toLowerCase();

        System.out.println();

        System.out.println("Isminiz : "+girilenIsim+
                "\nSoyisminiz : "+ girilenSoyisim+
                "\nYasiniz : "+ girilenYas+
                "\nKaydiniz basariyla tamamlanmistir.");


    }

}
