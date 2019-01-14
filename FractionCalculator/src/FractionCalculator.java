/* Grace Liu
Ms. Transue
AP CS
20 January
*/

import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.lang.Integer;

public class FractionCalculator {
    public static void main(String[] args) {
        System.out.println("Continue or quit");

        Scanner input = new Scanner(System.in);
        String yes = input.next();

        /*String[] split = number.split(" ");

        for (int i = 0; i < split.length; i++){
            System.out.println(split[i]);
        }
        */


        while(!(yes.equals("quit"))){

            System.out.println("Enter number");

            String one = input.next();
            String two = input.next();
            String three = input.next();
            System.out.println(one);
            System.out.println(two);
            System.out.println(three);


            System.out.println("Enter next number or quit");
            yes = input.nextLine();

        }

        /*public static int parseWhole() {

        }

        public static int parseNumerator() {

        }

        public static int parseDenominator() {

        }
        */

    }


}
