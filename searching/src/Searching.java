public class Searching {


    public static void main(String[] args) {
        int[] array = {0,12,50,75,112,113,114,200,500,1000};
        System.out.println(sequentialSearch(112,array));
        System.out.println(binarySearch(112,array));

    }

    public static int sequentialSearch(int num, int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }


    public static int binarySearch(int num, int[]arr){
        int min = 0;
        int max = arr.length-1;

        while(min<=max){
            int mid = (min + max)/2;
            if(num==arr[mid]){
                return mid;
            }else if(num<arr[mid]){
                max = mid-1;

            }else if(num>arr[mid]){
                min = mid+1;

            }

        }
        return -1;
    }

}
