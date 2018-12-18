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

public class cards {
	public static void main(String[] args){
		cards();
	}
	public static ArrayList<String> cards(){
		String[] suits;
		String[] ranks;

		suits = new String[]{"Club", "Heart", "Diamond", "Spade"};
		ranks = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		ArrayList<String> card = new ArrayList<String>();
		ArrayList<String> twoCards = new ArrayList<String>();
		for (int a=0; a<=ranks.length - 1; a++){
			card.add(MessageFormat.format("{0} of {1}", ranks[a], suits[0]));
		}
		for (int a=0; a<=ranks.length - 1; a++){
			card.add(MessageFormat.format("{0} of {1}", ranks[a], suits[1]));
		}
		for (int a=0; a<=ranks.length - 1; a++){
			card.add(MessageFormat.format("{0} of {1}", ranks[a], suits[2]));
		}
		for (int a=0; a<=ranks.length - 1; a++){
			card.add(MessageFormat.format("{0} of {1}", ranks[a], suits[3]));
		}
		return card;
//		Collections.shuffle(card);
//        Iterator itr = card.iterator();
//        Scanner reader = new Scanner(System.in);
//        String in = reader.nextLine();
//        System.out.println("Do you want a card? (y/n)");
//        while (in.equals("y")) {
//        	System.out.println("Do you want a card? (y/n)");
//        	in = reader.nextLine();
//        	if (itr.hasNext()) {
//        		String i = (String)itr.next(); 
//        		String j = (String)itr.next();
//        		System.out.println(i+ "  -  " + j);
//        	} else {
//        		System.out.print("All done");
//        	}
//        }
	}
}