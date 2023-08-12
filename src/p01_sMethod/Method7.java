package p01_sMethod;

import java.util.Scanner;

public class Method7 {

    public static void main(String[] args) {

        // Soru 7 (Interview)
        //        -Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        sayilarinYerleriniDegistir();
    }

    public static void sayilarinYerleriniDegistir() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        int ilkSayi= scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int ikinciSayi= scanner.nextInt();

        int temp=0;
        temp=ilkSayi;
        ilkSayi=ikinciSayi;
        ikinciSayi=temp;

        System.out.println("sayıların yerleri değiştirildi; son durumda:\nilk sayı: "+ilkSayi+"\nikinci sayı: "+ikinciSayi);
    }
}
