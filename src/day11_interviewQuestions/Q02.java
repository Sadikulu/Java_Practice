package day11_interviewQuestions;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
     /*
Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal
olup olmadığını kontrol edin
Kısaca asal sayılar sadece kendine ve 1'e bölünebilen pozitif tam sayılardır.
1 sayısı ise asal sayı değildir. Çünkü asal sayıların sadece 2 pozitif tam
 sayı böleni olmalıdır.
 1 ise sadece 1'e bölünebildiği için yalnız tek böleni bulunmaktadır.
      */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir pozitif sayı giriniz");
        int sayi = scan.nextInt();
        boolean asalMi= true;
        if (sayi>1){
            for (int i = 2; i <sayi ; i++) {
                if (sayi%i==0){
                    asalMi = false;
                }
            }
            if (asalMi) {
                System.out.println(sayi+" asal sayıdır");
            }else {
                System.out.println(sayi+" asal sayı değil");
            }
        }else {
            System.out.println("sayı asal sayı değil");
        }

    }
}
