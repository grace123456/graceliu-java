public class DrawBox {
    public static void main(String[] args) {
        /*drawBox(3,4,'A');
        drawBox(5,6,'B');
        drawBox(9,10,'C');*/
       add(4,5);
       min(3,4,5);
    }
          /*public static void drawBox(int height, int width, char character){
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= width; j ++){
                System.out.print(character);
            }
            System.out.println();
        }
          }*/
          public static int add(int a, int b){
              System.out.println(a + b);

            return a + b;

          }
          public static int min(int a, int b, int c){
            int s = Math.min(Math.min(a,b),c);
              return s;
          }

}
