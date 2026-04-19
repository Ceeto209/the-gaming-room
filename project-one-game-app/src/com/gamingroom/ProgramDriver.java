package com.gamingroom;

/**
 * Driver class used to test the game application.
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// Test the singleton pattern
        SingletonTester tester = new SingletonTester();
        tester.testSingleton();

        // Get the single GameService instance
        GameService service = GameService.getInstance();

        // Add games
        System.out.println("\nAdding Games");
        Game game1 = service.addGame("Draw It or Lose It");
        Game game2 = service.addGame("Trivia Masters");
        Game game3 = service.addGame("Draw It or Lose It"); // duplicate test

        System.out.println(game1);
        System.out.println(game2);
        System.out.println(game3);

        // Add teams to a game
        System.out.println("\nAdding Teams");
        Team team1 = service.addTeam(game1, "Team Alpha");
        Team team2 = service.addTeam(game1, "Team Beta");
        Team team3 = service.addTeam(game1, "Team Alpha"); // duplicate test

        System.out.println(team1);
        System.out.println(team2);
        System.out.println(team3);

        // Add players to a team
        System.out.println("\nAdding Players");
        Player player1 = service.addPlayer(team1, "Israel");
        Player player2 = service.addPlayer(team1, "Alex");
        Player player3 = service.addPlayer(team1, "Israel"); // duplicate test

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

        // Show counts
        System.out.println("\nCounts");
        System.out.println("Total games: " + service.getGameCount());
        System.out.println("Teams in " + game1.getName() + ": " + game1.getTeamCount());
        System.out.println("Players in " + team1.getName() + ": " + team1.getPlayerCount());
	}
}
