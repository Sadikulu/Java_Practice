package day3_practice;

import java.util.Scanner;

public class Q05_StringManipulastion {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim=scan.next();
        System.out.println("lütfen soyisminizi giriniz");
        String soyIsim=scan.next();
        if (isim.length()>soyIsim.length()){
            System.out.println("isim soyisimden daha uzun");
        }else if(isim.length()==soyIsim.length()){
            System.out.println("isim ve soyisim eşit uzunlukta");
        }else {
            System.out.println("soyisim isimde daha uzun");
        }
    }
}