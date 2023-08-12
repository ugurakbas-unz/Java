package p02_method;

public class Method1 {

    public static void main(String[] args) {

        //Soru 1-Int olarak verilen 3 degerin ortalamasini
        //       double olarak yazdiran bir kod yazin

        ucIntSayininOrtalamasi(4,6,8);
    }

    private static void ucIntSayininOrtalamasi(int sayi1, int sayi2, int sayi3) {

        double ortalama= ((double)sayi1+sayi2+sayi3)/3;


        System.out.println("int 3 sayının ortalanası : "+ ortalama);

    }
}
