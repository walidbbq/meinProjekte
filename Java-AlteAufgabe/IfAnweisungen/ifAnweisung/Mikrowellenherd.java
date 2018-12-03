package ifAnweisung;

import java.util.Scanner;

public class Mikrowellenherd {

	public static void main(String[] args) {

		double AnzahlP , Erhitzugszeit;
		System.out.println("Geben Sie bitte Anzahl der Posten: ");
		Scanner scan = new Scanner (System.in);
		AnzahlP =scan.nextDouble();
		
		System.out.println("Geben Sie die Erhitzungszeit für einen Post: ");
		Erhitzugszeit=scan.nextDouble();
			
		if (AnzahlP == 1)
			System.out.println("die empfohlene Erhitzungszeit: "  + Erhitzugszeit );
		else if (AnzahlP==2)
			System.out.println("die empfohlene Erhitzungszeit: " + (Erhitzugszeit+(Erhitzugszeit*0.5)) );
		else if (AnzahlP==3)
			System.out.println( "die empfohlene Erhitzungszeit: " + Erhitzugszeit*2 );
		else
			System.out.println("Das Erhitzen von mehr als drei Posten wird nicht empfholen! \n Geben Sie bitte Anzahl weniger als 4 . ");
	}

}
