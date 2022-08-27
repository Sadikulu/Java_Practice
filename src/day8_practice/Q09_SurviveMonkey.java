package day8_practice;

public class Q09_SurviveMonkey {
    public static void main(String[] args) {
    /*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/
        int numberOfBananas =165;
        int survivalDays = 1;
        boolean monkeyAlive = true;
        do {
           numberOfBananas-=4;
               survivalDays++;
               if (numberOfBananas<4){
                   monkeyAlive=false;
                   System.out.println("Bugün "+survivalDays+". gün muz kalmadı maymun öldü");
               }else {
                   System.out.println("hayatta kalınan gün : "+survivalDays);
               }

        }while (monkeyAlive);
        System.out.println("Toplam yaşadığı gün : "+(survivalDays-1));
    }
}