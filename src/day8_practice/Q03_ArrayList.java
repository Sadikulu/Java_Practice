package day8_practice;

import java.util.*;

public class Q03_ArrayList {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç adet maksimum sayı yazdırmak istiyorsunuz");
        int n = scan.nextInt();
        int[] arr = {2, 5, -9, 45, 43, 11, 8, 102,102, 47, 0};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        List<Integer> maxList = new ArrayList<>();
        int count = 1;
        while (count <= n) {
            int max = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max && !maxList.contains(list.get(i))) {
                    max = list.get(i);
                }
            }
            maxList.add(max);
            list.remove(list.indexOf(max));
            count++;
        }
        System.out.println(maxList);
    }
}