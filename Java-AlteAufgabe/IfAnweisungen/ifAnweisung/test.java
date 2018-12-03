package ifAnweisung;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		double AnzahlP = 0 , Erhitzugszeit = 0,wieder;
		//String wieder;
		Scanner scan = new Scanner (System.in);
		
			System.out.println("Geben Sie bitte Anzahl der Posten: ");
		AnzahlP =scan.nextDouble();
	
		for (int i=0 ; AnzahlP>3; i++){
			System.out.println("Das Erhitzen von mehr als drei Posten wird nicht empfholen! \n Geben Sie bitte Anzahl weniger als 4 : ");
			AnzahlP=scan.nextDouble();
		}
		
		System.out.println("Geben Sie die Erhitzungszeit für einen Post: ");
		Erhitzugszeit=scan.nextDouble();
			
		if (AnzahlP == 1)
			System.out.println("die empfohlene Erhitzungszeit: "  + Erhitzugszeit );
		else if (AnzahlP==2)
			System.out.println("die empfohlene Erhitzungszeit: " + (Erhitzugszeit+(Erhitzugszeit*0.5)) );
		else if (AnzahlP==3)
			System.out.println( "die empfohlene Erhitzungszeit: " + Erhitzugszeit*2 );
		}

}
