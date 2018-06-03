import java.util.Scanner;
public class BoilingFreezingExercise {
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Give in the temperature:");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp >= 100) {
            System.out.println("The water is boiling.");
        }
        if (temp <= 0) {
            System.out.println("The water is freezing.");
        }
        if (0 < temp && temp < 100) {
            System.out.println("The water is in normal state.");
        }
    }
    
}
