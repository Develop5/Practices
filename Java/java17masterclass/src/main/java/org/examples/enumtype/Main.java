package org.examples.enumtype;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("_".repeat(50));

        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        for (int i = 0; i < 20; i++) {
            weekDay = getRandomDay();
            System.out.printf("Name is %s, Ordinal value = %d%n",
                    weekDay.name(), weekDay.ordinal());

            if (weekDay == DayOfTheWeek.FRI) {
                System.out.println("Found a Friday!!");
            }
        }

        System.out.println(getRandomDay());

        System.out.println("_".repeat(50));
    }

    public static DayOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger];
    }
}
