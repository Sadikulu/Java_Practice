package day3_practice;

import java.util.Scanner;

public class Q08_MethodCreation {
    public static void main(String[] args) {
     /*Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yapmak istediğiniz işlemin sembolünü giriniz");
        String sembol = scan.next();
        işlem(sembol);
    }

    public static void işlem(String sembol) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki tamsayı giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        switch (sembol) {
            case "+":
                System.out.println("Toplam : " + (sayi1 + sayi2));
                break;
            case "-":
                System.out.println("Çıkarma : " + (sayi1 - sayi2));
                break;
            case "*":
                System.out.println("Çarpma : " + (sayi1 * sayi2));
                break;
            case "/":
                System.out.println("Bölme : " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Lütfen geçerli bir işlem karakteri giriniz");
        }
    }
}