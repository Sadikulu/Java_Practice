package day5_practice;

import java.util.Scanner;

public class Q01_ForLoop {
    public static void main(String[] args) {



     /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

     */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        String harf = scan.next().toLowerCase();
        String sesliHarf = "aeiou";
        if (harf.length() > 1 || (harf.replaceAll("\\w","")==harf)) {
            System.out.println("Yanlis karakter girdiniz!");
        } else {
            if (sesliHarf.contains(harf)) {
                System.out.println(harf + " harfi sesli harftir");
            } else {
                System.out.println(harf + " harfi sessiz harftir");
            }
        }
    }
}
