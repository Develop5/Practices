package org.examples.interfaceChallenge;

import java.util.ArrayList;
import java.util.List;

import static org.examples.Utilities.printDashes;

public class Main {
    public static void main(String[] args) {

        printDashes();

        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));

        for (var m: mappables) {
            Mappable.mapIt(m);
        }

        printDashes();

    }
}
