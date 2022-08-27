package day5_practice;

import java.util.Scanner;

public class Q03_ForLoop {
    public static void main(String[] args) {
      /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */
        Scanner scan = new Scanner(System.in);
        System.out.println("satır sayısı giriniz");
        int satir=scan.nextInt();
        System.out.println("sütun sayısı giriniz");
        int sutun=scan.nextInt();
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
}