package day3_practice;

import java.util.Scanner;

public class Q04_StringManipulastion {
    public static void main(String[] args) {
        /*Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scan.next();
        if (kelime.length()%2!=0 && kelime.length()>=3){
            System.out.println("ortanca karakter: "+kelime.substring(kelime.length()/2,(kelime.length()/2)+1));
        }else{
            System.out.println("çift sayıda karakter olduğu için ortanca karakter yoktur");
        }

    }
}