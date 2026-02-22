package org.examples.autoboxingAndUnboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("\n" + "_".repeat(50));

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = getList(1, 2, 3, 4, 5);
        System.out.println(ourList);

        var ourList2 = List.of(1, 2, 3, 4, 5);
        System.out.println(ourList2);

        System.out.println("\n" + "_".repeat(50));


    }

    private static ArrayList<Integer> getList(int... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }

    private static int returnAPrimitiveInt(Integer i) {
        return i;
    }

    private static Integer returnAWrapperInteger(int i) {
        return i;
    }
}
