

import java.util.Scanner;

public class BoilingExercise {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Give in the temperature:");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp >= 100) {
            System.out.println("The water is boiling.");
        } else {
            System.out.println("The water is not boiling.");
        }
    }
    
}
