package day6_practice;

import java.util.Scanner;

public class Q11_Odev {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        String pin="mehmet.1234";
        int girishakki=3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hoşgeldiniz");
         while (true){
             System.out.println("pin kodunuzu giriniz");
             String girilenPin=scan.nextLine();
             if (pin.equals(girilenPin)){
                 System.out.println("Başarılı giriş yaptınız");
                 break;
             }else {
                 System.out.println("yanlış giriş yaptınız");
                 girishakki--;
                 System.out.println("kalan giriş hakkınız : "+girishakki);
             }
             if (girishakki == 0) {
                 System.out.println("giriş hakkınız kalmadı bloklandınız");
                 break;
             }
         }
    }
}