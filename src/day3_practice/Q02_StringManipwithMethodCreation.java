package day3_practice;

import java.util.Scanner;

public class Q02_StringManipwithMethodCreation {
    public static void main(String[] args) {
    /* girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scan.next().toLowerCase();
        System.out.println(trueFalse(kelime));

    }

    public static boolean trueFalse(String kelime) {
        if (kelime.contains("xyz")){
            return true;
        }else{
            return false;
        }

    }
}
