package Binaer;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Rechner extends BinareException {
	
static void wandleBinInDez() throws BinareException {
	
	Scanner eingabe = new Scanner(System.in);
	System.out.println("Bitte gib eine Dualzahl ein!");
	
	int binZahl = eingabe.nextInt();
	int anzahlVerschiebung=0;
	int dezZahl=0;
	int restWert=0;
	boolean check = false;
	int z = 0;
	
	while (binZahl !=0){
		restWert=binZahl % 10;
		dezZahl = dezZahl+(int)(restWert*(Math.pow(2, anzahlVerschiebung)));	
		binZahl=binZahl / 10;
		anzahlVerschiebung=anzahlVerschiebung+1;
	}
	System.out.println(dezZahl);
	
	String s = Integer.toString(binZahl);
	int stellen = s.length();
	char [] c = s.toCharArray();
	for(int i = 0; i<stellen; i++) {
		if((c[i]==0) || (c[i]==1)) z++;
	}
	if(z==stellen) check = true;
	
	if((check == false) || (stellen<8)) throw new BinareException("Falsche eingabe oder zu wenig Stellen.");
}	

	public static void main(String[] args) {
		try{
			wandleBinInDez();
		}catch(BinareException b){
			b.printStackTrace();
		}
	}
}
