package UcakBileti;
import java.util.Scanner;
public class UcakBiletiHesaplama {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double mesafe, fiyat, yIndirim = 1, gD;
        int yas, biletT;
        boolean isError = false;

        System.out.print("Gidilecek mesafeyi km cinsinden giriniz : ");
        mesafe = sc.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        yas = sc.nextInt();

        System.out.print("Tek Gidiş ise 1 Gidiş-Dönüş ise 2 yazınız : ");
        biletT = sc.nextInt();

        fiyat = mesafe * 0.10;

        if (yas > 0 && yas < 120 && mesafe > 0) {

            if (yas < 12) {

                yIndirim = fiyat / 2;

            } else if (yas >= 12 && yas <= 24) {

                yIndirim = fiyat * 0.10;

            } else if (yas > 65) {

                yIndirim = fiyat * 0.30;

            } else {

                yIndirim = 0;

            }


            fiyat = fiyat - yIndirim;

            if (biletT == 1) {

            } else if (biletT == 2) {

                gD = fiyat * 0.20;
                fiyat = fiyat - gD;
                fiyat = fiyat * 2;

            } else {

                isError = true;

            }

        }else {

            isError = true;

        }

        if (isError == true) {

            System.out.println("Hatalı giriş yaptınız Ctrl F5 basarak tekrar deneyiniz.");

        } else {

            System.out.println("Ücret : " + fiyat);

        }

    }
}
