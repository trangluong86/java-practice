import java.util.Random;


/**
 * Write a program that plays a simple dice game
 * between the computer and the user.
 *
 */
public class DiceGame {

    private static int numberOfGames = 10;

    public static void main(String[] args) {

        int computerWins = 0, computerRoll = 0;
        int userWins = 0, userRoll = 0;
        int tiedGames = 0;

        for (int round = 0; round < numberOfGames; round++) {

            computerRoll = rollDie();
            userRoll = rollDie();

            // Determine who won the game
            if (computerRoll == userRoll) {
                tiedGames++;
            } else {
                if (computerRoll > userRoll) {
                    computerWins++;
                } else {
                    userWins++;
                }
            }
        }

        // Display the results.
        System.out.println("Computer: " + computerWins);
        System.out.println("User    : " + userWins);
        System.out.println("Ties    : " + tiedGames);

        // Determine the grand winner.
        if (computerWins > userWins) {
            System.out.println("You got beat by a computer!");
        } else {
            if (computerWins < userWins) {
                System.out.println("You beat the computer!");
            } else {
                System.out.println("The game has ended in a tie!");
            }
        }
    }

    // Return a random number
    static int rollDie() {
        Random randValue = new Random();
        return randValue.nextInt(6) + 1;
    }

}