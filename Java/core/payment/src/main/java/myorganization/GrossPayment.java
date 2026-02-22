package main.java.myorganization;

import java.util.Scanner;

public class GrossPayment {

    public static void main(String[] arg) {

        System.out.println("Enter the number __ ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt() * 2;
        scanner.close();
        System.out.println("El resultado es: " + hours);

    }
}
