package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A Team belongs to a game and contains multiple players.
 * Inherits common id and name fields from Entity.
 */
public class Team extends Entity {
    private List<Player> players = new ArrayList<Player>();

    /**
     * Constructor for Team.
     *
     * @param id   unique identifier
     * @param name unique team name
     */
    public Team(long id, String name) {
        super(id, name);
    }

    /**
     * Adds a player to the team if the player name is not already in use.
     * Uses the iterator pattern to search for an existing player first.
     *
     * @param id   unique player identifier
     * @param name unique player name
     * @return existing or newly created player
     */
    public Player addPlayer(String name) {
        Player player = null;

        // Search for an existing player with the same name
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player existingPlayer = iterator.next();
            if (existingPlayer.getName().equalsIgnoreCase(name)) {
                player = existingPlayer;
                break;
            }
        }

        // If player does not exist, create and add a new one
        if (player == null) {
        	long id = GameService.getInstance().getNextPlayerId();
            player = new Player(id, name);
            players.add(player);
        }

        return player;
    }

    /**
     * Returns the player at the specified index.
     *
     * @param index player index
     * @return player object
     */
    public Player getPlayer(int index) {
        return players.get(index);
    }

    /**
     * Returns the player with the specified name.
     *
     * @param name player name
     * @return matching player or null if not found
     */
    public Player getPlayer(String name) {
        Player player = null;

        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player existingPlayer = iterator.next();
            if (existingPlayer.getName().equalsIgnoreCase(name)) {
                player = existingPlayer;
                break;
            }
        }

        return player;
    }

    /**
     * Returns the number of players on the team.
     *
     * @return player count
     */
    public int getPlayerCount() {
        return players.size();
    }

    /**
     * Returns a string representation of the team.
     *
     * @return formatted team string
     */
    @Override
    public String toString() {
        return "Team [id=" + id + ", name=" + name + ", playerCount=" + players.size() + "]";
    }
}