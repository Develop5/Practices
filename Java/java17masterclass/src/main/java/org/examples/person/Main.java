package person;

public class Main {
    public static void main(String[] args) {
        Person myperson = new Person();

        myperson.setFirstName("Roberto");
        myperson.setLastName("Fernández");
        myperson.setAge(15);

        System.out.println("First name: " + myperson.getFirstName());
        System.out.println("Last name: " + myperson.getLastName());
        System.out.println("Full name: " + myperson.getFullName());
        System.out.println("Is this person a teenager?: " + myperson.isTeen());
        System.out.println("This person is " + myperson.getAge() + " years old");
    }
}
