package Giris;
import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        double ElmaBirim = 3.67,ArmutBirim = 2.14,DomatesBirim = 1.11,MuzBirim = 0.95,PatlıcanBirim = 5.00,Toplam;
        double Elma,Armut,Domates,Muz,Patlıcan;

        Scanner input = new Scanner(System.in);
        System.out.println("ELMA KAÇ KG ? :");
        Elma = input.nextDouble();

        System.out.println("ARMUT KAÇ KG ? :");
        Armut = input.nextDouble();

        System.out.println("DOMATES KAÇ KG ? :");
        Domates = input.nextDouble();

        System.out.println("MUZ KAÇ KG ? :");
        Muz = input.nextDouble();

        System.out.println("PATLICAN KAÇ KG ? :");
        Patlıcan = input.nextDouble();

        Toplam = (Elma * ElmaBirim)+(Armut*ArmutBirim)+(Domates*DomatesBirim)+(Muz*MuzBirim)+(Patlıcan*PatlıcanBirim);
        System.out.println("TOPLAM FİYAT :"+ Toplam);
    }
}
