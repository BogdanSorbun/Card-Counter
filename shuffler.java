package cards;

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
	public static String[] Deck(int number){
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
		String[] final_list = new String[cards.size()];
		final_list = cards.toArray(final_list);
		
//		Shuffles number of decks you specify
		if (number == 1){
			Collections.shuffle(cards);
			final_list = new String[cards.size()];
			final_list = cards.toArray(final_list);
		} else if (number == 2){
			ArrayList<String> twoDecks = new ArrayList<String>(Arrays.asList(final_list));
			twoDecks.addAll(Arrays.asList(final_list));
			Collections.shuffle(twoDecks);
			final_list = new String[twoDecks.size()];
			final_list = twoDecks.toArray(final_list);
		} 
		else if (number == 3){
			ArrayList<String> threeDecks = new ArrayList<String>(Arrays.asList(final_list));
			threeDecks.addAll(Arrays.asList(final_list));
			threeDecks.addAll(Arrays.asList(final_list));
			Collections.shuffle(threeDecks);
			final_list = new String[threeDecks.size()];
			final_list = threeDecks.toArray(final_list);
		} else if (number == 4){
			ArrayList<String> fourDecks = new ArrayList<String>(Arrays.asList(final_list));
			fourDecks.addAll(Arrays.asList(final_list));
			fourDecks.addAll(Arrays.asList(final_list));
			fourDecks.addAll(Arrays.asList(final_list));
			Collections.shuffle(fourDecks);
			final_list = new String[fourDecks.size()];
		} else if (number == 5){
			ArrayList<String> fiveDecks = new ArrayList<String>(Arrays.asList(final_list));
			fiveDecks.addAll(Arrays.asList(final_list));
			fiveDecks.addAll(Arrays.asList(final_list));
			fiveDecks.addAll(Arrays.asList(final_list));
			fiveDecks.addAll(Arrays.asList(final_list));
			Collections.shuffle(fiveDecks);
			final_list = new String[fiveDecks.size()];
			final_list = fiveDecks.toArray(final_list);
		} else if (number == 6){
			ArrayList<String> sixDecks = new ArrayList<String>(Arrays.asList(final_list));
			sixDecks.addAll(Arrays.asList(final_list));
			sixDecks.addAll(Arrays.asList(final_list));
			sixDecks.addAll(Arrays.asList(final_list));
			sixDecks.addAll(Arrays.asList(final_list));
			sixDecks.addAll(Arrays.asList(final_list));
			Collections.shuffle(sixDecks);
			final_list = new String[sixDecks.size()];
			final_list = sixDecks.toArray(final_list);
		}
		return final_list;
	}
}