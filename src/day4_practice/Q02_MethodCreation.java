package day4_practice;

public class Q02_MethodCreation {
    public static void main(String[] args) {
      /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */
        double cm=100;
        convertSM(cm);

    }

    public static void convertSM(double cm) {
        double kiloMetre=cm/100000;
        double metre=cm/100;
        System.out.println(cm+" cm "+metre+" metredir "+kiloMetre+" kilometredir");
    }
}