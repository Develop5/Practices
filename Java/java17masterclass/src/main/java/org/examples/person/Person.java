package person;

public class Person {
    // write code here

    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String enteredName) {
        firstName = enteredName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setAge(int enteredAge) {
        if (enteredAge <= 12 ||enteredAge > 100){
            age = 0;
        } else age = enteredAge;
    }
    public int getAge() {
        return age;
    }

    public void setLastName(String enteredLastName) {
        lastName = enteredLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isTeen() {
        return ((age > 12 && age < 20) ? true: false);
    }

    public String getFullName() {
        if (firstName == "" && lastName == "") { return "";}
        else if (firstName != "" && lastName == "") {return firstName;}
        else if (firstName == "" && lastName != "") {return lastName;}
        else return (firstName + " " +lastName);
    }

}
