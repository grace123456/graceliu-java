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

    public static int whole1;
    public static int whole2;
    public static int num1;
    public static int num2;
    public static int den2;
    public static int den1;
    public static int wholefinal;
    public static int numfinal;
    public static int denfinal;


    public static void main(String[] args) {
        System.out.println("Continue or quit");

        Scanner input = new Scanner(System.in);
        String yes = input.next();

        /*String[] split = number.split(" ");

        for (int i = 0; i < split.length; i++){
            System.out.println(split[i]);
        }
        */


        while (!(yes.equals("quit"))) {

            System.out.println("Enter number");

            String one = input.next();
            String operator = input.next();
            String two = input.next();
            System.out.println(one);
            System.out.println(operator);
            System.out.println(two);

            //parse operand1
            if (one.contains("_")) {
                whole1 = parseWhole(one);
                num1 = parseNum(one);
                den1 = parseDen(one);
                num1 = (whole1 * den1 + num1);
            } else if (one.contains("/")) {
                num1 = parseNum(one);
                den1 = parseDen(one);
            } else {
                whole1 = Integer.parseInt(one);
                num1 = whole1;
                den1 = 1;
            }
            System.out.println("frac1 whole: " + whole1 + "\nfrac1 nume: " + num1 + "\nfrac1 denom: " + den1);
            //parse operand2
            if (two.contains("_")) {
                whole2 = parseWhole(two);
                num2 = parseNum(two);
                den2 = parseDen(two);
                num2 = (whole2 * den2 + num2);

            } else if (two.contains("/")) {
                num2 = parseNum(two);
                den2 = parseDen(two);
            } else {
                whole2 = Integer.parseInt(two);
                num2 = whole2;
                den2 = 1;
            }
            System.out.println("frac1 whole: " + whole2 + "\nfrac1 nume: " + num2 + "\nfrac1 denom: " + den2);


            System.out.println("Enter next number or quit");
            yes = input.nextLine();

        }


    }

    public static int parseWhole(String fraction) {
        int whole = Integer.parseInt(fraction.substring(0, fraction.indexOf("_")));
        return whole;
    }

    public static int parseNum(String fraction) {
        int num = Integer.parseInt(fraction.substring(fraction.indexOf("_") + 1, fraction.indexOf("/")));
        return num;
    }

    public static int parseDen(String fraction) {
        int Denom = Integer.parseInt(fraction.substring(fraction.indexOf("/") + 1));
        return Denom;
    }

    /*public static int littleCalc(int x, int y, int i, int j, String o) {
        num1 = x;
        den1 = y;
        num2 = i;
        den2 = j;
        String operator = o;
        int answer = 0;

        if (operator.equals("+")) {
            return (answer = (num1 * den2 + den1 * num2) / (den1 * den2));
        } else if (operator.equals("-")){
            return (answer = (num1 * den2 - den1 * num2) / (den1 * den2));
        } else if (operator.equals("*")) {
            return (answer = (num1 * num2) / (den1 * den2));
        } else if (operator.equals("/")) {
            return (answer = (num1 * den2) / (num2 * den1));
        }
        return answer;
    }
    */
    public static String add(final int num1, final int den1, final int num2, final int den2) {
        int newn = (num1 * den2) + (num2 * den1);
        int newd = den1 * den2;

            /*int divisor = reduce(newn, newd);
            newn/=divisor;
            newd/=divisor;
            int integerComponent=0;

            while(newn >= newd) {
                integerComponent++;
                newn-=newd;
            }
            String answer ="";
            if(integerComponent>0) {
                answer += integerComponent +"_";
            }
            if(newn!=0) {
                answer += newn+"/"+newd;
            }
            return answer;
        }
        */


    }
}







