package lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner01 extends Lambda01 {//inherite birazdan
    static ArrayList<String> names = new ArrayList<>(Arrays.asList("Tulay", "zekeriya", "hasan", "ismail", "osman", "fatih", "ersin", "mevlit"));
    static List<Integer> numbers=new ArrayList<>(Arrays.asList(25,65,-56,55,98,-89,65,55,21,-54,9,35,35,34));
    static List<String> menu = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilice", "havucdilim", "buryan",
            "kokorec", "kuzutandir", "guvec"));
    public static void main(String[] args) {
        //aHarflileriSil(names);
        enBuyuk(numbers);
        tumElemenlarToplami(numbers);
        ciftElemanlarinCarpimi(numbers);
        teklerinKareBuyuktenKucuge(numbers);
        System.out.println();
        sonHarfeGoreTersSira(menu);
        System.out.println();
        karakterSayiYedidenBuyuk(menu);
        karkterEnFazla(menu);
        System.out.println();
        sonHarfeGoreSiralaIlkHaricElmanlariYaz(menu);
    }
}
