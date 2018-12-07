import java.util.Scanner;
import java.util.Arrays;

public class Dice {
    public static final int DICENUM = 1;
    public static void main(String[] args) {
        System.out.println("Would you like to play a game? yes/no");
        Scanner playGame = new Scanner(System.in);
        String[][] dice = new String[6][5];
        String[][] gameDice = new String[DICENUM][5];
        String playAgain = playGame.next();

        defineDice(dice);
        printDice(dice);

        while(playAgain.equals("yes")){

            rollDice();

            printDice(gameDice);

            drawLine();

            System.out.println("Would you like to play again? yes/no");
            playAgain = playGame.next();

        }

    }
    public static void defineDice(String[][]dice){

        System.out.println("define dice");

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

    public static void printDice(String[][]dice){
        System.out.println("print dice");
        for(int i = 0; i<dice.length; i++)
        {
            for(int j = 0; j<dice[i].length; j++)
            {
                System.out.println(dice[i][j]);
            }
            System.out.println();
        }



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
