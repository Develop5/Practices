package com.Angie;

import java.util.Scanner;

public class RealAverage {

    private static int grades[];
    private static Scanner scannerGrades = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please, tell me how many grades you will enter:  ");
        grades = new int[scannerGrades.nextInt()];
        getAllGrades();
        System.out.print("Average = " + averageGrades());
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
