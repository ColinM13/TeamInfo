package com.example.demo.controller;

import com.example.demo.model.Team;
import com.example.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/teams/random")
    public Team randomTeam() {
        return teamService.getRandomTeam();

    }

    @GetMapping("/teams")
    public List<Team> allTeams() {
        return teamService.getTeams();
    }

    @GetMapping("/teams/{name}")
    public Team teamByName(@PathVariable("name") String name) {
        return teamService.getTeamByName(name);
    }

}
