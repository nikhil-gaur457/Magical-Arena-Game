/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 12-11-2024
 *   Time: 23:23
 *   File: MagicalArena.java
 */

package main;

class MagicalArena {
    private final Player playerA;
    private final Player playerB;
    private final DiceRoll diceRoll;

    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.diceRoll = new DiceRoll();
    }

    public void play() {
        Player attacker = playerA;
        Player defender = playerB;

        if (playerB.getHealth() < playerA.getHealth()) {
            attacker = playerB;
            defender = playerA;
        }

        while (playerA.isAlive() && playerB.isAlive()) {
            int attackRoll = diceRoll.getDiceRoll();
            int defenseRoll = diceRoll.getDiceRoll();

            int damage = (attackRoll * attacker.getAttack()) - (defenseRoll * defender.getStrength());
            if (damage > 0) {
                defender.reduceHealth(damage);
            }

            // Reverse roles for the next phase of the fight
            Player tempPlayer = attacker;
            attacker = defender;
            defender = tempPlayer;
        }
        System.out.println(playerA.isAlive() ? "Player A wins!" : "Player B wins!");
    }
}