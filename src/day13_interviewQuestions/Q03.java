package day13_interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
       /*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();
        List<Integer> fibonacci = new ArrayList<Integer>();

        fibonacci.add(0);
        fibonacci.add(1);
        int i = 1;
        if (sayi <= 1) {
            System.out.println("daha büyük sayılar gir");
        } else {
            while (fibonacci.get(i) <= sayi) {
                fibonacci.add(fibonacci.get(i)+ fibonacci.get(i-1));
                i++;
            }
            if (fibonacci.get(fibonacci.size()-1)>sayi) {
                fibonacci.remove(fibonacci.size()-1);
            }
            System.out.println(fibonacci);
        }
    }
}
