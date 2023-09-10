
package Giris;

import java.util.Scanner;
public class KullanıcıGirisi {
    public static void main(String[] args) {

        String userName, password;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adıniz : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("galatasaray") && password.equals("gs1905"))

        { System.out.println("Kullanıcı Girişi Başarılı ");

        } else {

        System.out.println("Hatalı Giriş Yaptınız!");
        }
    }

}
