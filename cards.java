package card_counter;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.ArrayList; 
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class cards {
	public static void main(String[] args){
		cards();
		System.out.println(deckShuffle(card));
	}
	public static ArrayList<String> cards(){
		String[] suits;
		String[] ranks;

		suits = new String[]{"Club", "Heart", "Diamond", "Spade"};
		ranks = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		ArrayList<String> card = new ArrayList<String>();
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
	}
	public void deckShuffle(){
		this.cards();
		Collections.shuffle(card);
        for (int i=0; i<3; i++) {
            System.out.println(card.get(i));
        }
	}
}
