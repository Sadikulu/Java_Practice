package day7_practice;

import java.util.Arrays;

public class Q04_Arrays {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */
        String cumle = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";

        String yeni=cumle.replaceAll("\\s","");
        System.out.println("Stringin length : "+yeni.length());

        String[] arr=yeni.split("");
        System.out.println("Karakter sayısı : "+arr.length);

        String[] kelime=cumle.split(" ");
        int boşlukSayisi= kelime.length-1;
        System.out.println("boşluk sayısı : "+boşlukSayisi);
        String[] characters=cumle.split("");
        System.out.println("Karakter sayısı : "+(characters.length-boşlukSayisi));
    }
}