package Giris;
import java.util.Scanner;

public class VücKitleEndeksi {
    public static void main(String[] args) {
        double Boy,sonuc;
        int Kilo;
        Scanner input = new Scanner(System.in);
        System.out.println("BOYUNUZU GİRİN :");
        Boy = input.nextDouble();

        System.out.println("KİLONUZU GİRİN :");
        Kilo = input.nextInt();

        sonuc = Kilo / (Boy * Boy);
        System.out.println("VÜCUT KİTLE ENDEKSİNİZ :" + sonuc);



    }
}
