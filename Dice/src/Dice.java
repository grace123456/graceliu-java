import java.util.Scanner;
import java.util.Arrays;

public class Dice {
    public static final int DICENUM = 6;
    public static void main(String[] args) {
        System.out.println("Would you like to play a game? yes/no");
        Scanner playGame = new Scanner(System.in);
        String playAgain = playGame.next();

        defineDice();
        printDice();

        while(playAgain.equals("yes")){

            rollDice();

            printDice();

            drawLine();

            System.out.println("Would you like to play again?");
            playAgain = playGame.next();

        }

    }
    public static void defineDice(){
        System.out.println("define dice");
    }

    public static void printDice(){
        System.out.println("print dice");
    }

    public static void rollDice(){
        System.out.println("roll dice");
    }

    public static void drawLine(){
        System.out.println("draw line");
    }
}
