//Course: ITSE 2317 Section 004
//Semester: Spring 2026
//Assignment #: Assignment 10
//Due Date: April 1, 2026
//------------------------------------------------------

// import Scanner class to enable
// reading in from the keyboard
import java.util.Scanner;

public class RockPaperScissors {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        // declare constants to
        // be used in program
        final int OPTIONS = 3;
        final int ROCK = 1, PAPER = 2, SCISSORS = 3;
        final int COMPUTER = 1, PLAYER = 2, TIE = 3;

        // declare variables to be used in program
        int computer, player, winner = 0;
        int wins = 0, losses = 0, ties = 0;
        String again;

        // instantiate an object from the
        // Scanner class to enable reading
        // in from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // use a do-while loop
        // whether a user wishes to continue
        // playing rock, paper, and scissors
        do {

            // randomly generate a number that will
            // be the computer's choice of either
            // playing rock, paper, and scissors
            computer = (int) (Math.random() * OPTIONS + 1);

            System.out.println("\nEnter your choice - "
                    + "1 for Rock, 2 for Paper, and 3 for Scissors:");
            player = keyboard.nextInt();
            keyboard.nextLine(); // clear input

            // Check for valid player choice
            if (player < ROCK || player > SCISSORS) {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }

            System.out.print("Computer's choice was ");

            switch (computer) {

                case ROCK:
                    System.out.println("Rock.");

                    if (player == SCISSORS) {
                        winner = COMPUTER;
                    } else if (player == PAPER) {
                        winner = PLAYER;
                    } else {
                        winner = TIE;
                    }
                    break;

                case PAPER:
                    System.out.println("Paper.");

                    if (player == ROCK) {
                        winner = COMPUTER;
                    } else if (player == SCISSORS) {
                        winner = PLAYER;
                    } else {
                        winner = TIE;
                    }
                    break;

                case SCISSORS:
                    System.out.println("Scissors.");

                    if (player == PAPER) {
                        winner = COMPUTER;
                    } else if (player == ROCK) {
                        winner = PLAYER;
                    } else {
                        winner = TIE;
                    }
                    break;

                default:
                    System.out.println("Error! Something went wrong in this game!");
                    break;
            } // end switch statement

            if (winner == COMPUTER) {
                System.out.println("Computer wins!");
                losses++;
            } else if (winner == PLAYER) {
                System.out.println("You win!");
                wins++;
            } else {
                System.out.println("We tied.");
                ties++;
            }

            System.out.println("\nPlay again (y/n)?");
            again = keyboard.nextLine();

        } while (again.equalsIgnoreCase("y")); // end do-while loop

        // print out the final results
        System.out.println("\nYou won " + wins + " times.");
        System.out.println("You lost " + losses + " times.");
        System.out.println("We tied " + ties + " times.");

        System.out.println("\nThis program was written by Tanya Marshman");
        System.out.println("End of program.");

        keyboard.close();

    } // end method main

} // end class RockPaperScissors
