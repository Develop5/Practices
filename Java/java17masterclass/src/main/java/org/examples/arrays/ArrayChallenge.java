package org.examples.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        System.out.println("\n------------------ Array challenge.-");
        int[] fiveIntegers = getRandomArray(5);
        System.out.println("Initial array: " + Arrays.toString(fiveIntegers));
        Arrays.sort(fiveIntegers);
        System.out.println("Sorted array: " + Arrays.toString(fiveIntegers));
        System.out.println("Array reverted: " + Arrays.toString(revertArrayOfIntegers(fiveIntegers)));


    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i=0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    private static int[] revertArrayOfIntegers(int[] originalArray) {
        int[] temporaryArray = new int[originalArray.length];
        Arrays.sort(originalArray);                 // ensure any array is sorted first
        for (int i = 0; i < originalArray.length; i++) {
            temporaryArray[i] = originalArray[originalArray.length -1 - i];
        }
        return temporaryArray;
    }
}
