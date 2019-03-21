public class Recursion {
    public static void main(String[] args) {
        recursion(5);

    }

    public static void printStars(int a){
        for (int i = 0; i <= a; i++){
            System.out.println("*");
        }
    }

    public static void recursion(int a){
        if (a<=0){
            System.out.println("0");

        } else {
            a = a-1;
            System.out.println("*");
            recursion(a);

        }
    }

}
