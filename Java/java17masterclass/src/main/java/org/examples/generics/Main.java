package org.examples.generics;

import static org.examples.Utilities.printDashes;
import static org.examples.Utilities.printRepeated;

interface Player{
    String name();
    // A method without a body is implicitly public and static on an interface.
}
// Created here because the record can implement interfaces but can't extend any classes


record BaseballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}
// Both methods have an implicit name accessor method already
//then they have the 'name()' method (declared in the interface above) implemented on them
record VolleyballPlayer(String name, String position) implements Player{}

public class Main {
    public static void main(String[] args) {
        printDashes();

        // I need to create a affiliation for the phillies
        // Info on affiliation can be anything that meets the record Affiliation
        var philly = new Affiliation("city", "Philadelphia, PA", "US");


        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResults(phillies1, 3, astros1, 5);

        SportsTeam phillies2 = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros2 = new SportsTeam("Houston Astros");
        scoreResults(phillies2, 3, astros2, 5);

        // I will include the created affiliation to the phillies team
        Team<BaseballPlayer, Affiliation> phillies = new Team<>("Philadelphia Phillies", philly);

        Team<BaseballPlayer, Affiliation> astros = new Team<> ("Houston Astros");
        scoreResults(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");

        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        var guthrie = new BaseballPlayer("D Guthrie", "Center Field");
        phillies.addTeamMember(guthrie);

        phillies.listTeamMembers();

        SportsTeam afc1 = new SportsTeam("Adelaide Crows");
        Team<FootballPlayer, Affiliation> afc = new Team<> ("Adelaide Crows");
        var tex = new FootballPlayer("Tex Walker", "Center half forward");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        Team<VolleyballPlayer, Affiliation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember(new VolleyballPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();

        var canberra = new Team<VolleyballPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VolleyballPlayer("B Black", "Opposite"));
        canberra.listTeamMembers();
        scoreResults(canberra, 0, adelaide, 1);

        //Team<Integer> melbourneVB = new Team<>("Melbourne Vipers");



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
        // Intellij is calling our attention on the reference Team above,
        //because we are making a raw use here

        String message = team1.setScore(team1_score, team2_score);
        team2.setScore(team2_score, team1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
