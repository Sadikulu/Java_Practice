package day14_practice;

import java.util.Arrays;

public class Sorted_Array {
    public static void main(String[] args) {
        /*
        Integer olarak artan değerler şeklinde
        verilen dizinin elemanlarının karesini
        alıp yine artan değerlerde ekrana yazdıran
        metod oluşturunuz

        Örnek :

        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
         */
        int input[]={-4,-1,0,3,10};
        int[] input2=Arrays.stream(input).map(t->t*t).sorted().toArray();
        System.out.println(Arrays.toString(input2));
        System.out.println(Arrays.toString(sortedArray(input)));

    }

    public static int[] sortedArray(int[] input) {
        for (int i = 0; i <input.length ; i++) {
            input[i] = input[i]*input[i];
        }
        Arrays.sort(input);
        return input;
    }

}
