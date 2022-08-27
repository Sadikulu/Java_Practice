package day7_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {
    public static void main(String[] args) {
       /*
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
        farkınıBul();

    }

    public static void farkınıBul() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Array uzunluğunu giriniz");
        int uzunluk=scan.nextInt();
        int sayi;
        int[] arr= new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array'in "+(i+1)+". elemanını giriniz");
            arr[i]=scan.nextInt();
        }
        //1.yol
        int enBuyuk=arr[0];
        int enKucuk=arr[0];
        for (int i = 0; i <arr.length ; i++){
            if (arr[i]>enBuyuk){
                enBuyuk=arr[i];
            }if (arr[i]<enKucuk){
                enKucuk=arr[i];
            }
        }
        System.out.println("fark : "+(enBuyuk-enKucuk));

        //2.yol
        Arrays.sort(arr);

        System.out.println("fark : " + (arr[arr.length-1]-arr[0]));
    }
}