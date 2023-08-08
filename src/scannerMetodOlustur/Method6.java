package scannerMetodOlustur;

import java.util.Scanner;

public class Method6 {

    public static void main(String[] args) {

        //Soru 6-Kullanicidan bir yaricap alip,
        //       dairenin cevresini ve alanini yazdirin.
        //       pi=3

        daireninCevresiniAlaniniHesapla();
    }

    public static void daireninCevresiniAlaniniHesapla() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("çevresini ve alanını hesaplamak istediğiniz dairenin \n yarıçapını " +
                "pozitif tamsayı olarak giriniz");
        int yaricap= scanner.nextInt();

        int pi=3;
        int daireninCevresi=2*pi*yaricap;
        int daireninAlani=yaricap*yaricap*pi;

        System.out.println("girilen değere ve pi=3'e göre \ndairenin çevresi: "+
                daireninCevresi+"\ndairenin alanı: "+daireninAlani);

    }
}
