import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int roundsWon = 0;
        boolean playAgain;

        do {
            int secretNumber = random.nextInt(100) + 1; // Generate number between 1 and 100
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("\n--- Welcome to the Number Guessing Game! ---");
            System.out.println("I have selected a number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess;
                try {
                    userGuess = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine(); // Clear the invalid input from the scanner
                    continue;
                }
                
                attempts++;

                if (userGuess < secretNumber) {
                    System.out.println("Your guess is too low.");
                } else if (userGuess > secretNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    roundsWon++;
                    break; // Exit the attempts loop
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you ran out of attempts. The correct number was " + secretNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine().toLowerCase();
            playAgain = playAgainInput.equals("yes");

        } while (playAgain);

        System.out.println("\nThanks for playing! You won " + roundsWon + " round(s).");
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}