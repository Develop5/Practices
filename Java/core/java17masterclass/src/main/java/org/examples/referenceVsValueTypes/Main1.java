package org.examples.referenceVsValueTypes;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;    // Both variables point to the same address

        System.out.println("myArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 7;            // You are changing a memoery address. So, both arrays

        System.out.println("After change myArray = " + Arrays.toString(myIntArray));
        System.out.println("After change anotherArray = " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);
        System.out.println("After modifying myArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] arrayToModify) {
        arrayToModify[1] = 2;
    }
}
