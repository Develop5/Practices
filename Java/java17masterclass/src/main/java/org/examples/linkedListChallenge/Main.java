package org.examples.linkedListChallenge;

import java.util.*;

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

        System.out.println(distanceOrder(distanceToSidney, nameOfCity));
        System.out.println("\n" + "-".repeat(50));
    }

    public static LinkedList<String> distanceOrder(LinkedList<Integer> distanceList,
                                     LinkedList<String> cities) {
        LinkedList<String> finalListOfCities = new LinkedList<>();
        LinkedList<Integer> sortedOut = (LinkedList<Integer>) distanceList.clone();
        sortedOut.sort(Comparator.naturalOrder());

        ListIterator<Integer> iteratedSorted = sortedOut.listIterator();
        while (iteratedSorted.hasNext()) {
            var value = iteratedSorted.next();      // Each number value, sorted out

            // Find the index of this value in the old arrange of integers:
            int indexOldDistance = distanceList.indexOf(value);

            // Take that index to refer the city:
            String city = cities.get(indexOldDistance);
            finalListOfCities.addLast(city);
        }
        return finalListOfCities;

    }
}
