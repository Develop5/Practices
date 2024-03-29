package main.java;

// Source: https://www.youtube.com/watch?v=rPSL1alFIjI

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static main.java.ListEmployees.Gender.*;

public class ListEmployees {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );
        // Imperative approach
        System.out.println("\n\nImperative approach");
        List<Person> females = new ArrayList<>();
        for (Person person: people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female: females) {
            System.out.println(female);
        }

        // Declarative approach
        System.out.println("\n\nDeclarative approach. 1st option");
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .forEach(System.out::println);

        System.out.println("\n\nDeclarative approach. 2nd option");
        List<Person> females2 = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
