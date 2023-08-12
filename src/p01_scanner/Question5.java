package p01_scanner;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        //Soru 5-Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //       girilen bilgiler : J Doe, 44


        Scanner scanner=new Scanner(System.in);
        System.out.println("sırasıyla ismini,soyisminizi,yaşınızı giriniz, " +
                "girdiginiz her bilginin ardından enter tusuna basınız");

        String girilenIsim= scanner.nextLine();
        String girilenSoyisim= scanner.nextLine();
        int girilenYas= scanner.nextInt();

        char girilenIsimChr=girilenIsim.toUpperCase().charAt(0);
        girilenSoyisim=girilenSoyisim.toUpperCase().charAt(0)+girilenSoyisim.substring(1).toLowerCase();

        System.out.println("girilen bilgiler : "+girilenIsimChr+" "+girilenSoyisim+", "+girilenYas);

    }
}
