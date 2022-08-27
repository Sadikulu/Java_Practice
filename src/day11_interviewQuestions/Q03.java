package day11_interviewQuestions;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
       //bunu kart sifre kontrol de de kullabilirinisz
        Scanner scan = new Scanner(System.in);
        String sifre="erdal.bey123";
        int girisSayisi=3;
        while (true) {
            System.out.println("şifre gir");
            String girilenSifre=scan.nextLine();
            if (sifre.equals(girilenSifre)) {
                System.out.println("şifren başarılı");
                break;
            }else {
                System.out.println("şifren yanlış");
                girisSayisi--;
                System.out.println("kalan giriş hakkın : "+girisSayisi);
            }
            if (girisSayisi == 0) {
                System.out.println("giriş hakkın kalmadı kart bloke "+girisSayisi);
                break;
            }
        }
    }
}
