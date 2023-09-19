package edu.vwcc.coins;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CoinChangeCalculatorTest {

    CoinChangeCalculator calculator = new CoinChangeCalculator();
    
    @Test
    public void testSmallestChange() {
        // $0.01 should return 1 penny
        assertArrayEquals(new int[]{0, 0, 0, 1}, calculator.calculateChange(0.01));
    }

    @Test
    public void testNoChangeForWholeDollar() {
        // $1.00 should return 0 coins
        assertArrayEquals(new int[]{0, 0, 0, 0}, calculator.calculateChange(1.00));
    }
   
    
    @Test
    public void testChangeFor48Cents() {
        // $0.48 should return 1 quarter, 2 dimes, and three pennies
        assertArrayEquals(new int[]{1, 2, 0, 3}, calculator.calculateChange(0.48));
    }

    @Test
    public void testChangeIgnoringDollarAmount() {
    	// $3.48 should return 1 quarter, 2 dimes, and three pennies
        assertArrayEquals(new int[]{1, 2, 0, 3}, calculator.calculateChange(3.48));
    }
    
    @Test
    public void testChangeRequiringAllCoins() {
        // $0.41 should return 1 quarter, 1 dime, 1 nickel, and 1 penny
        assertArrayEquals(new int[]{1, 1, 1, 1}, calculator.calculateChange(0.41));
    }
    
    @Test
    public void testLargeCentValueChange() {
    	// $0.99 should return 3 quarters, 2 dimes, and 4 pennies
        assertArrayEquals(new int[]{3, 2, 0, 4}, calculator.calculateChange(0.99));
    }

}
