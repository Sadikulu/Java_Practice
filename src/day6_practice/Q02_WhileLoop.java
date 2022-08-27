package day6_practice;

import java.util.Scanner;

public class Q02_WhileLoop {
    public static void main(String[] args) {
     /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi= scan.nextInt();
        int count=0;
        while (0<=sayi){
            if (sayi%2!=0){
                System.out.print(sayi+" ");
                count++;
            }
            sayi--;
        }
        System.out.println("\n"+"count : "+count);
    }
}