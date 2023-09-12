import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        int ranNum = random.nextInt(100) + 1;
        int tries = 1;
        int limit=10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number Between 0-100 to guess:");
        int g = sc.nextInt();
        while (g != ranNum) {
            tries++;
            limit--;
            if(limit==0)
            {
                System.out.println("Your attempt limit has been reached!");
                break;
            }
            if (g< ranNum) {
                System.out.println("Too low");
            } else {
                System.out.println("Too High");
            }

            System.out.println("Try another");
            g = sc.nextInt();
        }
        System.out.println("Congratulations! You guessed the number in " + tries + " attempts.");
    }
    
}
