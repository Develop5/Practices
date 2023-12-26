package main.java.org.examples.recordtype;

import main.java.org.examples.thepojo.Student;

public class Main {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            LPAStudent student = new LPAStudent("S92300" +i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "JavaMasterClass");
            System.out.println(student);
        }
        System.out.println("\nSee the format differences as follows:\n----------------------------------------\n");
        Student pojoStudent = new Student("5923007", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("5923007", "Bill", "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getClass());
    }
}
