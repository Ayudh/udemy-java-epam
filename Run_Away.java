
import java.util.Scanner;
import java.util.Random;

public class Run_Away {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Attack Points of Monster:");
	        int monsterAttack = sc.nextInt();
	        System.out.println("Defense Points of Monster:");
	        int monsterDefense = sc.nextInt();
	        System.out.println("Damage of Monster:");
	        int monsterDamage = sc.nextInt();
	        System.out.println("Life Points of Monster:");
	        int monsterLife = sc.nextInt();
	        
	        System.out.println("Your Attack Points:");
	        int yourAttack = sc.nextInt();
	        System.out.println("Your Defense Points:");
	        int yourDefense = sc.nextInt();
	        System.out.println("Your Damage:");
	        int yourDamage = sc.nextInt();
	        System.out.println("Your Life Points:");
	        int yourLife = sc.nextInt();
	        
	        sc.nextLine(); // for emptying the input buffer. Explain input buffer for a little
	        
	        Random generator = new Random();
	        boolean runaway = false;
	        
	        // round starts here : do
	        do {
	            boolean attacker = generator.nextBoolean();
	            if (attacker) {
	                System.out.println("You attack");
	                int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
	                int attackValue = yourAttack + dice;
	                System.out.println("Rolled values: "+dice);
	                System.out.println("Your attack value: " + attackValue);
	                if (attackValue > monsterDefense) {
	                    System.out.println("Your attack was successful.");
	                    monsterLife = monsterLife - yourDamage;
	                    System.out.println("Monster's remaining Life Points: " + monsterLife);
	                } else {
	                    System.out.println("Your attack was not successful.");
	                }
	            } else {
	                System.out.println("Monster attacks.");
	                int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
	                int attackValue = monsterAttack + dice;
	                System.out.println("Rolled values:"+dice);
	                System.out.println("Monster's attack value: " + attackValue);
	                if (attackValue > yourDefense) {
	                    System.out.println("Monster's attack was successful.");
	                    yourLife = yourLife - monsterDamage;
	                    System.out.println("Your remaining Life Points: " + yourLife);
	                } else {
	                    System.out.println("Monster's attack was not successful.");
	                }
	            }
	            // from this point on
	            System.out.println("Please press ENTER! (Or type in 'run' to run away)");
	            String command = sc.nextLine();
	            switch (command) {
	                case "run":
	                    System.out.println("You ran away. You coward! -4 Life Points!");
	                    yourLife -= 4;
	                    runaway = true;
	                    break;
	                default:
	            }
	        } while (yourLife > 0 && monsterLife > 0 && !runaway);
	        if (yourLife <= 0) {
	            System.out.println("You are dead. Your adventure finishes here. R.I.P.");
	        }
	        if (monsterLife <= 0) {
	            System.out.println("You defeated the monster. Congratulations!");
	        }
         }  
}
