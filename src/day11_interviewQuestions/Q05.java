package day11_interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q05 {
    public static void main(String[] args) {
        //normal toplama metodu varargs ile toplama metodu yazınız
        int[] arr = {17, 23, 33, 9, 20};
        System.out.println("arrTopla(arr) = " + arrTopla(arr));
        System.out.println("varargsToplaList(25, 55, 63, 21, 20) = " + varargsToplaList(25, 55, 63, 21, 20));
        System.out.println("varargsToplaArr(arr) = " + varargsToplaArr(arr));
        //varargs array gibi davrandığı için herhangi bir arrayi
        //parametre olarak verebiliriz
    }

    private static int varargsToplaArr(int... i) {
        int toplam = 0;
        for (int w : i) {
            toplam += w;
        }
        return toplam;
    }

    private static int varargsToplaList(int i, int i1, int i2, int i3, int i4) {
        int toplam = 0;
       List<Integer> list = new ArrayList<>();
       list.add(i);
       list.add(i1);
       list.add(i2);
       list.add(i3);
       list.add(i4);
        for (int w:list) {
            toplam += w;
        }
        return toplam;
    }

    private static int arrTopla(int[] arr) {
        int toplam = 0;
        for (int w : arr) {
            toplam += w;
        }
        return toplam;
    }
}
