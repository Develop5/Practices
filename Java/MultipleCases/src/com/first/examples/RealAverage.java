package com.first.examples;

import java.util.Arrays;
import java.util.Scanner;

public class RealAverage {

    private static int grades[];
    private static Scanner scannerGrades = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please, tell me how many grades you will enter:  ");
        grades = new int[scannerGrades.nextInt()];
        getAllGrades();
        System.out.println("Average = " + String.format("%.2f", averageGrades()));
        Arrays.sort(grades);
        System.out.println("The highest grade = " + getHighest());
        System.out.println("The lowest grade = " + getLowest());
        scannerGrades.close();
    }

    private static double getLowest() {
        return grades[0];
    }

    private static double getHighest() {
        return grades[grades.length - 1];
    }


    public static double averageGrades() {
        double gradesTotal = 0;
        for (int everyGrade : grades) {
            gradesTotal += everyGrade;
        }
        return (gradesTotal / grades.length);
    }

    private static void getAllGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade : ");
            grades[i] = scannerGrades.nextInt();
        }
    }


}
