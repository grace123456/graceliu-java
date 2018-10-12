/* Grace Liu
Ms. Transue
AP Computer Science A
18 September 2018
  */


public class SixDays {
    //call each method in main method
    public static void main (String[] args){
        dayOne();
        verseOne();
        System.out.println();
        dayTwo();
        verseTwo();
        System.out.println();
        dayThree();
        verseThree();
        System.out.println();
        dayFour();
        verseFour();
        System.out.println();
        dayFive();
        verseFive();
        System.out.println();
        daySix();
        verseSix();
        }
    //print each day with a different method
    public static void dayOne(){
        System.out.println("On the 1st day of \"Xmas\", my true love sent to me");
    }
    //print verse one
    public static void verseOne(){
        System.out.println("a patridge in a pear tree");
    }
    public static void dayTwo(){
        System.out.println("On the 2nd day of \"Xmas\", my true love sent to me");
    }
    //print verse two and call verse one in verse two
    public static void verseTwo(){
        System.out.println("two turtle doves, and");
        verseOne();
    }
    public static void dayThree(){
        System.out.println("On the 3rd day of \"Xmas\", my true love sent to me");
    }
    public static void verseThree(){
        System.out.println("three French hens,");
        verseTwo();
    }
    public static void dayFour(){
        System.out.println("On the 4th day of \"Xmas\", my true love sent to me");
    }
    public static void verseFour(){
        System.out.println("four calling birds");
        verseThree();
    }
    public static void dayFive(){
        System.out.println("On the 5th day of \"Xmas\", my true love sent to me");
    }
    public static void verseFive(){
        System.out.println("five golden rings");
        verseFour();
    }
    public static void daySix(){
        System.out.println("On the 6th day of \"Xmas\", my true love sent to me");
    }
    public static void verseSix(){
        System.out.println("six geese a-laying");
        verseFive();
    }
}