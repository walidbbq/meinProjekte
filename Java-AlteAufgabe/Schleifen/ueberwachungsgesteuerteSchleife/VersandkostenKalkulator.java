package ueberwachungsgesteuerteSchleife;

import java.util.Scanner;

public class VersandkostenKalkulator {

	public static void main(String[] args) {
		
		double gewicht, versandK;
		final double versandKF = 3 ;

		System.out.println("Gwicht der Sendung: ");
		Scanner scan = new Scanner (System.in);
		gewicht=scan.nextInt();

		
	while (gewicht > 0) {
		
		if (gewicht>10) {
			versandK=versandKF+(gewicht-10)*0.25;
			System.out.println("Versandkosten: $" + versandK );
		}
		
		else {
			System.out.println("Versandkosten: $" + versandKF);
		}
		
		System.out.println(" \nGwicht der Sendung: ");
		gewicht=scan.nextInt();
		
	}
	System.out.println("bye. ");
		
		
		
	}

}
