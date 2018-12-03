package ifTeil2;

import java.util.Scanner;

public class Scheckgebühr {

	public static void main(String[] args) {

		double Girokonto, Sparkonto;
		System.out.println("Girokonto eingeben: ");
		Scanner scan = new Scanner (System.in);
		Girokonto= scan.nextDouble();
		
		System.out.println("Sparkonto Eingeben : ");
		Sparkonto= scan.nextDouble();
		
		if (Girokonto>1000 || Sparkonto>1500)
		System.out.println("Es wird keine Scheckgebühr erhoben. ");
		else
			System.out.println("Es wird eine Schickgebühr zusätzlich von 0.15$ erhoben. ");
	
			
		
		
		
	}

}
