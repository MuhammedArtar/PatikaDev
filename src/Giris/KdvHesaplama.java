package Giris;
import java.util.Scanner;


public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOrani = 0.18,kdvTutari, kdvliTutar ;

        Scanner input = new Scanner(System.in);
        System.out.println("Fiyatı Giriniz : ");
        tutar = input.nextDouble();

        kdvTutari = tutar * kdvOrani ;
        kdvliTutar = tutar + kdvTutari ;

        System.out.println("KDVSİZ FİYAT :" + tutar);
        System.out.println("KDV TUTARI :" + kdvTutari );
        System.out.println("KDV ORANI :" + kdvOrani);
        System.out.println("KDVLİ FİYAT :" + kdvliTutar);



    }
}
