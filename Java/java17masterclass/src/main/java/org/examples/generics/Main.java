package org.examples.generics;

import static org.examples.Utilities.printDashes;

interface Player{}
// Created here because the record can implement interfaces but can't extend any classes


record BaseballPlayer(String name, String position) implements Player{}
record FootballPlaye(String name, String position) implements Player{}

public class Main {
    public static void main(String[] args) {
        printDashes();

        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResults(phillies1, 3, astros1, 5);

        SportsTeam phillies2 = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros2 = new SportsTeam("Houston Astros");
        scoreResults(phillies2, 3, astros2, 5);


        Team phillies = new Team("Philadelphia Phillies");
        Team astros = new Team("Houston Astros");
        scoreResults(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");

        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();

        SportsTeam afc = new SportsTeam("Adelaide Crows");
        var tex = new FootballPlaye("Tex Walker", "Center half forward");
        afc.addTeamMember(tex);
        afc.listTeamMembers();

        // This is not complete so far. I can introduce a baseball player into a football team:
        var guthrie = new BaseballPlayer("D Guthrie", "Center Field");
        afc.addTeamMember(guthrie);
        afc.listTeamMembers();




        printDashes();
    }

    public static void scoreResults(BaseballTeam team1, int team1_score,
                             BaseballTeam team2, int team2_score) {
        String message = team1.setScore(team1_score, team2_score);
        team2.setScore(team2_score, team1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResults(SportsTeam team1, int team1_score,
                                    SportsTeam team2, int team2_score) {
        String message = team1.setScore(team1_score, team2_score);
        team2.setScore(team2_score, team1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResults(Team team1, int team1_score,
                                    Team team2, int team2_score) {
        String message = team1.setScore(team1_score, team2_score);
        team2.setScore(team2_score, team1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
