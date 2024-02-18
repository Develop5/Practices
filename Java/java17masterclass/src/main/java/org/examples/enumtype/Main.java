package org.examples.enumtype;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("_".repeat(50));

        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        for (int i = 0; i < 20; i++) {
            weekDay = getRandomDay();

//            System.out.printf("Name is %s, Ordinal value = %d%n",
//                    weekDay.name(), weekDay.ordinal());
//            if (weekDay == DayOfTheWeek.FRI) {
//                System.out.println("Found a Friday!!");
//            }

            switchDayOfWeek(weekDay);
        }

        System.out.println(".".repeat(50));

        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }


        System.out.println("_".repeat(50));
    }

    public static DayOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger];
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay) {
        // Want to print the order or the day, from 1 to 7
        int weekDayInteger = weekDay.ordinal() + 1;

        switch(weekDay) {
            case WED -> System.out.println("Wednesday is day : " + weekDayInteger);
            case SAT -> System.out.println("Saturday is day : " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInteger);
        }
    }
}
