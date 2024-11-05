import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1;  // Random number between 1 and 50
        int guess = 0;

        System.out.println("Guess a number between 1 and 50:");

        while (guess != randomNumber) {
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Your number is lower. Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Your number is higher. Try again.");
            } else {
                System.out.println("You guessed the correct number.");
            }
        }

        scanner.close();
    }
}
