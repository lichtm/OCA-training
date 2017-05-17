package yahtzee;

import java.util.Scanner;

public class Yahtzee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dS = new int[5];
		int beurten =0;
		
		System.out.println("Welkom bij Yahtzee gemaakt door Menno Licht.");
		System.out.println("Hier is de eerste worp: \n");
		
		//class SpeelBeurt aanroepen
		SpeelBeurt sB = new SpeelBeurt();
		Score pS = new Score();
		while (beurten <6) {
			sB.beurtSpeler(dS);
			//class Score aanroepen
			
			pS.printScore(dS);
			beurten++;
		}
		System.out.println("Bedankt voor het spelen!");
	}
}




