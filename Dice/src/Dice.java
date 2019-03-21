import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
import java.lang.String;
import java.util.Random;
/* Grace Liu
Ms. Transue
AP CS
7 December 2018
*/

public class Dice {

    public static final int DICENUM = 5;
    public static void main(String[] args) {
        System.out.println("Would you like to play a game? yes/no");
        Scanner playGame = new Scanner(System.in);
        //use two dimensional array to store dice
        String[][] dice = new String[6][5];
        String[][] gameDice = new String[DICENUM][5];
        String playAgain = playGame.next();

        defineDice(dice);
        printDice(dice);

        //use a while loop to play until quit
        while(playAgain.equals("yes")){

            System.out.println(rollDice());

            printDice(dice);

            printRow(dice);

            drawLine();

            //exit the game here if wants
            System.out.println("Would you like to play again? yes/no");
            playAgain = playGame.next();

        }

    }
    public static void defineDice(String[][]dice){

        System.out.println("define dice");
        //store values into array dice
        for (int i = 0;i < 6;i++){
            dice[i][0]= (" ------- ");
            dice[i][4]= (" ------- ");

            if (i == 0){
                dice[i][1]= ("|       |");
                dice[i][2]= ("|   *   |");
                dice[i][3]= ("|       |");

            }
            if(i == 1) {
                dice[i][1]= ("|       |");
                dice[i][2]= ("|  * *  |");
                dice[i][3]= ("|       |");

            }
            if(i == 2){
                dice[i][1]= ("| *     |");
                dice[i][2]= ("|   *   |");
                dice[i][3]= ("|     * |");
            }
            if (i == 3){
                dice[i][1]= ("|  * *  |");
                dice[i][2]= ("|       |");
                dice[i][3]= ("|  * *  |");
            }
            if (i == 4){
                dice[i][1]= ("|  * *  |");
                dice[i][2]= ("|   *   |");
                dice[i][3]= ("|  * *  |");
            }
            if (i == 5){
                dice[i][1]= ("|  * *  |");
                dice[i][2]= ("|  * *  |");
                dice[i][3]= ("|  * *  |");
            }





        }

    }
    //use a method to print the dices on top of each other
    public static void printDice(String[][]dice) {
        System.out.println("print dice");
        for (int i = 0; i < dice.length; i++) {
            for (int j = 0; j < dice[i].length; j++) {
                System.out.println(dice[i][j]);
            }
            System.out.println();
        }
    }
    //use a method to print dices next to each other
    public static void printRow(String[][]dice){

        int num1 = rollDice();
        int roll1 = num1;
        int num2 = rollDice();
        int roll2 = num2;
        int num3 = rollDice();
        int roll3 = num3;
        int num4 = rollDice();
        int roll4 = num4;
        int num5 = rollDice();
        int roll5 = num5;
        int num6 = rollDice();
        int roll6 = num6;
        int x;
        for (x = 0; x < dice[roll1].length; x++) {
            System.out.println(dice[roll1][x] + " " +
                    dice[roll2][x] + " " +
                    dice[roll3][x] + " " +
                    dice[roll4][x] + " " +
                    dice[roll5][x] + " " +
                    dice[roll6][x]);
        }
    }




    //return a random number between 1 and 6
    public static int rollDice(){
        int craps = (int) (Math.random()*6+1);
        return craps;
    }
    //draw a line between each time you roll
    public static void drawLine(){
        System.out.println("--------------------------------------------");
    }
}
