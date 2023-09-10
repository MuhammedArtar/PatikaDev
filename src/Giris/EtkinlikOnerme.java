package Giris;
import java.util.Scanner;
public class EtkinlikOnerme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sıcaklık;

        System.out.println("SICAKLIĞI GİRİNİZ :");
        sıcaklık = input.nextInt();

        if (sıcaklık < 5){
            System.out.println("KAYAK YAPABİLİRSİNİZ.");
        }else if (sıcaklık > 5 || sıcaklık <25) {
            if (sıcaklık < 15) {
                System.out.println("SİNEMAYA GİDEBİLİRSİNİZ.");
            }
            if (10 < sıcaklık && sıcaklık < 25) {
                System.out.println("PİKNİĞE GİDEBİLİRSİNİZ.");
            }

                } else
                 { System.out.println("YÜZMEYE GİDEBİLİRSİNİZ.");
                       }

    }
}
