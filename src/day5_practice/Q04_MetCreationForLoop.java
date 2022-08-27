package day5_practice;

import java.util.Scanner;

public class Q04_MetCreationForLoop {
    public static void main(String[] args) {
		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str=scan.nextLine();
        tersten(str);
        System.out.println(tersten(str));
    }

    public static String tersten(String str) {
        String terstenCumle="";
        for (int i = str.length()-1; i >=0 ; i--) {
            terstenCumle+=str.substring(i, i+1);
        }
        return terstenCumle;
    }
}