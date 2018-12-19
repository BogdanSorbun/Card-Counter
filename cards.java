
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

public class cards {
	public static void main(String[] args){
		Cards(1);
	}
	public static String Cards(int number){
		String[] cards = shuffler.Deck(number);
		System.out.println(cards[0]);
		return cards[0];
	}
}