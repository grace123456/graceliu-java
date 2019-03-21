public class Client {
    public static void main(String[] args) {
        Manager myManager = new Manager();
        myManager.getHours();
        myManager.getSalary();
        myManager.getVacationDays();
        myManager.getVacationForm();
        myManager.trackStatus();

        Engineer myEngineer = new Engineer();
        myEngineer.getHours();
        myEngineer.getSalary();
        myEngineer.getVacationDays();
        myEngineer.getVacationForm();
        myEngineer.testCode();

        SeniorEngineer mySeniorEngineer = new SeniorEngineer();
        mySeniorEngineer.getHours();
        mySeniorEngineer.getSalary();
        mySeniorEngineer.getVacationDays();
        mySeniorEngineer.getVacationForm();
        mySeniorEngineer.herdCats();;

        Janitor myJanitor = new Janitor();
        myJanitor.getHours();
        myJanitor.getSalary();
        myJanitor.getVacationDays();
        myJanitor.getVacationForm();
        myJanitor.hardWork();;


    }


}
