package p03_Method;

import java.util.Scanner;

public class Method11 {

    public static void main(String[] args) {

        // Soru 2-Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        //        vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        //        vucut kitle endeksi 30’dan buyukse obez,
        //        25-30 arasi ise kilolu,
        //        20-25 arasi ise normal,
        //        20’den kucukse zayif yazdirin.(method)

        vkiHesapla();

    }

    private static void vkiHesapla() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter tusunu kullanarak sırasıyla \nkg olarak kilonuzu ve" +
                "\n cm olarak boyunuzu giriniz");

        int kg= scanner.nextInt();
        int boy= scanner.nextInt();

        int vki=kg*10000/(boy*boy);

        System.out.println("vki = "+ vki);
        if (vki>30){
            System.out.println("obez");
        }else if(vki>25){
            System.out.println("kilolu");
        }else if(vki>20){
            System.out.println("normal");
        }else
            System.out.println("zayıf");



    }
}
