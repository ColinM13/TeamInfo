package com.example.demo.service;


import com.example.demo.dao.TeamsDAO;
import com.example.demo.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class TeamService {

    @Autowired
    private TeamsDAO teamsDAO;

    public TeamService() {
    }

    public List<Team> getTeams() {
        return teamsDAO.getTeams();
    }

    public Team getTeamByID(int id) {
        return teamsDAO.getTeamById(id);
    }

    public Team getTeamByName(String name) {
        return teamsDAO.getTeamByName(name);
    }

    public Team getRandomTeam() {
        Random random = new Random();
        return teamsDAO.getTeamById(random.nextInt(teamsDAO.getTeamsSize()) + 1);
    }
}
