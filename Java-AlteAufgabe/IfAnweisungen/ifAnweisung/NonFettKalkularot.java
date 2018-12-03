package ifAnweisung;

import java.util.Scanner;

public class NonFettKalkularot {

	public static void main(String[] args) {

		double PreisPfundA, PreisPfundB, ProzentA, ProzentB, PreisA, PreisB;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Preis pro Pfund Packung A: ");
		PreisPfundA=scan.nextDouble();
		
		System.out.println("Prozent mageres Fleisch Packung A : ");
		ProzentA=scan.nextDouble();
		
		System.out.println("Preis pro Pfund Packug B: ");
		PreisPfundB=scan.nextDouble();
		
		System.out.println("Prozent pro Pfund Packung B : ");
		ProzentB=scan.nextDouble();
		
		PreisA = PreisPfundA/ProzentA*100;
		PreisB = PreisPfundB/ProzentB*100;
		
		System.out.println("Packung A kostet pro Pfund mageres Fleisch: " + PreisA);
		System.out.println("Packung B kostet pro Pfund mageres Fleisch: " + PreisB);
		
		if (PreisA > PreisB)
			System.out.println("Packung B ist preiswerter . ");
		else 
			System.out.println("Packung A ist preiswerter . ");
		
		
		
		
	}

}
