package day3_practice;

import java.util.Scanner;

public class Q07_StringManipulation {
    public static void main(String[] args) {
    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen dört harfli bir kelime giriniz");
        String kelime=scan.next();
        /*String ters=kelime.substring(kelime.length()-1);
        for (int i = kelime.length()-2; i >=0 ; i--) {
                ters+=kelime.substring(i,i+1);
            }
        System.out.println("tersten : " + ters);*/
        if (kelime.length()>4){
            System.out.println("lütfen dört harfli bir kelime giriniz");
        }else{
            System.out.println(kelime.substring(3)+kelime.substring(2,3)
                    +kelime.substring(1,2)+kelime.substring(0,1));
        }
    }
}
