public class Person {
    // write code here

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String enteredName) {
        firstName = enteredName;

    }


    public void setLastName(String enteredLastName) {
        lastName = enteredLastName;
    }

    public void setAge(int enteredAge) {
        if (enteredAge <= 12 ||enteredAge > 100){
            age = 0;
        } else age = enteredAge;
    }

    public boolean isTeen() {
        return (age > 12);
    }

    public String getFullName() {
        if (firstName == "" && lastName == "") {
            return "";
        } else return (firstName + " " + lastName);
    }

}
