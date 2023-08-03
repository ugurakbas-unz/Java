package scanner;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        //Soru 1-Kullanicidan uc farkli data turunde deger alip,
        //       girilen degerleri aciklamalariyla yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.print("String metin giriniz : ");
        String metin= scanner.nextLine();
        System.out.print("int dogalSayi giriniz : ");
        int dogalSayi= scanner.nextInt();
        System.out.print("char karakter giriniz : ");
        char karakter=scanner.next().charAt(0);

        System.out.println();
        System.out.println("girilen metin: "+ metin +
                "\ngirilen int: " +dogalSayi+
                "\ngirilen karakter: "+karakter);

    }


}
