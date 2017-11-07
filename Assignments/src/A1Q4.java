import java.util.Random;
import java.util.Scanner;

public class A1Q4 {
	
	private static String[] deck, playerDeck, computerDeck;
	private static int sizeDeck, sizePlayerDeck, sizeComputerDeck;
	private static Scanner sc;
	private static Random generator;
	public A1Q4(){
		sc=new Scanner(System.in);
		generator=new Random();
		String[] suits={ "\u2660", "\u2661", "\u2662", "\u2663" };
		String[] ranks={ "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		sizeDeck=suits.length*ranks.length-1;
		deck=new String[sizeDeck];
		int index=0;
		for (int i=0;i<ranks.length;i++){
			for (int j=0;j<suits.length;j++){
				if (!(ranks[i]=="Q" && suits[j]=="\u2663")){
					deck[index++]=ranks[i]+" of "+suits[j];
				}
			}
		}
	}
	
	private static void dealCards(){
		sizePlayerDeck=0;
		sizeComputerDeck=0;
		playerDeck = new String[sizeDeck];
		computerDeck = new String[sizeDeck];
		int i=0,j=0;
		while(i<sizeDeck-1){
			playerDeck[sizePlayerDeck++]=deck[i++];
			computerDeck[sizeComputerDeck++]=deck[i++];
		}
		if(i==sizeDeck-1){
			playerDeck[sizePlayerDeck++]=deck[i];
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
