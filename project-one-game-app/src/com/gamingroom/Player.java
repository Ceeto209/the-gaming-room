package com.gamingroom;

/**
 * A Player is a game participant assigned to a team.
 * Inherits common id and name fields from Entity.
 */
public class Player extends Entity {

    /**
     * Constructor for Player.
     *
     * @param id   unique identifier
     * @param name unique player name
     */
    public Player(long id, String name) {
        super(id, name);
    }

    /**
     * Returns a string representation of the player.
     *
     * @return formatted player string
     */
    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + "]";
    }
}
