package com.collections;

import java.util.HashMap;
import java.util.Map;

public class BestMarks {
    public static void main(String[] args) {


        Map<String, Integer> firstGrades = TestResults.getOriginalGrades();
        Map<String, Integer> secondGrades = TestResults.getMakeUpGrades();
        Map<String, Integer> resultingGrades = new HashMap<>();

        for(var itemEntry : secondGrades.entrySet()) {
            int first = firstGrades.get(itemEntry.getKey());
            int current = itemEntry.getValue();
//            System.out.println(itemEntry.getKey() + "\tref = " + first +  "\t, current = " + current);
            if(itemEntry.getValue() > firstGrades.get(itemEntry.getKey())) {
                resultingGrades.put(itemEntry.getKey(), itemEntry.getValue());
            } else resultingGrades.put(itemEntry.getKey(), firstGrades.get(itemEntry.getKey()));
        }

        System.out.println(" ----------------------------------------");
        resultingGrades.forEach(
                (k, v) -> System.out.println(k +" .. "+ "\tfinal grade: " + v + "\t\tOriginal: " + firstGrades.get(k) + "\t\tSecond: " + secondGrades.get(k))
        );

    }
}
