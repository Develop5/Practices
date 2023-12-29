package main.java.org.examples.extrainheritance;

public class Main {
    public static void main(String[] args) {
        GeneralPerson genericPerson = new GeneralPerson("genericPerson", 34, "Miami");
        doPersonStuff(genericPerson, "plumber");

        Physician doctor0 = new Physician("Doctor NameAge", 47);
        doPersonStuff(doctor0, "assistant");

        Physician doctor1 = new Physician("Dr. Albert", 58, 300000, 29);
        doPersonStuff(doctor1, "surgeon");

        Physician doctor2 = new Physician("Dr. Henry Jr.", 25, 80000, 1);
        doPersonStuff(doctor2, "general physician");

        Student student0 = new Student("Harvard", 500);
        doPersonStuff(student0, "Master student");

        Student student1 = new Student("Richard", 25, "South Caroline", 400);
        doPersonStuff(student1, "Master student");

        Baker baker0 = new Baker(60000, 1000);
        doPersonStuff(baker0, "novice baker");

        Baker baker1 = new Baker("Experienced Baker", 45, "Oriol", 150000, 400);
        doPersonStuff(baker1, "experienced baker");

    }

    public static void doPersonStuff(GeneralPerson person, String occupation) {
        person.tellMeYourName();
        person.declareOccupation(occupation);
        person.tellMeYourCity();
        person.declareSalary();
        person.ageGroup();
        System.out.println("_ _ _ _");
    }
}
