import java.util.Scanner;

public class WorkSheet1 {
    public static void main(String[] args) {
        //1
        int[] array = new int [8];
        //2a
        for (int i = 0; i <= 7; i ++){
            array[i] = i + 1;
        }
        //2b
        int[] initial = {1,3,5,7,9};


        //2c
        int[] array2 = {1,2,3,4,5,6,7,8};
        //2d
        Scanner input = new Scanner (System.in);
        for (int i = 0; i <= 7; i ++){
            array[i] = input.nextInt();
        }
        //2e
        int[] array3 = {-4,19,3,20,72,58};
        //3a
        System.out.println("last = " + array[array.length-1]);
        //3b
        System.out.println("middle = " + array[(array.length-1)/2]);
        //3c
        for (int i = 0; i <= 7; i ++){
            array[i] = i - 1;
        }
        //3d
        int[] even = new int[499];
        for (int i = 0; i < 999; i+=2){
            even[i] = i;
        }
        //3f
        System.out.println("#100 = " + even[100]);
        //3g
        System.out.println("#278 = " + even[278]);
        System.out.println("#456 = " + even[456]);
        //3h
        int[] odd = new int[10];
        for (int i = -4; i <= 5; i ++){
            odd[i] = i;
        }
        //3i
        int min = -10;
        int max = 10;
        for (int i = min; i <= max; i ++){
            odd[i] = i;
        }



    }
}
