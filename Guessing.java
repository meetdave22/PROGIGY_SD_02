
import java.util.Scanner;
import java.util.Random;
public class Guessing 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Set up game parameters
        int minNumber = 1;
        int maxNumber = 100;
        int secretNumber = random.nextInt(maxNumber) + minNumber;
        int guessCount = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a number between " + minNumber + " and " + maxNumber);
        System.out.println("Try to guess what it is!\n");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            guessCount++;
            
            if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("\nCongratulations! You've guessed the number " + secretNumber + "!");
                System.out.println("It took you " + guessCount + " attempts.");
                
                // Bonus: Show performance rating
                int perfectAttempts = (int)(Math.log(maxNumber) / Math.log(2)); // Binary search ideal
                if (guessCount <= perfectAttempts) {
                    System.out.println("Amazing! That's the optimal number of guesses!");
                } else if (guessCount <= perfectAttempts + 2) {
                    System.out.println("Good job! You're close to the optimal performance.");
                } else {
                    System.out.println("Not bad! You can improve by using binary search strategy.");
                }
            }
        }
        
        scanner.close();
    
}

    
}
