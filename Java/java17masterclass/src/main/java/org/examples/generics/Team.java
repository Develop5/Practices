package org.examples.generics;

import java.util.ArrayList;
import java.util.List;

record Affiliation (String name, String type, String countryCode) {
    @Override
    public String toString() {
        return name + " (" + type + " in " + countryCode + " )";
        // It could be an abstract class instead, but this one is the simplest solution right now.
    }
}
public class Team<T extends Player, S> {

    // <T extends Player, Affiliation> is the new topic here
    // We don't want Team to be used by any class under the sun.
    // Instead, we want it to work only for things that implement the Player interface
    // and that's why "extends Player"
    // This needs some changes, though.
    String teamName;

    private List<T> teamMembers = new ArrayList<>();
    // This is a best practice: to use interface type for the reference variable

    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;
    private S affiliation;


    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, S affiliation) {
    }

    public void addTeamMember(T t) {
        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Roster:");
        System.out.println(affiliation == null ? "" : " AFFILIATION: " + affiliation);
        // But 'affiliation' can be anything: a String, StringBuilder, class, interface or record
        // So, we will create a record in this very Team.java source code

        for (T t : teamMembers) {
            System.out.println(t.name());
        }
    }

    public int ranking(){
        return (totalLosses *2 + totalTies + 1);
    }

    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}
