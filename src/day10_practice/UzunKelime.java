package day10_practice;

import java.util.Scanner;

public class UzunKelime {
    /*
     * Kullanicidan gelen cumleyi  parametre olarak alan
     * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
     * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
     * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle=scan.nextLine();
        System.out.println("En uzun kelime = " + enUzunKelime(cumle));

        //ben bugün javayı çok sevdim ama çok zorlandım
    }

    public static String enUzunKelime(String cumle) {
        String[] arr = cumle.split(" ");
        String longestWord = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length() > longestWord.length()){
                longestWord = arr[i];
            }
        }
        return longestWord;
    }
}
