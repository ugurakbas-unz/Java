package scanner;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

    //Soru 3-Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
    //       Isminiz : John
    //       Soyisminiz : Doe
    //       Yasiniz : 44
    //       Kaydiniz basariyla tamamlanmistir.

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
