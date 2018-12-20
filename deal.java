package cards;

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
	public static void main(String[] args) {
		deal(1);
	}
	public static void deal(int number){
		int CardsRemaining;
		int CardValue = 0;
		int TotalValue = 0;
		int HighAce = 11;
		int LowAce = 1;
		String[] Hand = new String[21];
		
		Stack StackedDeck = new Stack();
		String[] Deck = shuffler.shuffledDeck(number);
		CardsRemaining = StackedDeck.size();
		
		
		for(String str : Deck){
			StackedDeck.push(str);
		}
		
		String PoppedCard = StackedDeck.pop().toString();
		int UsedCard = cards.cardValue(PoppedCard);
//		gets user input whether they want to keep going or not
		Scanner reader = new Scanner(System.in);
		String read = reader.next();
		while (read == "Y") {
			while (!StackedDeck.isEmpty()){
				for (int Total=0; Total <= 21; Total = Total + CardValue) {
	//					find the card value of the card
					CardValue = UsedCard;
	//					print the card used
					System.out.println(PoppedCard);
	//					append to a list 
					Hand[0] = PoppedCard;
	//					find the card value
					CardValue = UsedCard;
	//					print the card used
					System.out.println(PoppedCard);
	//					append to list
					Hand[1] = PoppedCard;
	//					This following below shows if A in the list and automatically assign it the high value.
					if (Arrays.stream(Hand).anyMatch("A"::equals)) {
						if (Total <= 10) {
							Total = Total + HighAce;
						}
	//						this should go through the rest of the cards until we hit 21
					for(Total = Total; Total <= 21; Total = Total + CardValue) {
	//						append to the list starting with the second poition of the list since we got the cards from the first part
						for (int i = 2; i <= 21; i++) {
							CardValue = UsedCard;
							System.out.println(PoppedCard);
							Hand[i] = PoppedCard;
	//							I'm skeptical on the if statement below but we will see
							if (Hand[i].contains("A")) {
								Total = Total + HighAce;
								if (Total > 21) {
									Total = Total - HighAce;
									Total = Total + LowAce;
									if (Total > 21) {
	//										then its a bust
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
}