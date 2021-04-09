package code;

public class Main {
	
	public static void main(String[] args) {
		
		CardDeck[] Deck = CardDeck.generateDeck();
		
   	 	Player player_1 = new Player("Bookmaker",Deck[0].generateHand());

   	 	Player player_2 = new Player("Punter",Deck[0].generateHand());

   	 	GUI game = new GUI(player_1,player_2);

                CardGame janelaPop = new CardGame();
                janelaPop.setResizable(false);
                janelaPop.setVisible(true);
    }
	
}
