import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("You are in a land full of dragons. In front of you, " +
                "\n you see two caves. In one cave, the dragon is friendly" +
                "\n and will share his treasure with you. The other dragon" +
                "\n is greedy and hungry and will eat you on sight." +
                "\n Which cave will you go into? (1 or 2)"
        );

        Scanner answer = new Scanner(System.in);
        int userInput = answer.nextInt();

        if (userInput == 1) {
            System.out.println("You approach the first cave..." +
                    "\n It is dark and spooky..." +
                    "\n A large dragon jumps out in front of you! He opens his jaws and..." +
                    "\n Gobbles you down in one bite!");
        } else if (userInput == 2) {
            System.out.println("You approach the second cave..." +
                    "\n It is dark but you see a light flickering in the distance..." +
                    "\n A large dragon jumps out in front of you! He smiles and..." +
                    "\n Leads you to the treasure chest!");
        } else {
            System.out.println("Please enter the number 1 or 2 to play!");
        }
    }
}
