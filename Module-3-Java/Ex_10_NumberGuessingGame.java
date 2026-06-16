import java.util.Random;
import java.util.Scanner;
public class Ex_10_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = new Random().nextInt(100) + 1;
        int guess;
        do {
            guess = sc.nextInt();
            if(guess > target)
                System.out.println("Too High");
            else if(guess < target)
                System.out.println("Too Low");
            else
                System.out.println("Correct");
        } while(guess != target);
    }
}