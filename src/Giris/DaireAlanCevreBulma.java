package Giris;
import java.util.Scanner;

public class DaireAlanCevreBulma {
    public static void main(String[] args) {

        int r;
        double pi = 3.14,Alan,Cevre;
        Scanner input = new Scanner(System.in);
        System.out.print("YARI ÇAPI GİRİNİZ :");
        r = input.nextInt();

        Alan = pi * r * r ;
        Cevre = 2 * pi * r ;

        System.out.println("DAİRENİN ALANI :" + Alan);

        System.out.print("DAİRENİN ÇEVRESİ :" + Cevre);




    }
}
