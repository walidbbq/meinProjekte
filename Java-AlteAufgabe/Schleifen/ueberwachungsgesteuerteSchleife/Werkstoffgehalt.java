package ueberwachungsgesteuerteSchleife;

import java.util.Scanner;

public class Werkstoffgehalt {

	public static void main(String[] args) {
	
		int monat=0;
		double WSG;
		System.out.println("Wirkstoffgehalt eingeben: ");
		Scanner scan = new Scanner (System.in);
		WSG=scan.nextDouble();
		
		while (WSG>=50) {
			System.out.println("Monat: "+monat+ "   Wirkstoffgehalt: "+WSG);
			WSG=WSG-(WSG*0.04);
			monat++;
		}
		
		System.out.println("Monat: "+monat+ "   Wirkstoffgehalt: "+WSG + " Abgelaufen");
		
	}
	
	

}
