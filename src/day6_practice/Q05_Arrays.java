package day6_practice;

import java.util.Arrays;

public class Q05_Arrays {
    public static void main(String[] args) {
    	/*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
        int[] sayilar={2,6,4,5,8,9};
        //int[] kareler=new int[sayilar.length];
        for (int i = 0; i < sayilar.length ; i++) {
            sayilar[i]*=sayilar[i];
        }
        System.out.println("kareler : "+ Arrays.toString(sayilar));
    }
}