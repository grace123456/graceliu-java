
    /*Grace Liu
Ms. Transue
AP Computer Science
7 November 2018
 */

import java.util.Scanner;
import java.util.Random;

    public class RockPaperScissors {
        public static void main(String[] args) {

            //prompt for user input name and how many rounds to play
            System.out.println("Enter name of player");
            Scanner console1 = new Scanner(System.in);
            String player = console1.next();
            int play = 1;
            while (play == 1) {

                // System.out.println("keep playing? 0-no 1-yes");
                // play = console.nextInt();


                System.out.println("Enter how many rounds you want to play, 3 or 5");

                int rounds = console1.nextInt();

                int roundCounter = 1;

                //using while loop to make sure that user can play multiple rounds
                //while (rounds != 6) {

                //introduce a round counter to keep track of how many rounds have been played and be ready to exit out

                while (roundCounter <= rounds) {


                    //introduce two integer values to keep track of the score
                    int playerScore = 0;
                    int computerScore = 0;

                    //use scanner class to type in player input
                    System.out.println("Type in your choice!");
                    Scanner console2 = new Scanner(System.in);
                    int choice = console2.nextInt();
                    System.out.println(chams(choice));


                    //use random class to generate computer input
                    System.out.println("The computer chooses");
                    Random r = new Random();
                    int response = r.nextInt(3);
                    System.out.println(chams(response));


                    //compare two inputs and determine which one wins in each round
                    if (response == 0) {
                        if (choice == 0) {
                            System.out.println("Rock and Rock, it's a tie!");
                            System.out.println("player score = " + playerScore + " computer score = " + computerScore);
                        } else if (choice == 1) {
                            System.out.println("Paper beats Rock, you win!");
                            roundCounter += 1;
                            playerScore += 1;
                            System.out.println("player score = " + playerScore + " computer score = " + computerScore);
                        } else if (choice == 2) {
                            System.out.println("Rock beats Scissors, you lose!");
                            roundCounter += 1;
                            computerScore += 1;
                            System.out.println("player score = " + playerScore + " computer score = " + computerScore);
                        }
                    }
                    if (response == 1) {
                        if (choice == 0) {
                            System.out.println("Paper beats Rock, you lose!");
                            roundCounter += 1;
                            playerScore += 1;
                            System.out.println("player score = " + playerScore + " computer score = " + computerScore);
                        } else if (choice == 1) {
                            System.out.println(" Paper and paper, it's a tie!");
                        } else if (choice == 2) {
                            System.out.println("Scissors beat paper, you win!");
                            roundCounter += 1;
                            playerScore += 1;
                            System.out.println("player score = " + playerScore + " computer score = " + computerScore);
                        }
                    }
                    if (response == 2) {
                        if (choice == 0) {
                            System.out.println("Rock beats Scissors, you win!");
                            roundCounter += 1;
                            playerScore += 1;
                            System.out.println("player score = " + playerScore + " computer score = " + computerScore);
                        } else if (choice == 1) {
                            System.out.println("Scissors beat paper, you lose!");
                            roundCounter += 1;
                            computerScore += 1;
                            System.out.println("player score = " + playerScore + " computer score = " + computerScore);
                        } else if (choice == 2) {
                            System.out.println("Scissors and scissors, it's a tie!");
                        }
                    }
                }

                //exit out of the game when all rounds are played
                if (roundCounter <= rounds) {
                    System.out.println("The end. See who is the winner?");

                }
            }

        }

        public static int whoWins(choice,)















        public static String chams(int x) {
            String chams = " ";
            if (x == 0) {
                return chams = "Rock";
            } else if (x == 1) {
                return chams = "Paper";
            } else if (x == 2) {
                return chams = "Scissors";
            }

            return chams;
        }





    }


