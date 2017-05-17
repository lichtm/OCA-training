package yahtzee;

public class Score {
	int enen 	= 0;
	int tweeen 	= 0;
	int drieen 	= 0;
	int vieren	= 0;
	int vijven	= 0;
	int zessen	= 0;


	void printScore(int[] dS){
		System.out.println("Volgende beurt: ");
		for(int i = 0; i < dS.length; i++){
			if (dS[i] == 1) { enen++;}
			if (dS[i] == 2) { tweeen++;}
			if (dS[i] == 3) { drieen++;}
			if (dS[i] == 4) { vieren++;}
			if (dS[i] == 5) { vijven++;}
			if (dS[i] == 6) { zessen++;}
		}
		int totaalScore = enen*1+tweeen*2+drieen*3+vieren*4+vijven*5+zessen*6;

		System.out.println("Uw score is :");
		System.out.println("Enen        : " + (enen *1) +" ptn.");
		System.out.println("Tweeën      : " + (tweeen *2) +" ptn.");
		System.out.println("Drieën      : " + (drieen *3) +" ptn.");
		System.out.println("Vieren      : " + (vieren *4) +" ptn.");
		System.out.println("Vijven      : " + (vijven *5) +" ptn.");
		System.out.println("Zessen      : " + (zessen *6) +" ptn.");
		System.out.println("----------------------");
		System.out.println("Score       : " +totaalScore +" ptn.");
		System.out.println("[Indien score >= 63, dan krijg je 35 ptn. extra!]");
		if (totaalScore >= 63){
			totaalScore +=35;
		}
		System.out.println("Totaalscore : " +(totaalScore) +" ptn. \n");

	}
}

