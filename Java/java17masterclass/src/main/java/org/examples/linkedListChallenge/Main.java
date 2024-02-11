package org.examples.linkedListChallenge;

import java.util.*;

record Place(String name, int distance) {       // Using record, the LinkedList can handle 2 params
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}
public class Main {
    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        System.out.println("\n" + "_".repeat(50));
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Perth", 39));    // Duplicated after similar
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));
        addPlace(placesToVisit, new Place("Brisbane", 917));    // Duplicated way from similar

        placesToVisit.addFirst(new Place("Sydney", 0));

        System.out.println("-".repeat(50) + "\nFinal list: \n" + placesToVisit + "\n" + "-".repeat(50));

    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        // Receives the whole list of places and an individual place to add
        // Not needed, as it is again compares in the block below
        //if (list.contains(place)) {
        //    System.out.println("Found duplicate: " + place);        // If the place exists, it returns here
        //    return;
        //}

        // "list" is the whole list of places
        for (Place p : list) {              // The place is new
            if (p.name().equalsIgnoreCase(place.name())) {
                // Comparing tne new name with each name existing in LinkedList
                // If the name exists, it returns right here by doing nothing
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0;           // Points to the first element in the list
        // "list" is the whole list
        // "listPlace" represents each element in the list
        for (var listPlace : list) {
            // This traverses the whole list of distances
            if (place.distance() < listPlace.distance()) {
                // if the new place's distance is shorter than the current distance,
                // the new places is inserted in the current position.
                // The rest is shifted to the right and the method of adding ends
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;         // Points to the next element in the list
        }
        list.add(place);            // If the distance was not shorter, the element is added at the end
    }

}
