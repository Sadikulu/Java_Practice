package day6_practice;

import java.util.Scanner;

public class Q04_DoWhileLoop {
    public static void main(String[] args) {
     /*
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.
		     Kullanıcıdan bir kelime girmesini isteyin. Sözcüğün tek sayıda karakteri
		     varsa ve 3 veya daha fazla karakteri varsa,
		     karakteri sözcüğün ortasına yazdırın.
		     kelime çift sayıda karakter baskısına sahip "Yanlış kelime girdiniz."
		     */
        Scanner scan = new Scanner(System.in);
        String kelime="";
        do {
            System.out.println("lütfen bir kelime giriniz");
            kelime=scan.next();
            if (kelime.length()%2==0 || kelime.length()<3){
                System.out.println("You entered wrong word.");
            }else {
                System.out.println("ortadaki harf : "+kelime.charAt(kelime.length()/2));
            }
        }while (!(kelime.length()%2==1 && kelime.length()>=3));
    }
}