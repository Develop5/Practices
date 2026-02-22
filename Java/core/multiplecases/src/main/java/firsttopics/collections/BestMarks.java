package main.java.firsttopics.collections;

import java.util.HashMap;
import java.util.Map;

public class BestMarks {
    public static void main(String[] args) {

        Map<String, Integer> firstGrades = TestResults.getOriginalGrades();
        Map<String, Integer> secondGrades = TestResults.getMakeUpGrades();
        Map<String, Integer> resultingGrades = new HashMap<>();

        secondGrades.forEach((key, value) -> {
            int first = firstGrades.get(key);
            int current = value;
            if (value > firstGrades.get(key)) {
                resultingGrades.put(key, value);
            } else resultingGrades.put(key, firstGrades.get(key));
        });

        System.out.println(" ----------------------------------------");
        resultingGrades.forEach(
                (k, v) -> System.out.println(k +" .. "+ "\tfinal grade: " + v + "\t\tOriginal: " + firstGrades.get(k) + "\t\tSecond: " + secondGrades.get(k))
        );

    }
}
