package day6_practice;

import java.util.Scanner;

public class Q10_Interview {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scan.next();
        System.out.println("kaç defa tekrar etmesini istiyorsunuz");
        int tekrarSayi=scan.nextInt();

        System.out.println(ilkSonHarf(kelime,tekrarSayi));
    }

    public static String ilkSonHarf(String kelime, int tekrarSayi) {
        String tekrar="";
        for (int i = 1; i <=tekrarSayi ; i++) {
            tekrar+=kelime.substring(0,1)+kelime.substring(kelime.length()-1);
        }
      return tekrar;
    }
}