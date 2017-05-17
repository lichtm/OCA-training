package yahtzee;

import java.util.Scanner;

public class SpeelBeurt {
	Scanner sc = new Scanner(System.in);

	void beurtSpeler(int[] dS ){
		for (int i = 0; i < dS.length; i++){
			dS[i] = (int)(Math.random()*6)+1;
			System.out.println("[" +(i+1) +"] " +dS[i]);
		}

		System.out.println("Welke waarde wilt u vasthouden? < 1, 2, 3, 4, 5 of 6 > (Bij een onjuiste keuze worden de dobbelstenen opnieuw gegooid.)");
		int invoer = sc.nextInt();

		for (int i = 0; i < dS.length; i++){
			if (dS[i] == invoer ) {
				System.out.println("[" +(i+1) +"] " +dS[i] +" * vast");
			}
			//		}
			//		System.out.println("Welke waarde wilt u nog meer vasthouden? < 1, 2, 3, 4, 5 of 6 >");
			//		System.out.println("(Bij een onjuiste keuze worden de dobbelstenen opnieuw gegooid.)");
			//		int invoer4 = sc.nextInt();
			//		
			//		for (int i = 0; i < dS.length; i++){

			else {
				dS[i] = (int)(Math.random()*6)+1;
				System.out.println("[" +(i+1) +"] " +dS[i]);
			}
		}
		System.out.println("Welke waarde wilt u vasthouden? < 1, 2, 3, 4, 5 of 6 > (Bij een onjuiste keuze worden de dobbelstenen opnieuw gegooid.)");
		int invoer2 = sc.nextInt();

		for (int i=0;i<dS.length;i++){
			if (dS[i] == invoer2 ) {
				System.out.println("[" +(i+1) +"] " +dS[i] +" * vast");
			}
			else {
				dS[i] = (int)(Math.random()*6)+1;
				System.out.println("[" +(i+1) +"] " +dS[i]);
			}
		}
		System.out.println("Welke waarde wilt u vasthouden? < 1, 2, 3, 4, 5 of 6 > (Bij een onjuiste keuze wordt er géén score bijgehouden.");
		int invoer3 = sc.nextInt();

		for (int i=0;i<dS.length;i++){
			if (dS[i] == invoer3 ) {
				//				for (int j =1; j<=6; j++){
				//				}

				System.out.println("[" +(i+1) +"] " +dS[i] +" * eindkeuze \n");

			}
			else {
				dS[i] = 0;
			}
		}
	}

}
