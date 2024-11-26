# Magical Arena Game

This project is a simple turn-based battle simulation game, where two players take turns attacking each other in a magical arena until one of them wins. The game includes three main components:
- `Player`: Represents a player with attributes such as health, strength, and attack.
- `DiceRoll`: Simulates rolling a dice to determine attack and defense values.
- `MagicalArena`: Handles the game logic, allowing two players to battle until one wins.

## Project Structure

```
src/
├── main/
│   ├── Player.java
│   ├── DiceRoll.java
│   ├── MagicalArena.java
│   └── Main.java
└── test/
    ├── PlayerTest.java
    ├── DiceRollTest.java
    ├── MagicalArenaTest.java
    └── TestRunner.java
```

## Prerequisites

- **Java Development Kit (JDK) 8 or higher**: Make sure Java is installed on your system.
    - [Download JDK](https://www.oracle.com/java/technologies/downloads)
- **IntelliJ IDEA (optional)**: Recommended IDE for running and editing this project.

# How to Run the Game

1. **Extract the code from zip file**

2. **Compile the Project files using the following commands**
   ```bash
   javac -d out src/main/*.java
3. **Run the main game file**
   ```bash
   java -cp out main.Main
You should see the game output in the console, where one player is declared the winner after the battle simulation.

## How to Run Tests
This project includes a basic testing setup without third-party libraries.

## Running Tests Without Assertions
If you prefer not to use assertions, You can use this

1. **Compile the Test Files** <br/>
     Compile the test files along with the main files:
   ```bash
   javac -d out -sourcepath src src/main/*.java src/test/*.java

2. **Run Tests**<br/>
     Run the TestRunner class to execute all tests:
   ```bash
   java -cp out test.TestRunner

You should see console messages indicating that each test passed.

## Enabling Assertions (Optional)
To run the tests with assertions, you need to enable assertions by adding the -ea flag.

####IntelliJ IDEA:
1. Go to Run > Edit Configurations. <br/>
2. Select your configuration for `TestRunner`. <br/>
3. In the VM options field, add `-ea`.

####Command Line:
Use the following command to enable assertions:
1. **Compile the Test Files** <br/>
   Compile the test files along with the main files:
   ```bash
   javac -d out -sourcepath src src/main/*.java src/test/*.java

2. **Run Tests**<br/>
   Run the TestRunner class to execute all tests:
   ```bash
   java -ea -cp out test.TestRunner
   
#Code Overview
- **Player:** Represents a game player with attributes (health, strength, and attack) and methods for modifying health and checking if the player is alive.
- **DiceRoll:** Provides a random dice roll from 1 to 6.
- **MagicalArena:** Simulates the battle between two players until one player wins.
- **TestRunner:** Runs unit tests for `Player`, `DiceRoll`, and `MagicalArena`.

###Example Output
Running the game might produce output like this:

```
Player B wins!
```
Running the tests might produce output like this:
```
PlayerTest.testHealthReduction passed
PlayerTest.testSetAndGetAttributes passed
PlayerTest.testIsAlive passed
DiceRollTest.testDiceRollRange passed
MagicalArenaTest.testGameOutcome passed
All tests passed.
```