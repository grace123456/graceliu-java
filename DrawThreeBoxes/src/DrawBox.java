public class DrawBox {
    public static void main(String[] args) {
        drawBox(3,4,'A');
    }
          public static void drawBox(int height, int width, char character){
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= width; j ++){
                System.out.print(character);
            }
            System.out.println();
        }
          }

}
