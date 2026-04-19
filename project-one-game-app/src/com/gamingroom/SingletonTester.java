package com.gamingroom;

/**
 * Tests whether GameService truly behaves as a singleton.
 * 
 * @author coce@snhu.edu
 */
public class SingletonTester {

	/**
     * Tests the singleton pattern by comparing two references.
     */
	public void testSingleton() {
		
		System.out.println("\nSingleton Test...");
		
		GameService service1 = GameService.getInstance();
        GameService service2 = GameService.getInstance();
		
        if (service1 == service2) {
            System.out.println("Success! Both variables contain the same GameService instance.");
        } else {
            System.out.println("Error! Variables contain different GameService instances.");
        }

	}
	
}
