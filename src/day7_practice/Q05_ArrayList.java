package day7_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {
    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */
        List<String> isimler=new ArrayList<>();
        isimler.add("Enes");
        isimler.add("İsmail");
        isimler.add("Abdulbaki");
        isimler.add("Emre");
        isimler.add("Melisa");
        isimler.add("Oğuz");
        Scanner scan = new Scanner(System.in);
        System.out.println("kullanmak istediğiniz username'i giriniz");
        String username=scan.nextLine().trim();
        boolean usernameVarmi=isimler.contains(username);
        int randomSayi=new Random().nextInt(100);
        if (usernameVarmi) {
            System.out.println("bu kullanıcı adı zaten alınmış");
            username+=randomSayi;
            System.out.println("yeni kullanıcı adınız : "+username);
            isimler.add(username);
        }else {
            System.out.println("bu kullanıcı adını kullanabilirsiniz");
        }
        System.out.println(isimler);
    }
}