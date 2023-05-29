package Giris;
import java.util.Scanner ;


public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, kimya, fizik, turkce, muzik, tarih;

        Scanner inp = new Scanner(System.in) ;

        System.out.println("Matematik Notunuzu Giriniz : ");
        mat = inp.nextInt() ;

        System.out.println("Kimya Notunuzu Giriniz : ");
        kimya = inp.nextInt() ;

        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik = inp.nextInt() ;

        System.out.println("Türkçe Notunuzu Giriniz : ");
        turkce = inp.nextInt() ;

        System.out.println("Müzik Notunuzu Giriniz : ");
        muzik = inp.nextInt() ;

        System.out.println("Tarih Notunuzu Giriniz : ");
        tarih = inp.nextInt() ;

        int toplam = (mat + kimya + fizik + turkce + muzik + tarih ) ;
        double sonuc = toplam / 6 ;

        System.out.println("Ortalamanız : " + sonuc);

        String durum = (sonuc >= 60)? "Sınıfı Geçtiniz " : "Sınıfta Kaldınız";
        System.out.println(durum);

    }
}
