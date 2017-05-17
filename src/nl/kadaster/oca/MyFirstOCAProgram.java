package nl.kadaster.oca;

import java.util.*;

public class MyFirstOCAProgram {

	public static void main(String[] args) {
		
		Bos zwarteWoud = new Bos();
		Bos veluwe = new Bos();
		zwarteWoud.setAantalBomen (150);
		veluwe.setAantalBomen (3000);
		System.out.println(zwarteWoud.getAantalBomen());
		System.out.println(veluwe.getAantalBomen());
	
	}

}


class Bos{
	
	private int aantalBomen;
	
	public void setAantalBomen(int aantalBomen){
		this.aantalBomen = aantalBomen;
	} 
	public int getAantalBomen(){
		return aantalBomen;
	}
}


