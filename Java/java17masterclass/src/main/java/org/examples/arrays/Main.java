package org.examples.arrays;

public class Main {
    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;
        System.out.println("\n-----------------------------------\n");

        double[] myDoubleArray = new double[5];
        myDoubleArray[2] = 3.5;
        System.out.println("Position 2 in double array: " + myDoubleArray[2]);

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("First element in firstTen: " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of firstTen array: " + arrayLength);
        System.out.println("Last element of firstTen array: " + firstTen[arrayLength-1]);

        System.out.println("\nCreating an array of reversed:");
        for(int i=0; i < myIntArray.length; i++) {
            myIntArray[i] = myIntArray.length-i;
            System.out.printf("element %d =  %d%n", i, myIntArray[i]);
        }

        System.out.println("\nUsing enhanced loop:");
        for(int elemenInArray : myIntArray){
            System.out.printf("element =  %d%n", elemenInArray);
        }




        System.out.println("\n-----------------------------------\n");


    }
}
