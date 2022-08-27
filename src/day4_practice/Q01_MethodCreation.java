package day4_practice;

public class Q01_MethodCreation {
    public static void main(String[] args) {
    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez
         yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
        String input = "aabbcccccddddaaa";
        birKereYazdir(input);

    }

    public static void birKereYazdir(String input) {
        String output ="";
        for (int i = 0; i <input.length() ; i++) {
            if (!output.contains(input.substring(i,i+1))){
                output+=input.substring(i,i+1);
            }
        }
        System.out.println(output);
    }
}
