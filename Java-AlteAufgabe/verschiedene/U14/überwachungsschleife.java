package U14;

import java.util.Scanner;
public class überwachungsschleife {

	public static void main(String[] args) {

		Scanner scan = new Scanner( System.in );
		int value; // Daten ,die der Anwender eingibt
		int sum = 0; // Summe initialisieren
		// den ersten Wert holen
		System.out.println( "Enter first integer (enter 0 to quit):" );
		value = scan.nextInt(); // "frischer" Wert
		// zum testen
		while ( value != 0 )
		{
		// value zu sum addieren
		sum = sum + value;
		// den nächsten Wert vom Anwender holen
		System.out.println( "Enter next integer (enter 0 to quit):" );
		value = scan.nextInt(); // "frischer" Wert zum testen
		}
		System.out.println( "Sum of the integers: " + sum );
	}

}
