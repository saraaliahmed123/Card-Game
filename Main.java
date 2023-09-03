import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner st = new Scanner(System.in);
    Deck deck = new Deck();

    Player player1 = new Player();
    Player player2 = new Player();

    Hand hand1 = new Hand();
    Hand hand2 = new Hand();

    player1.setHand(hand1);
    player2.setHand(hand2);

    String pick1 = "";
    String pick2 = "";
    int current = 0;

    Player[] player = { player1, player2 };
    String[] answer = { pick1, pick2 };
    System.out.println("Welcome to the game!\n");

    player1.getHand().setCardss(deck.drawACard());
    player2.getHand().setCardss(deck.drawACard());

    System.out.println("Player 1's cards: " + player1.getHand().handOfCardsPlayer(200, 100, 200));
    System.out.println("Player 1 score: " + player1.getHand().handValue() + "\n");
    System.out.println("Player 2's cards: " + player2.getHand().handOfCardsPlayer(200, 580, 200));
    System.out.println("Player 2 score: " + player2.getHand().handValue() + "\n");

    do {
      if ((!(answer[current].equalsIgnoreCase("stick"))) && (!(player[current].getHand().handValue() > 21))) {
        System.out.println("Player " + (current + 1));
        System.out.println("Stick or Twist? \nPlease enter stick or twist...");
        answer[current] = st.nextLine();
        if (answer[current].equalsIgnoreCase("stick")) {
          if (current == 0) {
            System.out.println(
                "Player " + (current + 1) + "'s cards: " + player[current].getHand().handOfCardsPlayer(200, 100, 200));
          } else if (current == 1) {
            System.out.println(
                "Player " + (current + 1) + "'s cards: " + player[current].getHand().handOfCardsPlayer(200, 580, 200));
          }
          System.out.println("Score: " + player[current].getHand().handValue() + "\n");
        } else if (answer[current].equalsIgnoreCase("twist")) {
          player[current].getHand().setCardss(deck.drawACard());
          if (current == 1) {
            System.out.println(
                "Player " + (current + 1) + "'s cards: " + player[current].getHand().handOfCardsPlayer(200, 580, 200));

          } else if (current == 0) {
            System.out.println(
                "Player " + (current + 1) + "'s cards: " + player[current].getHand().handOfCardsPlayer(200, 100, 200));

          }
          System.out.println("Score: " + player[current].getHand().handValue() + "\n");
        }
      }
      if ((player[current].getHand().handValue() >= 21)
          || ((answer[0].equals("stick")) && (answer[1].equals("stick")))) {
        System.out.println("Game Over... \n");

        System.out.println("Player 1's cards: " + player1.getHand().handOfCardsPlayer(200, 100, 200));
        System.out.println("Player 1 final score: " + player1.getHand().handValue() + "\n");
        System.out.println("Player 2's cards: " + player2.getHand().handOfCardsPlayer(200, 580, 200));
        System.out.println("Player 2 final score: " + player2.getHand().handValue() + "\n");
        if (((player2.getHand().handValue()) > (player1.getHand().handValue()) && (player2.getHand().handValue() < 21))
            || (player1.getHand().handValue() > 21) || (player2.getHand().handValue() == 21)) {
          System.out.println("Well Done! Player 2 won the game :)");
          break;
        } else if (((player1.getHand().handValue()) > (player2.getHand().handValue())
            && (player1.getHand().handValue() < 21)) || (player2.getHand().handValue() > 21)
            || (player1.getHand().handValue() == 21)) {
          System.out.println("Well Done! Player 1 won the game :)");
          break;
        } else if ((player1.getHand().handValue() == player2.getHand().handValue())) {
          System.out.println("Well Done! It was a tie :)");
          break;
        }
      }
      if (current == 0) {
        current = 1;
      } else if (current == 1) {
        current = 0;
      }
    } while (true);
  }
}