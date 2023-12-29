package main.java.org.examples.extrainheritance;

public class Main {
    public static void main(String[] args) {
        GeneralPerson genericPerson = new GeneralPerson("genericPerson", 34, "Miami");
        doPersonStuff(genericPerson, "plumber");

        Physician doctor1 = new Physician("Dr. Albert", 58, 300.000, 29);
        doPersonStuff(doctor1, "surgeon");

        Physician doctor2 = new Physician("Dr. Henry Jr.", 25, 80.000, 1);
        doPersonStuff(doctor2, "general physician");

        Student student1 = new Student("Richard", 25, "South Caroline", 400);
        doPersonStuff(student1, "Master student");

    }

    public static void doPersonStuff(GeneralPerson person, String occupation) {
        person.tellMeYourName();
        person.declareOccupation(occupation);
        person.tellMeYourCity();
        person.ageGroup();
        System.out.println("_ _ _ _");
    }
}
