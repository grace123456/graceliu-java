import java.util.Scanner;
import java.util.Arrays;

public class Dice {
    public static final int DICENUM = 1;
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
        String[][] dice = new String[6][5];
        String[][] gameDice = new String[DICENUM][];
        for (int i = 0;i < 6;i++){
            dice[i][0]= (" ------- ");
            dice[i][4]= (" ------- ");

            if (i == 0){
                dice[i][1]=  ("|       |");
                System.out.println("|   *   |");
                System.out.println("|       |");

            }else if(dice == 2) {
                System.out.println("|       |");
                System.out.println("|  * *  |");
                System.out.println("|       |");

            }else if(dice == 3){
                System.out.println("| *     |");
                System.out.println("|   *   |");
                System.out.println("|     * |");
            }else if (dice == 4){
                System.out.println("|  * *  |");
                System.out.println("|       |");
                System.out.println("|  * *  |");
            }else if (dice == 5){
                System.out.println("|  * *  |");
                System.out.println("|   *   |");
                System.out.println("|  * *  |");
            }else if (dice == 6){
                System.out.println("|  * *  |");
                System.out.println("|  * *  |");
                System.out.println("|  * *  |");
            }
            System.out.println(" ------- ");




        }

    }

    public static void printDice(){
        System.out.println("print dice");

    }

    public static int rollDice(){
        System.out.println("roll dice");
        int num = (int) Math.random()*6+1;
        return num;
    }

    public static void drawLine(){
        System.out.println("draw line");
        System.out.println("------------------------------------------");
    }
}
