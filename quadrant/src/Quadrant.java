public class Quadrant {
    public static void main(String[] args) {

        int output = quadrant(-4.5, 6.8);
        System.out.println("The point is in quadrant " + output);
    }

    public static int quadrant(double x, double y) {

        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }


    }
}

