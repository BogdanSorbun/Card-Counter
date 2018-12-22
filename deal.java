package cards;

import java.util.*;
import java.util.Scanner; 

public class deal {
	public static void main(String[] args) {
		deal(1);
	}
	public static void deal(int number){
		int CardValue = 0;
		int HighAce = 11;
		int LowAce = 1;
		String[] Hand = new String[52 * number];
		
		Stack StackedDeck = new Stack();
		String[] Deck = shuffler.shuffledDeck(number);
		
		
		for(String str : Deck){
			StackedDeck.push(str);
		}
		
//		gets user input whether they want to keep going or not
		Scanner inp = new Scanner(System.in);
		System.out.println("Y or N: ");
		int n = inp.nextInt();
		while (n == 1) {
			while (!StackedDeck.isEmpty()){
				int Total = 0;
				while (Total <= 21) {

					Hand[0] = StackedDeck.pop().toString();
					CardValue = cards.cardValue(Hand[0]);
					Total = Total + CardValue;

					Hand[1] = StackedDeck.pop().toString();
					CardValue = cards.cardValue(Hand[1]);
					Total = Total + CardValue;
					
				if (Hand[0].contains("A") && !Hand[1].contains("A")) {
						if (Total <= 10) {
							Total = Total + HighAce;
							System.out.println(Hand[1] + " and " + Hand[0] + "   Total:" + Total);
							System.out.println("Blackjack!");
							break;
						}
					}
					if (Hand[1].contains("A") && !Hand[0].contains("A")) {
						if (Total <= 10) {
							Total = Total + HighAce;
							System.out.println(Hand[1] + " and " + Hand[0] + "   Total:" + Total);
							System.out.println("Blackjack!");
							break;
						}
					}
					if (Hand[0].contains("A") && Hand[1].contains("A")) {
						Total = HighAce + LowAce;
					}
					System.out.println(Hand[1] + " and " + Hand[0] + "   Total:" + Total);
					Scanner hit = new Scanner(System.in);
					System.out.println("Hit you?");
					int hits = hit.nextInt();

					while (hits == 1) {
						
						Hand[0] = StackedDeck.pop().toString();
						CardValue = cards.cardValue(Hand[0]);
						
						if (Hand[0].contains("A")) {
							Total = Total + HighAce;
							if (Total > 21) {
								Total = Total - HighAce;
								Total = Total - LowAce;
								if (Total > 21) {
									System.out.println("Total:" + Total + "   Card: " + Hand[0]);
									System.out.println("Bust");
									Total = 0;
									break;
								}
								if (Total == 21) {
									System.out.println("BlackJack!");
									Total = 0;
									break;
								}
							} else {
								Total = Total;
							}
						}
						Total = Total + CardValue;
						System.out.println("line 86   Cardvalue:" + CardValue + "   " + "Total: " + Total  + "    Card:" + Hand[0]);
						if (Total == 21) {
							System.out.println("BlackJack!");
							Total = 0;
							break;
						}
						if (Total > 21) {
							System.out.println("Total:" + Total + "    Card: " + Hand[0]);
							System.out.println("Bust");
							Total = 0;
							break;
						}
					}
				break;
				}
			}
		}
	}
}