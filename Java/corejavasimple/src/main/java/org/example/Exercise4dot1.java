package org.example;
import java.time.*;

/**
 * @author Cay S. Horstmann
 */
public class Exercise4dot1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);
        // substract the amount of days of the current month to the current date
        // So, it gets the last month
        // minus-1  => goes to the beginning of next month, then, the current month
        // Conclussion: We will start at the beginning of the current month

        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        // 1 for Monday, 2 for Tuesday, etc...

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);        // Goes ahead 1 day
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();               // Carriage return at the beginning of each week
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();

    }

}
