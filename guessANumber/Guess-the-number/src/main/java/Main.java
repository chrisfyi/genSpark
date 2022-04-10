import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Setup introduction
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        //Scan for players name
        String name = scanner.nextLine();
        // give prompt
        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20."
        );

        // If the player is still playing, start game
        boolean stillPlaying = true;
        while (stillPlaying) {
            stillPlaying = play(scanner, name);
        }
    }


    public static boolean play(Scanner scanner , String name){
            Random secret = new Random();
            int highest = 21;
            int correct = secret.nextInt(highest);
            int numOfGuesses = 0;
            int guess;

            while (numOfGuesses < 6) {
                System.out.println("Take a guess.");
                guess = scanner.nextInt();
                scanner.nextLine();
                numOfGuesses++;

                if (guess == correct) {
                    System.out.println("Good job, " + name + " ,you guessed my number in " + numOfGuesses +
                            " guesses!");
                    System.out.println("Want to play again?(y or n) ");
                    String playAgain = scanner.nextLine();
                    return !playAgain.equals("n");
                }
                if (guess < correct) {
                    System.out.println("Your guess is too low");
                }
                if (guess > correct) {
                    System.out.println("Your guess is too high");
                }
            }
            System.out.println("Sorry you were unable to guess the number in 6 tries");
            System.out.println("Would you like to play again? (y or n)");
            String playAgain = scanner.nextLine();
            return !playAgain.equals("n");

        }
}


