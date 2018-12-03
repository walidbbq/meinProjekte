package ifAnweisung;

import java.util.Scanner;

public class UeberprüfungDerBestellung {

	public static void main(String[] args) {
		
		final int SchraubePrreis=5, MutterPreis=3, UnterlegscheibePreis= 1;
		int schraube , mutter , unterlegscheibe, gesamtPreis;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Anzahl der Schrauben: ");
		schraube=scan.nextInt();
		
		System.out.println(" Anzahl der Muttern: ");
		mutter=scan.nextInt();
		
		System.out.println("Anzahl der Unterlegescheiben: ");
		unterlegscheibe=scan.nextInt();
		
		gesamtPreis= schraube*SchraubePrreis + mutter*MutterPreis +  unterlegscheibe*UnterlegscheibePreis;
				
		if (schraube > mutter)
			System.out.println("Kontrollieren Sie Ihre Bestellung !");
		else 
			System.out.println("Die Bestellung ist Okay!");
		System.out.println("Gesamtbetrag= " + gesamtPreis );

	}

}
