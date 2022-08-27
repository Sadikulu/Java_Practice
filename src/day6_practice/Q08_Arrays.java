package day6_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q08_Arrays {
    public static void main(String[] args) {
     /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        Scanner scan = new Scanner(System.in);
        int[] sayilar = new int[8];
        int adet=0;
        String bolunenler="";
        for (int i = 0; i <8 ; i++) {
            System.out.print(i+". indexteki sayıyı giriniz");
            sayilar[i]=scan.nextInt();
            if (sayilar[i]%3==0) {
               bolunenler+=sayilar[i];
                adet++;
            }
        }
        System.out.println("Sayılar arrayi : "+ Arrays.toString(sayilar));
        System.out.println("bölünen sayılar : "+bolunenler);
        System.out.println("3' bölünebilen sayı adedi : "+adet);
    }
}
