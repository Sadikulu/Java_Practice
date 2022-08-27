package day12_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static List<Kisi> ogretmenList = new ArrayList<>();
    static List<Kisi> ogrenciList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    //static yazmamızın sebebi tüm metodlarda ulaşmak
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================\n"
                + "ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n"
                + "====================================\n"
                + "1- ÖĞRENCİ İŞLEMLERİ\n"
                + "2- ÖĞRETMEN İŞLEMLERİ\n"
                + "Q- ÇIKIŞ");

        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "ÖĞRENCİ";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "ÖĞRETMEN";
                islemMenusu();
                break;
            case "Q":
                cikisQ();
                break;
            default:
                System.out.println("Hatalı giriş");
                girisPaneli();
                break;
        }
    }

    private static void cikisQ() {
        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz\n" +
                "Yine bekleriz");
    }

    private static void islemMenusu() {
        System.out.println("Seçtiğin kişi türü : " + kisiTuru + " lütfen aşağıdaki işlemleri seçiniz");

        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");

        int secilenIslem = scan.nextInt();
        switch (secilenIslem) {
            case 1:
                ekle();
                break;
            case 2:
                arama();
                break;
            case 3:
                listeleme();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 5:
                girisPaneli();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("yanlış seçim");
                islemMenusu();
                break;
        }
    }

    private static void silme() {
        System.out.println(kisiTuru+" Silme menusundesiniz.Silmek istediğiniz kişinin TC nosunu giriniz");
        //scan.nextLine();
        String tcNo = scan.next();
        int index = -1;
        if (kisiTuru.equals("ÖĞRENCİ")) {
            for (int i = 0; i < ogrenciList.size(); i++) {
                if (ogrenciList.get(i).getKimlikNo().contains(tcNo)) {
                    System.out.println(ogrenciList.get(i));
                    index = i;
                }
            }if(!(ogrenciList.contains(tcNo))){
                System.out.println("silmek istediğiniz isim bulunamadı");
            }
        } else {
            for (int i = 0; i < ogretmenList.size(); i++) {
                if (ogretmenList.get(i).getKimlikNo().contains(tcNo)) {
                    System.out.println(ogretmenList.get(i));
                    index = i;
                }
            }if(!(ogretmenList.contains(tcNo))){
                System.out.println("silmek istediğiniz isim bulunamadı");
            }
        }
        if (index!=-1){
            System.out.println("Silmek istediğinizden emin misiniz?T/F");
            String ilkTercih = scan.next();
            if (ilkTercih.equalsIgnoreCase("T")) {
                if (kisiTuru.equals("ÖĞRENCİ")) {
                    ogrenciList.remove(index);
                    System.out.println(ogrenciList);
                } else {
                    ogretmenList.remove(index);
                    System.out.println(ogretmenList);
                }
            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Başka işlem yapmak ister misiniz?T/F");
            String tercih = scan.next();
            if (tercih.equalsIgnoreCase("T")) {
                islemMenusu();
            } else if (tercih.equalsIgnoreCase("F")) {
                girisPaneli();
            } else {
                System.out.println("Geçerli bir değer giriniz");
                i--;
            }
        }
    }

    private static void arama() {
        System.out.println("Arama menusundesiniz.Aramak istediğiniz kişinin adını giriniz");
        scan.nextLine();
        String isim = scan.nextLine();
        if (kisiTuru.equals("ÖĞRENCİ")) {
            for (int i = 0; i < ogrenciList.size(); i++) {
                if (ogrenciList.get(i).getAdSoyad().contains(isim)) {
                    System.out.println(ogrenciList.get(i));
                }
            }if(!(ogrenciList.contains(isim))){
                System.out.println("Aramak istediğiniz isim bulunamadı");
            }
        } else {
            for (int i = 0; i < ogretmenList.size(); i++) {
                if (ogretmenList.get(i).getAdSoyad().contains(isim)) {
                    System.out.println(ogretmenList.get(i));
                }else{
                    System.out.println("Aradığınız isim bulunamadı");
                }
            }if(!(ogretmenList.contains(isim))){
                System.out.println("Aramak istediğiniz isim bulunamadı");
            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Başka işlem yapmak ister misiniz?T/F");
            String tercih = scan.next();
            if (tercih.equalsIgnoreCase("T")) {
                islemMenusu();
            } else if (tercih.equalsIgnoreCase("F")) {
                girisPaneli();
            } else {
                System.out.println("Geçerli bir değer giriniz");
                i--;
            }
        }
    }

    private static void listeleme() {
        System.out.println("Listeleme menusundesiniz.");
        if (kisiTuru.equals("ÖĞRENCİ")) {
            for (int i = 0; i <ogrenciList.size() ; i++) {
                System.out.println(ogrenciList.get(i));
            }
        } else {
            for (int i = 0; i <ogretmenList.size() ; i++) {
                System.out.println(ogretmenList.get(i));
            }

        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Başka işlem yapmak ister misiniz?T/F");
            String tercih = scan.next();
            if (tercih.equalsIgnoreCase("T")) {
                islemMenusu();
            } else if (tercih.equalsIgnoreCase("F")) {
                girisPaneli();
            } else {
                System.out.println("Geçerli bir değer giriniz");
                i--;
            }
        }
    }

    private static void ekle() {

        System.out.println("*** " + kisiTuru + " ekleme sayfasına HOŞGELDİNİZ");
        System.out.println("Ad soyad gir");
        scan.nextLine();
        String adSoyad = scan.nextLine();
        System.out.println("kimlik no gir");
        String kimlikNo = scan.next();
        System.out.println("Yaş gir");
        int yas = scan.nextInt();
        if (kisiTuru.equals("ÖĞRENCİ")) {
            System.out.println("Öğrenci no gir");
            String ogrenciNo = scan.next();
            System.out.println("Sınıf gir");
            String sinif = scan.next();
            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);
            ogrenciList.add(ogrenci);
            System.out.println(ogrenciList);
        } else {
            System.out.println("Bölüm gir");
            scan.nextLine();
            String bolum = scan.nextLine();

            System.out.println("Sicil no gir");
            String sicilNo = scan.nextLine();

            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
            ogretmenList.add(ogretmen);
            System.out.println(ogretmenList);
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Başka işlem yapmak ister misiniz?T/F");
            String tercih = scan.next();
            if (tercih.equalsIgnoreCase("T")) {
                islemMenusu();
            } else if (tercih.equalsIgnoreCase("F")) {
                girisPaneli();
            } else {
                System.out.println("Geçerli bir değer giriniz");
                i--;
            }
        }
    }
}
