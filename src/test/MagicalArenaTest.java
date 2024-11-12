/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 13-11-2024
 *   Time: 00:03
 *   File: MagicalArenaTest.java
 */

package test;

import main.Player;
import main.MagicalArena;

class MagicalArenaTest {
    public static void testGameOutcome() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.play();

        assert (playerA.isAlive() || playerB.isAlive()) : "One player should be alive";
        assert (!playerA.isAlive() || !playerB.isAlive()) : "One player should be dead";
    }
}