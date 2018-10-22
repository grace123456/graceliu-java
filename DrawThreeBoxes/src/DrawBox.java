public class DrawBox {
    public static void main(String[] args) {
        /*drawBox(3,4,'A');
        drawBox(5,6,'B');
        drawBox(9,10,'C');*/

         /*public static void drawBox(int height, int width, char character){
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= width; j ++){
                System.out.print(character);
            }
            System.out.println();
        }
          }*/

        int answer1 = add(3,4);
        System.out.println(answer1);
        int answer2 = min(3,4,5);
         System.out.println(answer2);
         int answer3 = max(7,8,9);
        System.out.println(answer3);
        int answer4 = answer2 + answer3;
        System.out.println(answer4);
        System.out.println(Math.sqrt(answer4));
    }

          public static int add(int a, int b){
             int answer1 = Math.addExact(a,b);
             return answer1;

          }
          public static int min(int a, int b, int c){
            int answer2 = Math.min(Math.min(a,b),c);
              return answer2;
          }
          public static int max(int a, int b, int c){
              int answer3 = Math.max(Math.max(a,b),c);
              return answer3;
          }



          }



