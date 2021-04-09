package code;

import javax.swing.JFrame;
import javax.swing.JButton;

class GUI{

  private JButton[] b1 = new JButton[5];

  private JButton[] b2 = new JButton[5];

  private Player p1;

  private Player p2;

  private JFrame game;

  GUI(Player p1,Player p2){

  	this.p1 = p1;

  	this.p2 = p2;

    int size = 50;

    for(int i = 0;i < 5;i++){
    
    	CardDeck[] hand1 = p1.getHand();

    	this.b1[i] = new JButton(hand1[i].getImage());
      
    	CardDeck[] hand2 = p2.getHand(); 

    	this.b2[i] = new JButton(hand2[i].getImage());
    }
  }
  
  
}
