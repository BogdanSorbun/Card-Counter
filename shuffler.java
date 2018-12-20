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
/*
 * This class produces a deck for you.
 * It will take the deck/decks.
 * It will shuffle them around.
 */
public class shuffler {
	public static String[] shuffledDeck(int number){
		String[] suits;
		String[] ranks;

//		Made two separate lists, and then appended them to an empty list with every combination possible
		suits = new String[]{"Club", "Heart", "Diamond", "Spade"};
		ranks = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		ArrayList<String> cards = new ArrayList<String>();
		
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
//		make the arraylist into array
		String[] FinalList = new String[cards.size()];
		FinalList = cards.toArray(FinalList);
		
//		Shuffles number of decks you specify
		if (number == 1){
			Collections.shuffle(cards);
			FinalList = new String[cards.size()];
			FinalList = cards.toArray(FinalList);
		} else if (number == 2){
			ArrayList<String> twoDecks = new ArrayList<String>(Arrays.asList(FinalList));
			twoDecks.addAll(Arrays.asList(FinalList));
			Collections.shuffle(twoDecks);
			FinalList = new String[twoDecks.size()];
			FinalList = twoDecks.toArray(FinalList);
		} 
		else if (number == 3){
			ArrayList<String> threeDecks = new ArrayList<String>(Arrays.asList(FinalList));
			threeDecks.addAll(Arrays.asList(FinalList));
			threeDecks.addAll(Arrays.asList(FinalList));
			Collections.shuffle(threeDecks);
			FinalList = new String[threeDecks.size()];
			FinalList = threeDecks.toArray(FinalList);
		} else if (number == 4){
			ArrayList<String> fourDecks = new ArrayList<String>(Arrays.asList(FinalList));
			fourDecks.addAll(Arrays.asList(FinalList));
			fourDecks.addAll(Arrays.asList(FinalList));
			fourDecks.addAll(Arrays.asList(FinalList));
			Collections.shuffle(fourDecks);
			FinalList = new String[fourDecks.size()];
		} else if (number == 5){
			ArrayList<String> fiveDecks = new ArrayList<String>(Arrays.asList(FinalList));
			fiveDecks.addAll(Arrays.asList(FinalList));
			fiveDecks.addAll(Arrays.asList(FinalList));
			fiveDecks.addAll(Arrays.asList(FinalList));
			fiveDecks.addAll(Arrays.asList(FinalList));
			Collections.shuffle(fiveDecks);
			FinalList = new String[fiveDecks.size()];
			FinalList = fiveDecks.toArray(FinalList);
		} else if (number == 6){
			ArrayList<String> sixDecks = new ArrayList<String>(Arrays.asList(FinalList));
			sixDecks.addAll(Arrays.asList(FinalList));
			sixDecks.addAll(Arrays.asList(FinalList));
			sixDecks.addAll(Arrays.asList(FinalList));
			sixDecks.addAll(Arrays.asList(FinalList));
			sixDecks.addAll(Arrays.asList(FinalList));
			Collections.shuffle(sixDecks);
			FinalList = new String[sixDecks.size()];
			FinalList = sixDecks.toArray(FinalList);
		}
		return FinalList;
	}
}
