import java.util.ArrayList;

public class Hand {
  private ArrayList<Card> cardss = new ArrayList();

  public void setCardss(Card card) {
    this.cardss.add(card);
  }

  public ArrayList<Card> getCardss() {
    return this.cardss;
  }

  public int handValue() {
    int theCardsValue = 0;
    for (Card card1 : this.getCardss()) {
      theCardsValue = theCardsValue + card1.getValueOfCard();
      do {
        if (((card1.getValueOfCard() == 11) && (theCardsValue > 21) && (this.getCardss().size() >= 2))
            || ((card1.getValueOfCard() == 11) && (theCardsValue <= 21) && (this.getCardss().size() >= 3))) {
          int indexOfAce = this.getCardss().indexOf(card1);
          card1.setValueOfCard(1);
          theCardsValue -= 11;
          theCardsValue += 1;
        } else {
          break;
        }
      } while ((theCardsValue >= 21) && (card1.getValueOfCard() == 11)
          || ((theCardsValue <= 21) && (card1.getValueOfCard() == 11)));
    }
    return theCardsValue;
  }

  public String handOfCardsPlayer(int p, int y, int w) {
    String theCards = "";
    for (Card card1 : this.getCardss()) {
      theCards = theCards + card1.fullCard() + " , ";
      p += 50;
    }
    theCards = theCards.substring(0, (theCards.length() - 3));
    return theCards;
  }

}