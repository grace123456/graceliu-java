import java.util.ArrayList;
public class ABC {

    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<String>();
        names.add("Billy");
        names.add("Johns");
        names.add("Tims");
        names.add("Sally");
        removePlural(names);
    }

    public static void removePlural(ArrayList<String> names){
        for (int i = 0; i < names.size(); i++){
            String str = names.get(i);
            if (str.endsWith("s")){
                names.remove(i);
                i--;
            }
        }
        System.out.println(names);
    }

}
