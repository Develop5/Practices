package main.java.org.examples.extrainheritance;

public class GeneralPerson {
    private String name;
    private int age;
    private String profession;

    public GeneralPerson() {}                   // Empty constructor

    public GeneralPerson(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "GeneralPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }

    public void declareOcupation(String ocupation) {
        System.out.println("I am a: " + ocupation);
    }

    public void ageGroup(){
        System.out.println("I am " + (age > 55 ? "old" : "young"));
    }
}
