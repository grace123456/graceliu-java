import java.util.Scanner;
public class Client {

    public static void main(String[] args) {
        System.out.println("Enter student name");
        Scanner studentName = new Scanner(System.in);
        String name = studentName.next();

        System.out.println("Enter student grade");
        Scanner studentGrade = new Scanner(System.in);
        String grade = studentGrade.next();

        System.out.println("Enter how many grades");
        Scanner numberOfGrades = new Scanner(System.in);
        String number = numberOfGrades.next();

        Student mystudent = new Student(name,grade);
        Double mygrade = Double.valueOf(grade);
        mystudent.addGrade(mygrade);

        mystudent.toString();
        mystudent.numberOfClasses();
        mystudent.passingOrFailing();
    }

}
