package org.examples.enumtype;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("_".repeat(50));

        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);
        System.out.printf("Name is %s, Ordinal value = %d%n",
                weekDay.name(), weekDay.ordinal());

        System.out.println("_".repeat(50));
    }

    public static DayOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger];


    }
}
