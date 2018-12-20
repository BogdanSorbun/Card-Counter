package card_counter;

import java.util.*;
/*
 * This deals the cards out.  
 * 
 * NOTE: if you want to keep going with this deck after it runs out.
 * write a while loop where as long as you want to keep the cards coming, they will come.
 * 
 * Example:
 * while (userinput = "y")
 * 	"Keep printing the cards"
 * 
 */
public class deal {
	public static void main(String[] args){
		deal(2);
	}
	public static void deal(int number){
		int CardsRemaining;
		
		Stack StackedDeck = new Stack();
		String[] Deck = shuffler.shuffledDeck(number);
		CardsRemaining = StackedDeck.size();
		
		for(String str : Deck){
			StackedDeck.push(str);
		}
		while (!StackedDeck.isEmpty()){
			System.out.println(StackedDeck.pop());
		}
	}
}
