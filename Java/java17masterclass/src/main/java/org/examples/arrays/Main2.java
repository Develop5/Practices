package org.examples.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("\nCreating a first array of random values and sorting it out.-");
        int[] firstArray = getRandomArray(10);      // Creates an array of integers
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println("First array: " + Arrays.toString(firstArray));

        System.out.println("\nSecond array, all same value.-");
        int[] secondArray = new int[10];
        Arrays.fill(secondArray, 5);
        System.out.println("Second array: " + Arrays.toString(secondArray));

        System.out.println("\nThird array, again, random.-");
        int[] thirdArray = getRandomArray(10);
        System.out.println("Third array: " + Arrays.toString(thirdArray));

        System.out.println("\nFourth array, copy of the third.-");
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println("Fourth array: " + Arrays.toString(fourthArray));

        System.out.println("\nSorting out the fourth array.-");
        Arrays.sort(fourthArray);
        System.out.println("Third array: " + Arrays.toString(thirdArray));
        System.out.println("Fourth array: " + Arrays.toString(fourthArray));

        System.out.println("\nSmaller array.-");
        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        // Partial copy
        System.out.println("Smaller array: " + Arrays.toString(smallerArray));

        System.out.println("\nLarger array.-");
        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        // Last elements will be filled in up with the null number which is zero
        System.out.println("Smaller array: " + Arrays.toString(largerArray));

        System.out.println("\nArray of Strings.-");
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println("Array of Strings: " + Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray,"Mark") >= 0) {
            System.out.println("Mark found in the array");
        }

        System.out.println("\nEquality on numerical arrays.-");
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5, 0};             // The order or elements in the array is important
        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are NOT equal");
        }
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];        // Creates an array of random integers, length provided
        for (int i=0; i < len; i++) {       // Populates the array of integers created
            newInt[i] = random.nextInt(100);    // Provides a random number below 100
        }
        return newInt;                      // returns the array created here
    }

}
