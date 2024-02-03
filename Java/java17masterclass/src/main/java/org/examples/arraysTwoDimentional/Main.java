package org.examples.arraysTwoDimentional;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] twoDimentionalArray = new int[4][4];
        System.out.println("twoDimentionalArray length = " + twoDimentionalArray.length);
        System.out.println("Content: \n" + Arrays.toString(twoDimentionalArray));
        System.out.println("\nValues by row:");
        for (int[] outer: twoDimentionalArray) {
            System.out.println(Arrays.toString(outer));
        }
        System.out.println("\nIndividual values");
        for (int[] outer : twoDimentionalArray) {
            for (int inner : outer )
            System.out.println(inner);
        }
        System.out.println("\nIndividual indexes printed instead of values");
        for (int i = 0; i < twoDimentionalArray.length; i++) {
            var innerArray = twoDimentionalArray[i];
            for (int j = 0; j < innerArray.length; j++) {
                twoDimentionalArray[i][j] = (i * 10) + (j + 1);
            }
        }

        System.out.println(Arrays.deepToString(twoDimentionalArray));

    }
}
