package code;

import javax.swing.JLabel;

public class Scoreboard{
	
	private int p1;

	private int p2;

    private int tie;

	private JLabel play1;

	private JLabel play2;

	private JLabel draw;

    Scoreboard(){

    	this.p1=0;

     	 this.p2=0;

      	this.tie=0;

		this.play1=new JLabel("0");

		this.play2=new JLabel("0");

		this.draw=new JLabel("0"); 

   	 }

    public int getP1(){

    	return this.p1;

    }

    public int getP2(){
    	
   	 	return this.p2;
    
    }

   	public int getTie(){

    	return this.tie;
    	
  	}

	public void setP1(int win){

    	this.p1=win;
    	
	}

    public void setP2(int win){

    	this.p2=win;

   	}

  	public void setTie(int aTie){

    	this.tie=aTie;
   	}

    public void gameCount(String who_won){

    	if (who_won=="p1"){

      		this.setP1(this.getP1()+1);

			this.changeScoreboard(this.play1,this.getP1()+"");

     	}else if(who_won=="p2"){

      		this.setP2(this.getP2()+1);

			this.changeScoreboard(this.play2,this.getP2()+"");

   		}else if (who_won=="nobody"){

      		this.setTie(this.getTie()+1);

			this.changeScoreboard(this.draw,this.getTie()+"");

     	}else{

      		System.out.print("Error!");
      		
     	}
    	
    }

	public void changeScoreboard(JLabel label_name,String text){

		label_name.setText(text);

	}

}
