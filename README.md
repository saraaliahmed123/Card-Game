# Blackjack Game

This is a simple implementation of the classic Blackjack card game in Java, following object-oriented principles. The game is designed for two players, and the rules are standard for a typical Blackjack game.

## How to Play

1. **Setup**: Run the game using a Java IDE or command-line interface.

2. **Game Start**: The game starts with two players: Player 1 and Player 2.

3. **Objective**: The goal of the game is to reach a hand value as close to 21 as possible without exceeding it. Face cards (King, Queen, and Jack) have a value of 10, and the other cards have their numeric value.

4. **Game Rules**:

   - Each player starts with two cards drawn from a standard 52-card deck.

   - Players take turns, starting with Player 1.

   - On a player's turn, they can choose to either "twist" or "stick":

     - "Twist": Draw another card from the deck and add its value to their current hand.
     - "Stick": Skip their turn and keep their current hand.

   - If a player's hand value exceeds 21, they lose the game immediately.

   - The game continues until both players choose to "stick."

5. **Winning**:

   - The player with the hand value closest to 21 without exceeding it wins the game.

   - In case both players have the same hand value, it's a tie.

6. **Restart**:

   - To play another round, restart the game.

## Implementation

- The game is implemented in Java, following object-oriented programming (OO) principles to create classes for cards, players, and the game itself.

- The deck is represented as an ArrayList of Card objects.

- The game logic is implemented in a simple and intuitive way, allowing players to take turns and choose actions.

- The game displays information about each player's hand and provides prompts for twisting or sticking.

- The game checks for winning conditions and determines the winner at the end of the round.

## Usage

1. Clone the repository.

2. Compile the Java files using a Java compiler
