package day8_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08_UniqeArray {
    public static void main(String[] args) {
        /*
         * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
         * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
         */
        int[] arr={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};
        List<Integer> benzersiz=new ArrayList<>();
        String tekrar="";
        Arrays.sort(arr);
        for (int i = 0; i <arr.length-1 ; i++) {
                if (arr[i]!=arr[i+1]) {
                    benzersiz.add(arr[i]);
            }
        }
        if (!benzersiz.contains(arr[arr.length-1])) {
            benzersiz.add(arr[arr.length-1]);
        }
        int[] yeni=new int[benzersiz.size()];
        for (int i = 0; i <benzersiz.size() ; i++) {
            yeni[i]=benzersiz.get(i);
        }
        System.out.println("Benzersiz array : "+Arrays.toString(yeni));
    }
}