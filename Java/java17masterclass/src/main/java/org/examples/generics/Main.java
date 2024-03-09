package org.examples.generics;

import static org.examples.Utilities.printDashes;

interface Player{}
// Created here because the record can implement interfaces but can't extend any classes


record BaseballPlayer(String name, String position){}
public class Main {
    public static void main(String[] args) {

        printDashes();
        BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros = new BaseballTeam("Houston Astros");
        scoreResults(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");

        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();

        printDashes();
    }

    public static void scoreResults(BaseballTeam team1, int team1_score,
                             BaseballTeam team2, int team2_score) {
        String message = team1.setScore(team1_score, team2_score);
        team2.setScore(team2_score, team1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
