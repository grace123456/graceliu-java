/*Grace Liu
Ms. Transue
AP Computer Science
18 October 2018
*/

public class Distance {
//use pirntln statements in main method to print the output of all distances and total distance
    public static void main(String[] args) {

        //call method distance for the first time to calculate distance from T to G
    double answer1 = distance(16,10,4,28);
        System.out.println("distance from Tacoma to Gig Harbor is " + answer1);

        //call mathod distance for the second time to calculate distance from G to S
    double answer2 = distance(4,28,2,8);
        System.out.println("distance from Gig Harbor to Steilacoom is " + answer2);

        //call method distance for the third time to calculate distance from S to T
    double answer3 = distance(2,8,16,10);
        System.out.println("distance from Steilacoom back to Tacoma is " + answer3);

        //print the total distance
        System.out.println("total travel distance is " + answer1 + answer2 + answer3);
    }


    /*Tacoma (16,10)
    Gig Harbor (4,28)
    Steilacoom (2,8)
    Spanaway (10,3)
    Bonney Lake (23,10)
    Auburn (21,21)
     */

    //create method distance and call method square root and power from math class to calculate distance from one city to another
    //return value since the method type is double
    public static double distance(double x1, double y1, double x2, double y2) {
        double d1 = x2 - x1;
        double d2 = y2 - y1;
        double dt = Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2));
        return dt;

    }

}