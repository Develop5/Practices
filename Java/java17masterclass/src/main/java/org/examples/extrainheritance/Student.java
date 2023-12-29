package main.java.org.examples.extrainheritance;

public class Student extends GeneralPerson{
    private String university;
    private double allowance;

    public Student(String university, double allowance) {
        this("No given Name", 17, university, allowance);
    }

    public Student(String name, int age, String university, double allowance) {
        super(name, age, university == "Harvard" ? "Harvard" : "New York");
        this.university = university;
        this.allowance = allowance;
    }

    public void declareSalary() {
        System.out.println("I do not receive a salary. My allowance = " + allowance);
    }
    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", allowance=" + allowance +
                "} " + super.toString();
    }
}
