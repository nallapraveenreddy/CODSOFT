import java.util.Scanner;
import java.util.Random;

public class numbergame{
    public static void main(String[] args) {
        Random random = new Random();
        int yes=1;
        int ranNum;
        while(yes==1){
        ranNum = random.nextInt(10) + 1;
        int tries = 1;
        int limit=10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number Between 0-10 to guess:");
        int g = sc.nextInt();
        while (g != ranNum) {
            tries++;
            if (g< ranNum) {
                System.out.println("Too low");
            } else {
                System.out.println("Too High");
            }
            if(tries>10)
            {
                System.out.println("Your attempt limit has been reached!");
                break;
            }
            System.out.println("Try another");
            g = sc.nextInt();
        }
        if(tries<=10){
        System.out.println("Congratulations! You guessed the number in " + tries + " attempts.");
        }
        System.out.println("Do you want to play again?(0/1):");
        yes=sc.nextInt();
        }
        System.out.println("Thank you!");
    }
}
