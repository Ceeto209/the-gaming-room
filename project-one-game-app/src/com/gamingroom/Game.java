package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A Game contains one or more teams.
 * Inherits common id and name fields from Entity.
 */
public class Game extends Entity {
    private List<Team> teams = new ArrayList<Team>();

    /**
     * Constructor for Game.
     *
     * @param id   unique identifier
     * @param name unique game name
     */
    public Game(long id, String name) {
        super(id, name);
    }

    /**
     * Adds a team to the game if the team name is not already in use.
     * Uses the iterator pattern to search for an existing team first.
     *
     * @param id   unique team identifier
     * @param name unique team name
     * @return existing or newly created team
     */
    public Team addTeam(String name) {
        Team team = null;

        // Search for an existing team with the same name
        Iterator<Team> iterator = teams.iterator();
        while (iterator.hasNext()) {
            Team existingTeam = iterator.next();
            if (existingTeam.getName().equalsIgnoreCase(name)) {
                team = existingTeam;
                break;
            }
        }

        // If team does not exist, create and add a new one
        if (team == null) {
        	long id = GameService.getInstance().getNextTeamId();
            team = new Team(id, name);
            teams.add(team);
        }

        return team;
    }

    /**
     * Returns the team at the specified index.
     *
     * @param index team index
     * @return team object
     */
    public Team getTeam(int index) {
        return teams.get(index);
    }

    /**
     * Returns the team with the specified name.
     *
     * @param name team name
     * @return matching team or null if not found
     */
    public Team getTeam(String name) {
        Team team = null;

        Iterator<Team> iterator = teams.iterator();
        while (iterator.hasNext()) {
            Team existingTeam = iterator.next();
            if (existingTeam.getName().equalsIgnoreCase(name)) {
                team = existingTeam;
                break;
            }
        }

        return team;
    }

    /**
     * Returns the number of teams in the game.
     *
     * @return team count
     */
    public int getTeamCount() {
        return teams.size();
    }

    /**
     * Returns a string representation of the game.
     *
     * @return formatted game string
     */
    @Override
    public String toString() {
        return "Game [id=" + id + ", name=" + name + ", teamCount=" + teams.size() + "]";
    }
}