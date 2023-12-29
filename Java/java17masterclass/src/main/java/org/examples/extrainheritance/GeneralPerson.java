package main.java.org.examples.extrainheritance;

public class GeneralPerson {
    private String name;
    private int age;
    private String city;

    public GeneralPerson() {}                   // Empty constructor

    public GeneralPerson(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "GeneralPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public void tellMeYourName() {
        System.out.println("My name is " + name);
    }

    public void tellMeYourCity(){
        System.out.println("in the city of " + city);
    }


    public void ageGroup(){
        System.out.println("I am " + (age > 55 ? "over 55 years old. " : "younger than 55. ") + "My age: " + age);
    }

    public void declareOccupation(String ocupation) {
        System.out.println("I am a: " + ocupation);
    }



}
