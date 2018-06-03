
import java.util.Random;

public class Count_dice_rolls {
     public static void main(String[] args) {
	        Random generator = new Random();
	        int die = generator.nextInt(6)+1;
	        int count = 0;
	        while (die != 6) {
	            System.out.println(die + " is rolled.");
	            count++;
	            die = generator.nextInt(6)+1;
	        }
	        System.out.println("You had to roll " + count + " times before getting a 6.");
	    }
    
}
