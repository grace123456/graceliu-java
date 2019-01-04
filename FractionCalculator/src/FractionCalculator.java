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
        System.out.println("Enter number or quit");
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        String[] split = number.split(" ");

        for (int i = 0; i < split.length; i++){
            System.out.println(split[i]);
        }

        while(!(number.equals("quit"))){


            System.out.println("Enter next number or quit");
            number = input.nextLine();
        }

    }


}
