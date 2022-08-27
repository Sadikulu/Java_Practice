package day6_practice;

import java.util.Arrays;

public class Q06_Arrays {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         */
        String siri= "HeySiri";
        siri=siri.replace("Hey","Bye");
        String[] arr=new String[1];
        arr[0]=siri;
        System.out.println(Arrays.toString(arr));
        /*String[] yeniSiri=siri.split("");
        yeniSiri[0] = "B";
        yeniSiri[1] = "y";
        yeniSiri[2] = "e";
        System.out.println(yeniSiri);*/



    }
}