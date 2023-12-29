package main.java.org.examples.extrainheritance;

public class Physician extends GeneralPerson{
    private double salary;
    private int yearsOfExperience;

    public Physician(String name, int age) {
        this(name, age, 100.000, 7);
    }

    public Physician(String name, int age, double salary, int yearsOfExperience) {
        super(name, age, salary > 200.000 ? "Oregon" : "Miami");
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Physician{" +
                "salary=" + salary +
                ", yearsOfExperience=" + yearsOfExperience +
                "} " + super.toString();
    }

    public void declareOccupation(String occupation) {
        // This one overrides (and does not need to say it) the declareOccupation from parent
        System.out.println("I am a doctor and work extra hours in ");
    }



    @Override
    public void ageGroup() {
        super.ageGroup();
        mainActivity();
        getUp();
        if (yearsOfExperience < 2 ) {
            noviceDoctor();
        } else experiencedDoctor();
    }

    private void getUp(){
        System.out.println("I get up at 6:00am");
    }

    private void mainActivity() {
        System.out.println("I diagnose");
    }

    private void noviceDoctor(){
        System.out.println("Specific about being a physician: I am a novice doctor practitioner");
    }

    private void experiencedDoctor(){
        System.out.println("Specific about being a physician: I am closer to my retirement");
    }
}
