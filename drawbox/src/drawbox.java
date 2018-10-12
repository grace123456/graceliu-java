public class drawbox {
    public static void main(String[] args) {
        drawBox();
        drawBox();
        drawBox();
    }
    public static void drawBox() {
        System.out.println();
        drawTopBottom();
        drawSides();
        drawSides();
        drawTopBottom();
    }
    public static void drawTopBottom(){
        System.out.println("+--------+");
    }
    public static void drawSides(){
        System.out.println("|        |");
    }
}
