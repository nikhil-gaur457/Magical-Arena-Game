/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 12-11-2024
 *   Time: 23:57
 *   File: PlayerTest.java
 */

package test;

import main.Player;

class PlayerTest {
    public static void testHealthReduction() {
        Player player = new Player(100, 10, 5);
        player.reduceHealth(10);
        assert player.getHealth() == 90 : "Health should be reduced by 10";
    }

    public static void testSetAndGetAttributes() {
        Player player = new Player(100, 10, 5);
        player.setHealth(80);
        assert player.getHealth() == 80 : "Health should be set to 80";

        player.setStrength(12);
        assert player.getStrength() == 12 : "Strength should be set to 12";

        player.setAttack(15);
        assert player.getAttack() == 15 : "Attack should be set to 15";
    }

    public static void testIsAlive() {
        Player player = new Player(100, 10, 5);
        assert player.isAlive() : "Player should be alive";

        player.setHealth(0);
        assert !player.isAlive() : "Player should not be alive";
    }
}