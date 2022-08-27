package day6_practice;

import java.util.Scanner;

public class Q01_WhileLoop {
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi=scan.nextInt();
        System.out.println("rakamlar toplamı : " + basamaklarToplami(sayi));

    }

    public static int basamaklarToplami(int sayi) {
        int rakamlarToplami=0;
        while (sayi!=0){
            rakamlarToplami+=sayi%10;
            sayi/=10;
        }
        return rakamlarToplami;
    }
}