/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 12-11-2024
 *   Time: 23:43
 *   File: Main.java
 */

package main;

public class Main {
    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        MagicalArena magicalArena = new MagicalArena(playerA, playerB);
        magicalArena.play();
    }
}