package com.animals.polymorphism.polymorphism;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feedAnimal(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        feedAnimal(sasha);

        sasha = new Cat();
        sasha.makeSound();
        feedAnimal(sasha);

        ((Cat) sasha).scratch();
        feedAnimal(sasha);
    }

    public static void feedAnimal(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("I like bones");
        }
        else if (animal instanceof Cat) {
            System.out.println("I like fish");
        }
        else {
            System.out.println("I'm a normal animal, give me generic food");
        }

    }
}
