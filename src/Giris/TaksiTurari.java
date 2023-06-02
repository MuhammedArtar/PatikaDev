package Giris;
import java.util.Scanner;

public class TaksiTurari {
    public static void main(String[] args) {
        int km;
        double PerKm = 2.20, total, StartPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("KM Cinsinden Mesafeyi Giriniz :");
        km = input.nextInt();

        total = (km * PerKm ) ;
        total += StartPrice ;

        total = ( total < 20 ) ? 20 : total;
        System.out.println("TOPLAM TUTAR :" + total);


    }
}
