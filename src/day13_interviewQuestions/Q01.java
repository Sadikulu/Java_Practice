package day13_interviewQuestions;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit
     numbers(4 digit-> exclusive)
     Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
     toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
      amstrong sayı olup olmadıgını
      gösteren program yazınız */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üç basamaklı bir sayı giriniz");
        int sayi = scan.nextInt();
        armstrongSayi(sayi);
        girilenSayiyaKadarOlanArmstrongSayi(sayi);
    }

    private static void girilenSayiyaKadarOlanArmstrongSayi(int sayi) {
        for (int i = 1; i <=sayi; i++) {
            armstrongSayi(i);
        }
    }

    private static void armstrongSayi(int sayi) {
        int temp = sayi;
        int sayininKuplerToplami = 0;
        while (temp > 0) {
            int basamakSayisi = temp % 10;
            sayininKuplerToplami += (basamakSayisi * basamakSayisi * basamakSayisi);
            temp /= 10;
        }
        if (sayininKuplerToplami == sayi) {
            System.out.println(sayi + " sayısı armstrong sayıdır");
        } else {
            System.out.println(sayi + " sayısı armstrong sayı değildir");
        }
    }
}
