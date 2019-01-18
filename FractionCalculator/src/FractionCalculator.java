/* Grace Liu
Ms. Transue
AP CS
20 January
*/

import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.lang.Integer;
import java.util.ArrayList;

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

        String fraction = "23/5_24/3";
        //parseWhole(fraction);
        //parseNumerator(fraction);
        parseDenomenator(fraction);

        while (!(yes.equals("quit"))) {

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



        /*public static int parseNumerator() {

        }

        public static int parseDenominator() {

        }*/


    }

    public static void parseWhole(String fraction) {
        String parse = "";
        for (int i = 0; i < fraction.length(); i++) {
            if (Character.isDigit(fraction.charAt(i))) {
                parse += fraction.charAt(i);
            } else {
                System.out.println(parse);
                parse = "";
            }
            //System.out.println(fraction.charAt(i ));

            }

        System.out.println(parse );

        }

        public static void parseNumerator(String fraction) {
            String parse = "";
            for (int i = 0; i < fraction.length(); i++) {
                if (Character.isDigit(fraction.charAt(i))) {
                    parse += fraction.charAt(i);
                } else {
                    System.out.println(parse);
                    parse = "";
                }
                //System.out.println(fraction.charAt(i ));

            }

            System.out.println(parse );

        }

        public static void parseDenomenator (String fraction){
            String parse = "";
            for (int i = 0; i < fraction.length(); i++) {
                if (Character.isDigit(fraction.charAt(i))) {
                    parse += fraction.charAt(i);
                } else {
                    System.out.println(parse);
                    parse = "";
                }
                //System.out.println(fraction.charAt(i ));

            }

            System.out.println(parse );

        }



    }



