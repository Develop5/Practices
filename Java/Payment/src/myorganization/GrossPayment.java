package myorganization;

import java.util.Scanner;

public class GrossPayment {

    public static void main(String arg[]) {

        System.out.println("Enter the number __ ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt() * 2;
        scanner.close();
        System.out.println("El resultado es: " + hours);

        boolean b1 = ( 25 == 5*5);
        System.out.println("¿Verdadero o falso? " + b1);
    }
}
