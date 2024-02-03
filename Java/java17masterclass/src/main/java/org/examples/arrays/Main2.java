package org.examples.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);      // Creates an array of integers
        System.out.println(Arrays.toString(firstArray));
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
