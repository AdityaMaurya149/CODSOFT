import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        
        Scanner inputGetter = new Scanner(System.in);
        Random numberGenerator = new Random();

        int howManyRoundsWon = 0;
        boolean wantToPlayMore;

        do {
            int theRandomNumberIpicked = numberGenerator.nextInt(100) + 1;
            int counter_for_my_tries = 0;
            int max_number_of_attempts = 10;
            boolean did_i_guess_it = false;

            System.out.println("\n--- Welcome to the Number Guessing Game! ---");
            System.out.println("I have selected a number between 1 and 100. You have " + max_number_of_attempts + " attempts.");

            while (counter_for_my_tries < max_number_of_attempts) {
                System.out.print("Enter your guess: ");
                int the_players_guess;

                try {
                    the_players_guess = inputGetter.nextInt();
                    inputGetter.nextLine();
                } catch (Exception oh_no_an_error) {
                    System.out.println("Invalid input. Please enter a number.");
                    inputGetter.nextLine();
                    continue;
                }
                
                counter_for_my_tries++;

                if (the_players_guess < theRandomNumberIpicked) {
                    System.out.println("Your guess is too low.");
                } else if (the_players_guess > theRandomNumberIpicked) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + counter_for_my_tries + " attempts.");
                    did_i_guess_it = true;
                    howManyRoundsWon++;
                    break;
                }
            }

            if (!did_i_guess_it) {
                System.out.println("Sorry, you ran out of attempts. The correct number was " + theRandomNumberIpicked + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = inputGetter.nextLine().toLowerCase();
            wantToPlayMore = playAgainInput.equals("yes");

        } while (wantToPlayMore);

        System.out.println("\nThanks for playing! You won " + howManyRoundsWon + " round(s).");
        inputGetter.close();
    }
}