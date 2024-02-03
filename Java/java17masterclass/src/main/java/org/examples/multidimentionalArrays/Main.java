package org.examples.multidimentionalArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nOne-dimensional array of objects.-");
        Object[] anyArray = new Object[3];      // One-dimensional array
        System.out.println(Arrays.toString(anyArray));

        System.out.println("\nFirst rwo is a one-dimensional array of objects.-");
        anyArray[0] = new String[]{"1", "2", "3"};  // One-dimensional array
        System.out.println(Arrays.deepToString(anyArray));

        System.out.println("\nSecond row is a two-dimensional array of objects. Three rows.-");
        anyArray[1] = new String[][]{
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        System.out.println("\nThird row is a three-dimensional array.-");
        anyArray[2] = new String[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        System.out.println("\nCharacteristics of every row in the array.-");
        for (Object element: anyArray) {
            System.out.println("\nElement type: " + element.getClass().getSimpleName());
            System.out.println("Element to string: " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }





    }
}
