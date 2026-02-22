package org.examples.minimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println("\n-----  Array created: " + Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);

    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers separated by commas: ");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] nonFeaturedArray) {
        int minimumValue = Integer.MAX_VALUE;
        for(int el: nonFeaturedArray) {
            if(el < minimumValue) {
                minimumValue = el;
            }
        }
        return minimumValue;


    }

}
