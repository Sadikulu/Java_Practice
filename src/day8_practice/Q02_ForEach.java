package day8_practice;

public class Q02_ForEach {
    public static void main(String[] args) {
        // String[] list = {"fruits", "vegetables", "meat", "milk"};
        // print array with for each loop
        // print length of each element

        // Part 2:
        // Print all the elements from array using for eachLoop
        // If an element starts with 'v' then quit the loop

        String[] list = {"fruits", "vegetables", "meat", "milk"};
         for (String each:list) {
            System.out.println(each+"'in lengthi : " + each.length());
        }
        System.out.println();
        for (String each:list) {
            if (each.startsWith("v")){
                break;
            }else {
                System.out.print(each+" ");
            }
        }
    }
}