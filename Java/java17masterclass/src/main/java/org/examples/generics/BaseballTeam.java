package org.examples.generics;

import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {
    String teamName;

    private List<BaseballPlayer> teamMembers = new ArrayList<>();
    // This is a best practice: to use interface type for the reference variable

    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public BaseballTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(BaseballPlayer player) {
        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }



}
