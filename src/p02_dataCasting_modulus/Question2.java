package p02_dataCasting_modulus;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        //Soru 2-Kullanicidan bir harf alin ve
        //       alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char girilenKarakter=scanner.next().charAt(0);

        System.out.println(" alfabede o harften sonraki 3 harf"+"\n"+
                (char)  (girilenKarakter+1)+" "+(char)(girilenKarakter+2)+" "+(char)(girilenKarakter+3));
    }
}
