package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * The Singleton pattern ensures that only one GameService object exists
 * in memory at a time. In this application, that is important because
 * GameService manages the master list of active games and the next game ID.
 * If multiple GameService objects existed, duplicate IDs or inconsistent
 * game data could occur.
 * 
 * The Iterator pattern is used to step through the list of active games.
 * This allows the application to check each existing game to make sure a
 * new name is unique and to retrieve games by ID or name without creating
 * duplicate objects.
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	private static long nextTeamId = 1;
    private static long nextPlayerId = 1;

	/**
	 * Holds the single instance of this class
	 */
    private static GameService instance = null;

	/**
	 * Private constructor prevents direct instantiation.
	 */
	private GameService() {
	}

	/**
	 * Returns the single instance of GameService.
	 * 
	 * @return the singleton instance
	 */
	public static GameService getInstance() {
		if (instance == null) {
            instance = new GameService();
        }
		
		return instance;
	} 

	/**
	 * Adds a new game if the game name is not already in use.
     * Uses the iterator pattern to search for an existing game first.
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// Use iterator to look for an existing game with the same name.
		// If one is found, return that existing instance instead of
		// creating a duplicate.
		Iterator<Game> iterator = games.iterator();
		while (iterator.hasNext()) {
			Game existingGame = iterator.next();
			if (existingGame.getName().equals(name)) {
				game = existingGame;
				break;
			}
		}
		
		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with same id.
		Iterator<Game> iterator = games.iterator();
		while (iterator.hasNext()) {
			Game existingGame = iterator.next();
			if (existingGame.getId() == id) {
				game = existingGame;
				break;
			}
		}

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with same name.
		Iterator<Game> iterator = games.iterator();
		while (iterator.hasNext()) {
			Game existingGame = iterator.next();
			if (existingGame.getName().equals(name)) {
				game = existingGame;
				break;
			}
		}

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
	
	/**
     * Adds a team to the specified game.
     *
     * @param game game object
     * @param teamName unique team name
     * @return existing or newly created team
     */
    public Team addTeam(Game game, String teamName) {
        if (game == null) {
            return null;
        }

        return game.addTeam(teamName);
    }

    /**
     * Adds a player to the specified team.
     *
     * @param team team object
     * @param playerName unique player name
     * @return existing or newly created player
     */
    public Player addPlayer(Team team, String playerName) {
        if (team == null) {
            return null;
        }

        return team.addPlayer(playerName);
    }
    
    /**
     * Returns the next available unique team identifier.
     * This method increments the team ID counter to ensure that
     * each team created in the application has a unique ID.
     * @return the next unique team ID
     */
    public long getNextTeamId() {
        return nextTeamId++;
    }
    
    /**
     * Returns the next available unique player identifier.
     * This method increments the player ID counter to ensure that
     * each player created in the application has a unique ID.
     * @return the next unique player ID
     */
    public long getNextPlayerId() {
        return nextPlayerId++;
    }
    
}
