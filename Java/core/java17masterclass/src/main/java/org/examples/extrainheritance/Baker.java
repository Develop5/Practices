package org.examples.extrainheritance;

public class Baker extends GeneralPerson{
    private double salary;
    private int dailyProduction;

    public Baker(double salary, int dailyProduction) {
        this("PreferredBaker",
                21,
                "Tampa",
                salary,
                dailyProduction);
    }

    public Baker(String name, int age, String city, double salary, int dailyProduction) {
        super(name, age, city);
        this.salary = salary;
        this.dailyProduction = dailyProduction;
    }

    public void declareOccupation(String occupation) {
        // This one overrides (and does not need to say it) the declareOccupation from parent
        System.out.println("I am a baker and DO NOT work extra hours");
    }

    @Override
    public void ageGroup() {
        super.ageGroup();
        freeTime();
    }

    public void freeTime() {
        System.out.println("I donate my free time to charity");
    }

    public void declareSalary() {
        System.out.println("My salary is: " + salary);
    }

    @Override
    public String toString() {
        return "Baker{" +
                "salary=" + salary +
                ", dailyProduction=" + dailyProduction +
                "} " + super.toString();
    }
}
