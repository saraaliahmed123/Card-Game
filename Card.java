public class Card	  			        	      	  		
{	  			        	      	  		
  private String suit;	  			        	      	  		
  private String nameOfCard;	  			        	      	  		
  private int valueOfCard;	  			        	      	  		
  public Card(String s, int v)	  			        	      	  		
  {	  			        	      	  		
    String[] cardValues = {	  			        	      	  		
      " ", "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"	  			        	      	  		
    };	  			        	      	  		
    this.nameOfCard = cardValues[v];	  			        	      	  		
    if (v == 1)	  			        	      	  		
    {	  			        	      	  		
      this.valueOfCard = 11;	  			        	      	  		
    }	  			        	      	  		
    else	  			        	      	  		
    {	  			        	      	  		
    this.valueOfCard = v;	  			        	      	  		
    }	  			        	      	  		
    if (v > 10)	  			        	      	  		
    {	  			        	      	  		
      this.valueOfCard = 10;	  			        	      	  		
    }	  			        	      	  		
    this.suit = s;	  			        	      	  		
  }	  			        	      	  		
	  			        	      	  		
  String[] numbersAsStrings = {"","Ace","2","3","4","5","6","7","8","9","10","Ace","Jack","Queen","King"};	  			        	      	  		
	  			        	      	  		
  public void setNameOfCard(String noc)	  			        	      	  		
  {	  			        	      	  		
    this.nameOfCard = noc;	  			        	      	  		
  }	  			        	      	  		
	  			        	      	  		
  public String getNameOfCard()	  			        	      	  		
  {	  			        	      	  		
    return this.nameOfCard;	  			        	      	  		
  }	  			        	      	  		
	  			        	      	  		
  public void setValueOfCard(int vof)	  			        	      	  		
  {	  			        	      	  		
    this.valueOfCard = vof;	  			        	      	  		
  }	  			        	      	  		
	  			        	      	  		
  public int getValueOfCard()	  			        	      	  		
  {	  			        	      	  		
    return this.valueOfCard;	  			        	      	  		
  }	  			        	      	  		
	  			        	      	  		
  public void setSuit(String suit)	  			        	      	  		
  {	  			        	      	  		
     this.suit = suit;	  			        	      	  		
  }	  			        	      	  		
	  			        	      	  		
  public String getSuit()	  			        	      	  		
  {	  			        	      	  		
     return this.suit;	  			        	      	  		
  }	  			        	      	  		
	  			        	      	  		
  public String fullCard()	  			        	      	  		
  {	  			        	      	  		
    return this.nameOfCard + " of " + this.suit;	  			        	      	  		
  }	  			        	      	  		
	  			        	      	  		
  public String convertToString()	  			        	      	  		
  {	  			        	      	  		
    return numbersAsStrings[valueOfCard];	  			        	      	  		
  }	  			        	      	  		
}