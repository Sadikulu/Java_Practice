package day12_practice;

import static day12_practice.Islemler.*;

public class Runner {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Lionel Messi" , "129402930", 35, "10", "1");
        Ogrenci ogrenci2 = new Ogrenci("Cristiano Ronaldo" , "229402930", 36, "7", "2");
        Ogrenci ogrenci3 = new Ogrenci("Gheorghe Hagi" , "329402930", 45, "11", "3");
        Ogrenci ogrenci4 = new Ogrenci("Melih Irfan" , "429402930", 35, "17", "4");
        Ogrenci ogrenci5 = new Ogrenci("Marilyn Monroe" , "529402930", 18, "100", "5");
        ogrenciList.add(ogrenci1);
        ogrenciList.add(ogrenci2);
        ogrenciList.add(ogrenci3);
        ogrenciList.add(ogrenci4);
        ogrenciList.add(ogrenci5);
        Ogretmen ogretmen1 = new Ogretmen("Sedat Kurnali" , "1345302930", 44, "Bilgisayar", "12344");
        Ogretmen ogretmen2 = new Ogretmen("Ali Candan" , "254352930", 36, "Fen Bilgisi", "2232131");
        Ogretmen ogretmen3 = new Ogretmen("Sadik Ulucay" , "3293532930", 28, "Sinif", "36565");
        Ogretmen ogretmen4 = new Ogretmen("Ziya Cetin" , "4234534930", 65, "Matematik", "465534");
        Ogretmen ogretmen5 = new Ogretmen("Habibe Soysal" , "5295453930", 38, "Ingilizce", "4234235");
        ogretmenList.add(ogretmen1);
        ogretmenList.add(ogretmen2);
        ogretmenList.add(ogretmen3);
        ogretmenList.add(ogretmen4);
        ogretmenList.add(ogretmen5);
        girisPaneli();

    }
}
