/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 13-11-2024
 *   Time: 00:04
 *   File: TestRunner.java
 */

package test;

public class TestRunner {
    public static void main(String[] args) {
        // Run Player Tests
        PlayerTest.testHealthReduction();
        System.out.println("PlayerTest.testHealthReduction passed");

        PlayerTest.testSetAndGetAttributes();
        System.out.println("PlayerTest.testSetAndGetAttributes passed");

        PlayerTest.testIsAlive();
        System.out.println("PlayerTest.testIsAlive passed");

        // Run DiceRoll Tests
        DiceRollTest.testDiceRollRange();
        System.out.println("DiceRollTest.testDiceRollRange passed");

        // Run MagicalArena Tests
        MagicalArenaTest.testGameOutcome();
        System.out.println("MagicalArenaTest.testGameOutcome passed");

        System.out.println("All tests passed.");
    }
}