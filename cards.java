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
 * This class provides values to all cards in two ways:
 * 1) By the value of the face card
 * 2) By the value of the count, for counting cards
 */
public class cards {
	static int CardValue = 0;

	public static void main(String[] args){
		System.out.println(card(1));
	}
	public static int card(int number){
		int CardValue = 0;
		int HighAce = 11;
		String[] CardsValue = shuffler.shuffledDeck(number);
		if (CardsValue[0].contains("2")){
			CardValue = 2;
		}
		if (CardsValue[0].contains("3")){
			CardValue = 3;
		}
		if (CardsValue[0].contains("4")){
			CardValue = 4;
		}
		if (CardsValue[0].contains("5")){
			CardValue = 5;
		}
		if (CardsValue[0].contains("6")){
			CardValue = 6;
		}
		if (CardsValue[0].contains("7")){
			CardValue = 7;
		}
		if (CardsValue[0].contains("8")){
			CardValue = 8;
		}
		if (CardsValue[0].contains("9")){
			CardValue = 9;
		}
		if (CardsValue[0].contains("10") || CardsValue[0].contains("J") || CardsValue[0].contains("Q") || CardsValue[0].contains("K")){
			CardValue = 10;
		}
		return CardValue;
	}
	public static int cardCount(int number){
		int CountValue;
		String[] CardsValue = shuffler.shuffledDeck(number);
		if (CardsValue[0].contains("10") || CardsValue[0].contains("J") || CardsValue[0].contains("Q") || CardsValue[0].contains("K") || CardsValue[0].contains("A")){
			CountValue = -1;
		}
		if (CardsValue[0].contains("2") || CardsValue[0].contains("3") || CardsValue[0].contains("4") || CardsValue[0].contains("5") || CardsValue[0].contains("6")){
			CountValue = 1;
		}
		else {
			CountValue = 0;
		}
		return CountValue;
	}
}