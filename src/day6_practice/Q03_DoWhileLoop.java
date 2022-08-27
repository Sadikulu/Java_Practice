package day6_practice;

import java.util.Scanner;

public class Q03_DoWhileLoop {
    public static void main(String[] args) {
      /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */
        Scanner scan = new Scanner(System.in);
        String girilen="";
        do {
            System.out.println("bir değer giriniz");
            girilen=scan.next();
            if (!girilen.equals("x")) {
                System.out.println("Program çalışıyor");
            }else{
                System.out.println("Program bitti");
            }
        }while (!girilen.equalsIgnoreCase("x"));

    }
}