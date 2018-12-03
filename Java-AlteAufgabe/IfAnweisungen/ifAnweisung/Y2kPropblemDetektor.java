package ifAnweisung;

import java.util.Scanner;

public class Y2kPropblemDetektor {

	public static void main(String[] args) {
		
		int GeburtsJahr, AktuellesJahr;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("GeburtsJahr: ");
		GeburtsJahr= scan.nextInt();
		
		System.out.println("Aktuelles Jahr: ");
		AktuellesJahr=scan.nextInt();
		
		if (AktuellesJahr < GeburtsJahr ) {
			GeburtsJahr=100-GeburtsJahr + AktuellesJahr;
			System.out.println("Ihr Alter: " + GeburtsJahr);
		}
		else { 
			System.out.println("Ihr Alter:" + (AktuellesJahr - GeburtsJahr));
		}
		
	}

}
