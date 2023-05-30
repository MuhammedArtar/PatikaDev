package Giris;
import java.util.Scanner;


public class HipotebüsBulma {
    public static void main(String[] args) {


    int a, b ;
    double c ;

        Scanner deger = new Scanner(System.in);
        System.out.println("A KENARINI GİRİNİZ :" );
        a = deger.nextInt();
        System.out.println("B KENARINI GİRİNİZ :");
        b = deger.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs :" + c );


    }
}
