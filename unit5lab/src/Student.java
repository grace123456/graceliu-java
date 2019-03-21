import java.util.ArrayList;


public class Student {
    String studentName;
    String studentGrade;
    ArrayList<Double> grades;

    public Student(String name, String grade) {
        studentName = name;
        studentGrade = grade;
    }

    public boolean passingOrFailing () {
        double total = 0;
        double average = 0;
        for (int i = 0; i < grades.size(); i++) {

            total += grades.get(i);
        }
            average = total / grades.size();

            if (average >= 0.65){
                return true;
            } else {
                return false;



        }
    }

    public int numberOfClasses (){
        return grades.size();
    }

    public String name (){
        return studentName;
    }

    public String grade(){
        return studentGrade;
    }

    public void addGrade(Double newGrade){

        grades.add(newGrade);
    }

    public String toString() {
        return "The student's name is" + studentName + ". and His or Her grade is" + studentGrade + ".";
    }
}
