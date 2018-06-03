
import java.util.Scanner;
import java.util.Random;

public class Fighting_Exercise {
    /**
     * @param args the command line arguments
     */
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
        
        Random generator = new Random();
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
    }
    
}
