package day14_practice;

public class ReverseString {
    public static void main(String[] args) {
        String name="Java Dünyası çok güzel";
        System.out.println(reverse(name));

    }
    public static String reverse(String name) {
        //StringBuilder sb = new StringBuilder();
        String str2="";
        String[] str=name.split("");
        for (int i = str.length-1; i >=0 ; i--) {
            str2+=str[i];
        }
        return str2;


    }
}
