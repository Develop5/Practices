package org.examples.linkedListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("_".repeat(50) + "\n");
        LinkedList<String> nameOfCity = new LinkedList<>();
        LinkedList<Integer> distanceToSidney = new LinkedList<>();
        nameOfCity.add("Adelaide"); distanceToSidney.add(1374);
        nameOfCity.add("Alice Sprins"); distanceToSidney.add(2771);
        nameOfCity.add("Brisbane"); distanceToSidney.add(917);
        nameOfCity.add("Darwin"); distanceToSidney.add(3972);
        nameOfCity.add("Melbourne"); distanceToSidney.add(877);
        nameOfCity.add("Perth"); distanceToSidney.add(3923);

        System.out.println("\n" + "-".repeat(50));
        System.out.println(nameOfCity);
        System.out.println(distanceToSidney);

        var cityIterator = nameOfCity.listIterator();
        var distanceIterator = distanceToSidney.listIterator();

        System.out.println("\n" + "-".repeat(50));

    }

    public static ArrayList distanceOrder(LinkedList<String> distanceList) {
        ArrayList<Integer> mydistance = new ArrayList<>();
        return mydistance;
    }
}
