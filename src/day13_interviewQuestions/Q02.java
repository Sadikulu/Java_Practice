package day13_interviewQuestions;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*
// Stringi ters cevirmek icin bir Java Programi yazin
//1.Yol: StringBuilder () kullanarak
//2.Yol: String Classini kullanarak
//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
  */
        String input="All is well";
        StringBuilder str=new StringBuilder(input);
        str.reverse();
        System.out.println("Reverse ile tersine : "+str);
        String tersten="";
        for (int i = input.length()-1; i >=0 ; i--) {
            tersten+=input.charAt(i);
        }
        System.out.println("String tersten : "+tersten);
    }
}
