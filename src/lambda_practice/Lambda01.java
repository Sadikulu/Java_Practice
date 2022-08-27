package lambda_practice;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {//Odev : okul projesinde listele vb. lmbda expressions ile yapınız

    /* TASK :
     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */
    /*public static void aHarflileriSil(ArrayList<String> isimler){
        System.out.println(isimler.stream().map(t -> t.toLowerCase()).filter(t -> !t.contains("a")).collect(Collectors.toList()));
        isimler.removeIf(t -> t.contains("a") || t.contains("A"));
       System.out.println(isimler.stream()//akiisa alindi
                          .filter(m -> !m.contains("a") && !m.contains("A"))//a harfi olmayanlar filtrelendi
                          .collect(Collectors.toList()))
        System.out.println(isimler);
    }*/

    //en buyyk elemani bulun
    public static void enBuyuk(List<Integer> numbers) {
        Optional<Integer> max = numbers.stream().reduce(Math::max);
        System.out.println(max);
        int max1 = numbers.stream().reduce(Math::max).get();
        System.out.println(max1);
        int max2 = numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(max2);
    }
    /*reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
    kullanımı yaygındır pratiktir.
    Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
    bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
    reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
    reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
    İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.*/

    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
    //Lambda Expression...
    public static void tumElemenlarToplami(List<Integer> numbers) {
        int toplam = numbers.stream().reduce(Math::addExact).get();
        System.out.println(toplam);
        int toplam2 = numbers.stream().reduce((t, u) -> t + u).get();
        System.out.println(toplam2);
    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftElemanlarinCarpimi(List<Integer> numbers) {
        //Metohd referance ile
        int carpim = numbers.stream().filter(Methods::ciftiAl).reduce(Math::multiplyExact).get();
        System.out.println(carpim);
        //lambda expressions ile
        int carpim2 = numbers.stream().filter(Methods::ciftiAl).reduce((t, u) -> t * u).get();
        System.out.println(carpim2);
    }

    //TODO task tek lerin karesini buyukten kucuge
    public static void teklerinKareBuyuktenKucuge(List<Integer> sayi) {
        sayi.stream().filter(Methods::tekiAl).map(t -> t * t).sorted(Comparator.reverseOrder()).forEach(Methods::yazdir);
    }

    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfabetikBuyukHarfTekrarsiz(List<String> yemek) {
    yemek.stream().distinct().map(t->t.toUpperCase()).forEach(Methods::yazdir);
    }

    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void strKarakterSayisiYazdir(List<String> yemek) {
    }

    // Task :TODO list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHarfeGoreTersSira(List<String> yemek) {
    yemek.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).forEach(Methods::yazdir);
    }

    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz
    // buyukten kucuge sirali  print ediniz..
    public static void karakterCiftKareBuyuktenKucuge(List<String> yemek) {

    }

    // TODO Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void karakterSayiYedidenBuyuk(List<String> yemek) {
        System.out.println(yemek.stream().anyMatch(t -> t.length() <= 7));
        System.out.println(yemek.stream().allMatch(t -> t.length() <= 7));
        System.out.println(yemek.stream().noneMatch(t -> t.length() <= 7));
        //ilkel yöntem
        boolean kontrol=yemek.stream().allMatch(t -> t.length() <= 7);
        if(kontrol) {
            System.out.println("Listin tüm elemanları yediden küçük");
        }else {
            System.out.println("Listin bazı elemanları yediden büyük");
        }
        //modern metod
        System.out.println(yemek.stream().allMatch(t -> t.length() <= 7) ?
                "Listin tüm elemanları yediden küçük" : "Listin bazı elemanları yediden büyük");

    }

    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
    // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
    public static void basHarfiWIleBaslayan(List<String> yemek) {

    }

    // TODO Task : List elelmanlarinin "x" ile biten en az bir elemaı kontrol ediniz.
    public static void xIleBitenEleman(List<String> yemek) {

    }

    // TODO Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void karkterEnFazla(List<String> yemek) {
        //limit(1) => Sınırlandırma demek. Bu akışın elemanlarından oluşan, uzunluğu maxSize'dan uzun olmayacak
        // şekilde kesilmiş bir akış return eder. Stream return eder.
    yemek.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).limit(1).forEach(Methods::yazdir);
    }

    /*
TRİCK : •    Stream'ler ekrana direk yazdırılamaz. Stream'i toArray() ile Array'e çeviririz.
Array'i de Arrays.toString() 'in içine alıp yazdırabiliriz.
•  Ör; System.out.println(Arrays.toString(***.toArray())); veya System.out.println(Arrays.asList(***.toArray()));
kullanılabilir.
*/

    //TODO Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public static void sonHarfeGoreSiralaIlkHaricElmanlariYaz(List<String> yemek) {
    yemek.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1))).map(t->t.substring(1)).forEach(Methods::yazdir);
    }

}
