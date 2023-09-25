package csc223_cdunton_mod4;

/**
 * Author: Cory Dunton
 * Date: 9/21/2023
 * 
 * Coin Change Calculator Assignment
 *
 * Given a valid monetary double value, the objective of this assignment is to
 * implement the calculateChange method that will determine the fewest coins
 * required to make the leftover change (i.e., excluding the dollar amount).
 *
 * For example, if the input is 3.48, your method should consider only the 0.48
 * to determine the coins needed.
 *
 * Instructions: 1. Implement the calculateChange method. 2. Ensure that you use
 * the fewest number of coins. 3. The order of coins in the returned array
 * should be [# of quarters, # of dimes, # of nickels, # of pennies]. 4. Test
 * your method with the provided JUnit5 tests.
 */

public class CoinChangeCalculator {

	/**
	 * Calculate the change using the fewest coins.
	 *
	 * @param amount The amount for which to calculate the leftover change.
	 * @return An array representing [quarters, dimes, nickels, pennies].
	 */
	public int[] calculateChange(double amount) {
	    // TODO: Implement this method
		int cents =(int) ((amount % 1) * 100);

	    // Calculate the number of each coin needed to make the leftover change
		int quarters = cents / 25;
		cents %= 25;
		
		int dimes = cents / 10;
		cents %= 10;
		
		int nickels = cents / 5;
		cents %= 5;
		
		int pennies = cents;
		
		// Create and return an array containing [quarters, dimes, nickels, pennies]
		int[] change = {quarters, dimes, nickels, pennies};
		return change;
	}

	public static void main(String[] args) {
		// Optional: You can use this main method for your own testing
        CoinChangeCalculator calculator = new CoinChangeCalculator();

        // Example: Calculate change for $3.48
        double amount = 3.48;
        int[] change = calculator.calculateChange(amount);

        // Print the result
        System.out.println("Quarters: " + change[0]);
        System.out.println("Dimes: " + change[1]);
        System.out.println("Nickels: " + change[2]);
        System.out.println("Pennies: " + change[3]);
	}
}
