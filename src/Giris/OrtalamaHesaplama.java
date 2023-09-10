package Giris;
import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

         int fizik,mat,turkce,muzik,kimya;
         double dersSayısı=5;

        System.out.print("FİZİK NOTUNUZU GİRİNİZ : ");
        fizik = input.nextInt();
        if (fizik > 100 || fizik < 0){
            dersSayısı = dersSayısı - 1;
            fizik=0; }

        System.out.print("MATEMATİK NOTUNUZU GİRİNİZ : ");
        mat = input.nextInt();
        if (mat > 100 || mat < 0){
            dersSayısı = dersSayısı - 1;
            mat=0; }

        System.out.print("MÜZİK NOTUNUZU GİRİNİZ : ");
        muzik = input.nextInt();

        if (muzik > 100 || muzik < 0){
            dersSayısı = dersSayısı - 1;
            muzik=0; }

        System.out.print("TÜRKÇE NOTUNUZU GİRİNİZ : ");
        turkce = input.nextInt();

        if (turkce > 100 || turkce < 0){
            dersSayısı = dersSayısı - 1;
            turkce=0; }

        System.out.print("KİMYA NOTUNUZU GİRİNİZ : ");
        kimya = input.nextInt();

        if (kimya > 100 || kimya < 0){
            dersSayısı = dersSayısı - 1;
            kimya=0; }

        double avverage;
        avverage =(fizik+mat+turkce+kimya+muzik)/ dersSayısı;

        if (avverage <=55){
            System.out.println("SINIFI GEÇEMEDİNİZ");
        } else
            System.out.println("SINIFI GEÇTİNİZ TEBRİKLER");
        System.out.println("ORTALAMANIZ: " + avverage);



        }
    }
