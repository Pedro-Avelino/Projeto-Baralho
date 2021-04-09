package code;

public class Player {

   private static final int cards_in_game = 5;

   private final String name;

   private final CardDeck[] hand;

   private int points;

   Player(String name, CardDeck[] hand){

     this.name = name;
     
     this.hand = hand;

     this.points = 0;

   }

   public int getPoints(){

	   return this.points;

   }

   public void setPoints(int points){

	   this.points = points;

   }

   public CardDeck[] getHand(){

	   return this.hand;

   }

   public String getName(){

	   return this.name;

   }

   public void addPunctuation(CardDeck card1, CardDeck card2){
    
	   this.setPoints(this.getPoints() + card1.getPoints() + card2.getPoints());
     
   }

}

