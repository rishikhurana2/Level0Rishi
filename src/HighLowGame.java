 import java.util.Random;

import javax.swing.JOptionPane;
 
// Copyright Wintriss Technical Schools 2013
public class HighLowGame {
 
	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(999_999)+1;
		// 2. Print out the random variable above
		boolean Win = false;
		boolean Loss = false;
		// 11. do the following 10 times
		for(int i = 0; i < 20; i++){
			// 1. ask the user for a guess using a pop-up window, and save their response
				String Guess;
                Guess = JOptionPane.showInputDialog("Make a guess from 1-1000000");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
              int Guess1 = Integer.parseInt(Guess);
			// 5. if the guess is correct
              if(Guess1 == random){
            	  JOptionPane.showMessageDialog(null, "You Win!");
            	  Win = true;
              }
              
				// 6. win
			// 7. if the guess is high
	          if(Guess1 > random){
	        	  JOptionPane.showMessageDialog(null,"Too High");
	        	  Loss = true;
	          }
				// 8. tell them it's too high
			// 9. if the guess is low
	          if(Guess1 < random){
	        	JOptionPane.showMessageDialog(null,"Too Low");  
	            Loss = true;
	          }
	          if(Win){
					System.exit(0);
				}
	          }
		     if(Loss){
		     JOptionPane.showMessageDialog(null, "Sorry, you lost, but the number was " + random);
		     }
	       }
        }
		// 10. tell them it's too low
	      
		// 12. tell them they lose
	
 

 
 
