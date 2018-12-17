package card_counter;
import java.util.Arrays;
import java.util.ArrayList; 

public class cards {
	public static void main(String[] args){
		String[] ranks;
		ranks = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		System.out.println(cards());
	}
	public static String cards(){
		String[] suits;
		String[] ranks;

		suits = new String[]{"Club", "Heart", "Diamond", "Spade"};
		ranks = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		ArrayList<String> card = new ArrayList<String>();
		for (int i=0; i<=ranks.length - 1; i++){
			card.add(ranks[i]);
		}
		return card.get(0);
	}
}
