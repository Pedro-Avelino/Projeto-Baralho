package code;

import javax.swing.ImageIcon;
import java.util.Random;

public class CardDeck {

    private Card card;

    private Suit suit;

    private ImageIcon image;

    public CardDeck(Card card, Suit suit,String name) {

        this.card = card;

        this.suit = suit;

        this.image = new ImageIcon(name);

    }

    public Card getCard() {

        return card;

    }

    public int getPoints(){
        return card.getPoints();
    }

    public Suit getSuit() {

        return suit;

    }

    public ImageIcon getImage(){

      return image;

    }

    public static CardDeck[] generateDeck (){

        int DeckSize = Suit.values().length * Card.values().length;

        String image_name;

        CardDeck deck [] = new CardDeck[DeckSize];

        int idx = 0;

        for (Suit suit : Suit.values()){

            for(Card card : Card.values()){

                image_name=card.getName().concat(suit.getName());

                deck [idx++] = new CardDeck(card,suit,image_name);

            }

        }

        return deck;

    }

    public static void shuffleDeck(CardDeck[] deck){

        Random rnd = new Random();
        CardDeck tmp;

        for (int i = deck.length - 1; i > 0; i--) {

            int randomNumber = rnd.nextInt(i + 1);
            tmp = deck[i];
            deck[i] = deck[randomNumber];
            deck[randomNumber] = tmp;
        }
    }

    public static CardDeck[] generateHand() {

        CardDeck[] myDeck = generateDeck();

        shuffleDeck(myDeck);

        System.out.println("Hand:\n");

        for (int i = 0; i > 5; i++){
            Random rnd = new Random();
            int randomNumber = rnd.nextInt(i + 1);
            CardDeck tmp = myDeck[randomNumber];
            myDeck[i] = tmp;
        }
        return myDeck;
    }

}
