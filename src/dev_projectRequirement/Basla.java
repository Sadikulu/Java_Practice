package dev_projectRequirement;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basla {
    static String[] urunlerArr = {"01 Domates  20.10TL", "02 Patates  30.20TL", "03 Biber  30.50TL", "04 Soğan  20.30TL", "05 Havuç  30.10Tl", "06 Elma  50.20", "07 Muz  100.90", "08 Çilek  60.10", "09 Kavun  40.30", "10 Üzüm  20.70", "11 Limon  10.50"};
    static double[] fiyatArr = {20.10, 30.20, 30.50, 20.30, 30.10, 50.20, 100.90, 60.10, 40.30, 20.70, 10.50};
    //static List<String> urunler = new ArrayList<>();
    //static List<Double> fiyatlar = new ArrayList<>();
    static List<String> sepet = new ArrayList<>();
    static double toplamFiyat = 0;
    static Scanner scan = new Scanner(System.in);
    //static int secim;
    static boolean bittiMi = false;

    public static void main(String[] args) {

        secim();

    }

    private static void secim() {
        while (!bittiMi) {
            urunleriListele();
            sepet();
        }
    }

    private static void urunleriListele() {
        JOptionPane.showMessageDialog(null, urunlerArr[0] + "\n" + urunlerArr[1] + "\n"
                + urunlerArr[2] + "\n" + urunlerArr[3] + "\n" + urunlerArr[4] + "\n" + urunlerArr[5]
                + "\n" + urunlerArr[6] + "\n" + urunlerArr[7] + "\n" + urunlerArr[8] + "\n" + urunlerArr[9] + "\n" + urunlerArr[10]);

    }

    private static void sepet() {
        //System.out.println("Lütfen ürün seçimi yapınız");
        int secim=Integer.parseInt(JOptionPane.showInputDialog(null, "lütfen ürün seçimini yapınız"));
        //secim = scan.nextInt();
       // System.out.println("Kaç kilo almak istiyorsun");
        Double kilo= Double.valueOf(JOptionPane.showInputDialog(null, "Kaç kilo almak istiyorsunuz"));
        //double kilo = scan.nextDouble();
        toplamFiyat += fiyatArr[secim-1] * kilo;
        sepet.add(urunlerArr[secim-1]+" "+kilo+"KG");
        for (int i = 0; i <sepet.size() ; i++) {
            //System.out.println(sepet.get(i));
            JOptionPane.showInputDialog(null, sepet.get(i), toplamFiyat);
            //System.out.println("Toplam Fiyat : " + toplamFiyat+"TL");
        }
            String mesaj="Devam etmek istiyor musunuz?";
            String secenekler[]={"Evet","Hayır"};
            Integer secimTF = JOptionPane.showOptionDialog(null, mesaj,"karar", JOptionPane.YES_NO_OPTION, 2, null, secenekler, null);
            if (secimTF == JOptionPane.YES_OPTION) {
                bittiMi = false;
            } else {
                bittiMi = true;
                odeme();
            }
        /*for (int i = 0; i < 1; i++) {
            //System.out.println("devam etmek istiyor musunuz?T/F");
            //String karar = scan.next();
           /* if (karar.equalsIgnoreCase("T")) {
                bittiMi = false;
            } else if (karar.equalsIgnoreCase("F")) {
                bittiMi = true;
                odeme();
            } else {
                System.out.println("Geçerli bir seçim yapınız");
                i--;
            }
        }*/
}

    private static void odeme() {
        String mesaj="Nasıl ödemek istersiniz?";
        String secenekler[]={"Kapıda nakit","Kredi kartı"};
        Integer secimTF = JOptionPane.showOptionDialog(null, mesaj,"karar", JOptionPane.YES_NO_OPTION, 2, null, secenekler, null);
        if (secimTF == JOptionPane.YES_OPTION) {
            for (int i = 0; i <sepet.size() ; i++) {
                JOptionPane.showInputDialog(null,sepet.get(i));
            }
            JOptionPane.showInputDialog(null,"Adresinizi giriniz");
            JOptionPane.showInputDialog("Siparişiniz alınmıştır",null);
        }else{
            JOptionPane.showInputDialog(null,"Adresinizi giriniz");
            JOptionPane.showInputDialog(null,"Lütfen kart sahibinin adını ve soyadını giriniz");
            JOptionPane.showInputDialog(null,"Lütfen 16 haneli kart no giriniz");
            JOptionPane.showInputDialog(null,"Lütfen kartın son kullanma tarihini ay/yıl şeklinde giriniz");
            JOptionPane.showInputDialog(null,"Lütfen CVC kodunu giriniz");
            JOptionPane.showInputDialog("Siparişiniz alınmıştır");
        }
    }

    /*private static void urunleriListele() {
        double[] fiyatArr = {20.10, 30.20, 30.50, 20.30, 30.10, 50.20, 100.90, 60.10, 40.30, 20.70, 10.50};
        String[] urunlerArr = {"01 Domates  20.10TL", "02 Patates  30.20TL", "03 Biber  30.50TL", "04 Soğan  20.30TL", "05 Havuç  30.10Tl", "06 Elma  50.20", "07 Muz  100.90", "08 Çilek  60.10", "09 Kavun  40.30", "10 Üzüm  20.70", "11 Limon  10.50"};
        System.out.println(" No"+"\t"+" Urun"+"\t"+"Fiyat");
        /*for (int i = 0; i < urunlerArr.length; i++) {
            urunler.add(urunlerArr[i]);
            fiyatlar.add(fiyatArr[i]);
            //System.out.printf("%2s %-7s %6.2f TL\n",(i + 1),urunler.get(i),fiyatlar.get(i));
        }
    }*/

    /*private static void odeme() {
        System.out.println("Nasıl ödemek istersiniz?\n"
                + "1 Kapıda nakit\n" + "2 Kredi kartı");
        int odeme = scan.nextInt();
        for (int i = 0; i <sepet.size() ; i++) {
            System.out.println(sepet.get(i));
        }
        System.out.println("Toplam tutar : " + toplamFiyat);
        if (odeme == 1) {
            System.out.println("Adresinizi giriniz");
            scan.nextLine();
            String adres=scan.nextLine();
            System.out.println("Siparişiniz alınmıştır.");
        } else if (odeme == 2) {
            System.out.println("Adresinizi giriniz");
            scan.nextLine();
            String adres2=scan.nextLine();
            System.out.println("Lütfen kart sahibinin adını giriniz");
            String isim = scan.nextLine();
            System.out.println("Lütfen kart sahibinin soyadını giriniz");
            String soyIsim = scan.nextLine();
            for (int i = 0; i < 1; i++) {
                System.out.println("Lütfen kart numaranızı giriniz");
                String kartNo = scan.next();
                if (kartNo.length() == 16) {
                    System.out.println("Lütfen kartınızın son kullanma tarihini giriniz");
                    String skt = scan.next();
                    for (int j = 0; j < 1; j++) {
                        System.out.println("Lütfen CVC kodunuzu giriniz");
                        String cvc = scan.next();
                        if (cvc.length() == 3) {
                            System.out.println("Siparişiniz alınmıştır.");
                        } else {
                            System.out.println("CVC kodunuz hatalı lütfen tekrar deneyiniz");
                            j--;
                        }
                    }
                } else {
                    System.out.println("Kart numaranız hatalı tekrar deneyiniz");
                    i--;
                }
            }
        }
    }*/
}
