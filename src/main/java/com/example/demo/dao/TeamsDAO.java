package com.example.demo.dao;

import com.example.demo.model.Team;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TeamsDAO {

    private List<Team> teams;

    public TeamsDAO() {
        this.teams = new ArrayList<>();
        teams.add(new Team(1, "Stars", "Dallas", "#006847"));
        teams.add(new Team(2, "Mavericks", "Dallas", "#00538C"));
        teams.add(new Team(3, "Rangers", "Texas", "#C0111F"));
        teams.add(new Team(4, "Cowboys", "Dallas", "#041E42"));
        teams.add(new Team(5, "FC Dallas", "Dallas", "#d11241"));
    }

    public int getTeamsSize() {
        return this.teams.size();
    }

    public List<Team> getTeams() {
        return this.teams;
    }

    public Team getTeamByName(String name) {
        for(Team team : this.teams) {
            if(team.getName().toLowerCase().equals(name.toLowerCase())) {
                return team;
            }
        }
        return null;
    }

    public Team getTeamById(int id) {
        System.out.println(id);
        for(Team team : this.teams) {
            if(team.getId() == id) {
                return team;
            }
        }

        return null;
    }
}
