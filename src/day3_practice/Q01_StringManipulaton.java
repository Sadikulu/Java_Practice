package day3_practice;

import java.util.Scanner;

public class Q01_StringManipulaton {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen dört adet kelime giriniz");
        String kelime1=scan.next();
        String kelime2=scan.next();
        String kelime3=scan.next();
        String kelime4=scan.next();
        String cumle=kelime1.substring(0,1).toUpperCase().concat(kelime1.substring(1).concat(" ")
                .concat(kelime2).concat(" ").concat(kelime3).concat(" ").concat(kelime4).concat("."));
        System.out.println("Cümle = " + cumle);
    }
}