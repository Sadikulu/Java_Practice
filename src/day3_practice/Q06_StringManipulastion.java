package day3_practice;

import java.util.Scanner;

public class Q06_StringManipulastion {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk
        // karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup
        // olmadigini kontrol ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scan.nextLine();
        if (kelime.contains(" ")){
            System.out.println("Strinde boşluk var");
        }else if (kelime.equals("")){
            System.out.println("String boştur");
        }else{
            System.out.println("verilen String: "+kelime);
        }
    }
}