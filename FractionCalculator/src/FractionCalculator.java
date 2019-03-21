/* Grace Liu
Ms. Transue
AP CS
18 Feb. 2019
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



        while (!(yes.equals("quit"))) {
            num1 = 0;
            den1 = 0;
            num2 = 0;
            den2 = 0;

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
                System.out.println("hello");
                num1 = (whole1 * den1 + num1);
            } else if (one.contains("/")) {
                num1 = parseNum(one);
                den1 = parseDen(one);
            } else {
                whole1 = Integer.parseInt(one);
                num1 = 0;
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
                num2 = 0;
                den2 = 1;
            }
            System.out.println("frac1 whole: " + whole2 + "\nfrac1 nume: " + num2 + "\nfrac1 denom: " + den2);

            if (operator.contains("+")){
                System.out.println(add(num1, den1, num2, den2));
            } else if (operator.contains("-")) {
                System.out.println(subtract(num1, den1, num2, den2));
            } else if (operator.contains("*")) {
                System.out.println(multiply(num1, den1, num2, den2));
            } else if (operator.contains("/")) {
                System.out.println(divide(num1, den1, num2, den2));
            }

            System.out.println("Enter next number or quit");
            yes = input.nextLine();

        }


    }

    public static int parseWhole(String fraction) {

        if (fraction.contains("_")){
            int whole = Integer.parseInt(fraction.substring(0, fraction.indexOf("_")));
            return whole;
        } else {
            return 0;
        }
    }

    public static int parseNum(String fraction) {
        int num = Integer.parseInt(fraction.substring(fraction.indexOf("_") + 1, fraction.indexOf("/")));
        return num;
    }

    public static int parseDen(String fraction) {
        int Denom = Integer.parseInt(fraction.substring(fraction.indexOf("/") + 1));
        return Denom;
    }



    public static String add(final int num1, final int den1, final int num2, final int den2) {
        int a = whole1 * den1 + num1;
        int b = den1;
        int c = whole2 * den2 + num2;
        int d = den2;
        int ad = a*d;
        int bc = b*c;
        int bd = b*d;
        ad += bc;
        return ad + "/" + bd;


    }

    public static String subtract(final int num1, final int den1,
                                  final int num2, final int den2) {
        int a = whole1 * den1 + num1;
        int b = den1;
        int c = whole2 * den2 + num2;
        int d = den2;
        int ad = a * d;
        int bc = b * c;
        int bd = b * d;
        ad -= bc;
        return ad + "/" + bd;
    }

    public static String multiply(final int num1, final int den1,
                                  final int num2, final int den2) {
        int a = num1 + whole1 * den1;//1
        int b = den1;
        int c = num2 + whole2 * den2;
        int d = den2;
        int ad = a * c;
        int bd = b * d;
        return ad + "/" + bd;
    }

    public static String divide(final int num1, final int den1,
                                final int num2, final int den2) {
        int a = num1 + whole1 * den1;//1
        int b = den1;
        int c = num2 + whole2 * den2;
        int d = den2;
        int ad = a * d;
        int bd = b * c;
        return ad + "/" + bd;
    }

}
