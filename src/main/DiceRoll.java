/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 12-11-2024
 *   Time: 23:32
 *   File: DiceRoll.java
 */

package main;

import java.util.Random;

public class DiceRoll {
    private Random random;

    public DiceRoll() {
        this.random = new Random();
    }

    public int getDiceRoll() {
        return random.nextInt(6) + 1;
    }
}