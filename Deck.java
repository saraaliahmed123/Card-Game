import java.util.ArrayList;
import java.util.*;

public class Deck {
  private ArrayList<Card> cards;

  public void setCards(ArrayList<Card> c) {
    this.cards = c;
  }

  public ArrayList<Card> getCards() {
    return this.cards;
  }

  public Deck() {
    int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
    String[] suits = { "diamonds", "spades", "hearts", "clubs" };
    ArrayList<Card> myCardList = new ArrayList();
    for (int value : num) {
      for (int i = 0; i < suits.length; i++) {
        Card card = new Card(suits[i], value);
        myCardList.add(card);
      }
    }
    this.setCards(myCardList);

    Collections.shuffle(myCardList);
  }

  public Card drawACard() {
    return this.cards.remove(0);
  }
}