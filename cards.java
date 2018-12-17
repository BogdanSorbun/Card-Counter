package card_counter;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.ArrayList; 
import java.util.Random;

public class cards {
	public static void main(String[] args){
		System.out.println(cards());
	}
	public static String cards(){
		String[] suits;
		String[] ranks;
		int random;

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
		random = (int )(Math.random() * 52);
		return card.get(random);
	}
}
