
package CodSoft;

import java.util.Scanner;

public class CodeSoft {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char option;
        boolean playAgain;

        do {
            double random = Math.random() * 100 + 1;
            int randm = (int) random;
            int guess = 0;
            int attempts = 0;
            int score = 0;
            int limit = 0;

            System.out.println("Enter the Number of Attempts:");
            attempts = s.nextInt();
            limit = 0; // Reset limit for the new game

            while (guess != randm && limit < attempts) {
                System.out.println("Enter your guess:");
                guess = s.nextInt();

                if (guess == randm) {
                    System.out.println("The Guess is Correct!");
                    score++;
                    // Generate a new random number
                    random = Math.random() * 100 + 1;
                    randm = (int) random;
                    guess = 0; // Reset guess for next round
                    limit = 0; // Reset limit for new round
                } else if (guess > randm) {
                    System.out.println("Too High!");
                } else {
                    System.out.println("Too Low!");
                }
                limit++;
            }

            if (limit >= attempts) {
                System.out.println("You've reached the maximum number of attempts.");
            }

            System.out.println("You Won! Score: " + score);
            System.out.println("Attempts used: " + limit);
            System.out.println("Do you want to play again? (yes / no)");
            option = s.next().charAt(0);
            playAgain = (option == 'y' || option == 'Y');

        } while (playAgain);

        System.out.println("Thanks for playing!");
        s.close();
    }
}
