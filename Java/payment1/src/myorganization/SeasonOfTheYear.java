package myorganization;

import java.util.Scanner;

public class SeasonOfTheYear {
    private static void main(String arg[]) {
        System.out.println("\n + Por favor, entre la estación del año -->  ");
        Scanner scanner = new Scanner(System.in);
        String station = scanner.next();

        System.out.println("\n + Ahora un adjetivo para esa estación del año -->  ");
        String adjectiveAsked = scanner.next();

        System.out.println("\n + Ahora, un número entero -->  ");
        String numberAsked = scanner.next();

        System.out.println();
        System.out.println("\n + En un/una " + adjectiveAsked + " " + station + " del año, me bebo un mínimo de " + numberAsked + " tazas de té  ");


    }
}
