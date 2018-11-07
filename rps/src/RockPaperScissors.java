/*Grace Liu
Ms. Transue
AP Computer Science
7 November 2018
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        settings();
        playerInput();
        computerResponse();


    }
    public static void settings(){
        System.out.println("Enter name of player");
        Scanner console = new Scanner(System.in);
        String player = console.next();
        System.out.println("Enter how many rounds you want to play");
        int rounds = console.nextInt();


    }

    public static void playerInput(){
        System.out.println("Type in your choice!");
        Scanner console = new Scanner(System.in);
        int choice = console.nextInt();
       // 0 = Rock, 1 = Paper, 2 = Scissors


    }

    public static void computerResponse(){
        System.out.println("The computer chooses");
        Random r = new Random();
        int response = r.nextInt(3);
        System.out.println(response);
    }

    public static void compete(){

    }


}
