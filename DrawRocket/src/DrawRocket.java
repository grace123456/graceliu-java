/*Grace Liu
AP Computer Science A
1st period
9 October 2018
 */



public class DrawRocket {
    //set up class constant so that I can only change one number to change the whole output
    public static final int CONSTANT = 1;

    //call all methods to print the rocket
    public static void main(String[] args) {
        topBottom();
        connection();
        bodyOne();
        bodyTwo();
        connection();
        bodyTwo();
        bodyOne();
        connection();
        topBottom();

    }

    //print thw triangular part of the rocket
    public static void topBottom() {
        //use for loop here, height = CONSTANT = 3, slashes are incrementing
        for (int i = 1; i <= CONSTANT*2; i++) {
            for (int t = CONSTANT*2-1; t >= i; t--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("/");
            }
            //print stars directly since they are unchanged
            System.out.print("**");
            for (int b = 1; b <= i; b++) {
                System.out.print("\\");
            }
            for (int c = CONSTANT*2; c >= 1; c--) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    //print the connecting parts of the rocketship
    public static void connection() {
        System.out.print("+");
        for (int i = 1; i <= CONSTANT*2; i++) {
            System.out.print("=*");
        }
        System.out.print("+");
        System.out.println();
    }


    //print the first body part where the dots decrement and slashes increment
    public static void bodyOne() {
        for (int a = 1; a <= CONSTANT; a++) {
            System.out.print("|");
            for (int b = 1; b <= 2; b++) {
                for (int i = CONSTANT - 1; i >= a; i--) {
                    System.out.print(".");
                }
                for (int t = 1; t <= a; t++) {
                    System.out.print("/\\");
                }
                for (int j = CONSTANT - 1; j >= a; j--) {
                    System.out.print(".");
                }
            }
            System.out.print("|");
            System.out.println();


        }
    }

    //print the second part of the body where the dots increment and slashes decrement
    public static void bodyTwo() {
        for (int i = 1; i <= CONSTANT; i++) {
            System.out.print("|");
            for (int j = 1; j <= 2; j++) {
                for (int n = 1; n < i; n++) {
                    System.out.print(".");
                }
                for (int t = CONSTANT; t >= i; t--) {
                    System.out.print("\\/");
                }
                for (int x = 1; x < i; x++) {
                    System.out.print(".");
                }

            }

            System.out.print("|");
            System.out.println();
        }
    }
}
