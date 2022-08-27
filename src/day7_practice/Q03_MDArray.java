package day7_practice;

public class Q03_MDArray {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */
        int[][] arr={{1,3,6},{2,8},{5,7,9,14}};
        System.out.println("toplam: "+ciftleriToplam(arr));
    }

    public static int ciftleriToplam(int[][] arr) {
        int toplam=0;
        for (int[] a:arr) {
            for (int b:a) {
                if (b%2==0) {
                    toplam+=b;
                }
            }
        }
        return toplam;
    }
}