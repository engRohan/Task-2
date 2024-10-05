import java.util.Random;
import java.util.Scanner;

public class GuessingGame {


        public static void main(String[] args) {

            Random random = new Random();
            int randomNumber = random.nextInt(10) + 1;
            Scanner scanner = new Scanner(System.in);
            int userGuess = 0;

            while (userGuess != randomNumber) {

                System.out.println("Guess a number between 1 and 10:");
                userGuess = scanner.nextInt();

                // Check if the user's guess is too high, too low, or correct
                if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                }
            }
            scanner.close();
        }
    }

