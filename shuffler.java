package card_counter;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.ArrayList; 
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;

public class shuffler {
	static ArrayList<String> cards;
	
	public static void main(String[] args){
		Scanner reader;
		String inp;
		int number;
		
		reader = new Scanner(System.in);
		inp = reader.nextLine();
		System.out.println("How Many decks will you use? (1-6)");
		number = Integer.parseInt(inp);
		shuffled_decks(number);
	}
	public static ArrayList<String> shuffled_decks(int number){
//		multiplies the deck of cards
		ArrayList<String> twoDecks = new ArrayList<String>();
		ArrayList<String> threeDecks = new ArrayList<String>();
		ArrayList<String> fourDecks = new ArrayList<String>();
		ArrayList<String> fiveDecks = new ArrayList<String>();
		ArrayList<String> sixDecks = new ArrayList<String>();
		deck();
		
		if (number == 1){
			Collections.shuffle(cards);
		} else if (number == 2){
			twoDecks = cards.addAll(cards);
			Collections.shuffle(twoDecks);
			cards = twoDecks;
		} else if (number == 3){
			twoDecks = cards.addAll(cards);
			threeDecks = twoDecks.addAll(cards);
			Collections.shuffle(threeDecks);
			cards = threeDecks;
		} else if (number == 4){
			twoDecks = cards.addAll(cards);
			threeDecks = twoDecks.addAll(cards);
			fourDecks = threeDecks.addAll(cards);
			Collections.shuffle(fourDecks);
			cards = fourDecks;
		} else if (number == 5){
			twoDecks = cards.addAll(cards);
			threeDecks = twoDecks.addAll(cards);
			fourDecks = threeDecks.addAll(cards);
			fiveDecks = fourDecks.addAll(cards);
			Collections.shuffle(fiveDecks);
			cards = fiveDecks;
		} else if (number == 6){
			twoDecks = cards.addAll(cards);
			threeDecks = twoDecks.addAll(cards);
			fourDecks = threeDecks.addAll(cards);
			fiveDecks = fourDecks.addAll(cards);
			sixDecks = fiveDecks.addAll(cards);
			Collections.shuffle(sixDecks);
			cards = sixDecks;
		}
		return cards
	}
	public static ArrayList<String> deck(){
		String[] suits;
		String[] ranks;

//		Made two separate lists, and then appended them to an empty list with every combination possible
		suits = new String[]{"Club", "Heart", "Diamond", "Spade"};
		ranks = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		cards = new ArrayList<String>();
		
		for (int a=0; a<=ranks.length - 1; a++){
			cards.add(MessageFormat.format("{0} of {1}", ranks[a], suits[0]));
		}
		for (int a=0; a<=ranks.length - 1; a++){
			cards.add(MessageFormat.format("{0} of {1}", ranks[a], suits[1]));
		}
		for (int a=0; a<=ranks.length - 1; a++){
			cards.add(MessageFormat.format("{0} of {1}", ranks[a], suits[2]));
		}
		for (int a=0; a<=ranks.length - 1; a++){
			cards.add(MessageFormat.format("{0} of {1}", ranks[a], suits[3]));
		}
		return cards;
	}
}
