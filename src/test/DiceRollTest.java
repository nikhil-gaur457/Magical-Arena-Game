/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 13-11-2024
 *   Time: 00:02
 *   File: DiceRollTest.java
 */

package test;

import main.DiceRoll;

class DiceRollTest {
    public static void testDiceRollRange() {
        DiceRoll diceRoll = new DiceRoll();
        for (int i = 0; i < 25; i++) {
            int result = diceRoll.getDiceRoll();
            assert result >= 1 && result <= 6 : "Dice roll should be between 1 and 6";
        }
    }
}