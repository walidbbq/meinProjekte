package U14;

import java.util.Scanner;
public class KeineErgebnisgesteuerteSchleife {

	public static void main(String[] args) {
		double dollars,eingabeD ;
		int jahre = 1 ;
		double zinssatz ;
		
		// Zinssatz vom Anwender einholen
		Scanner scan = new Scanner( System.in );
		System.out.println("Geben Sie den Zinssatz in Prozent ein:") ;
		zinssatz = scan.nextDouble()/100.0 ;
		System.out.println("Wie vile h�tten Sie j�hrlich einzahlen? ");
		eingabeD=scan.nextDouble();
		dollars=eingabeD;
		while ( jahre <= 40 )
		{
		// Zinsen f�r ein weiteres Jahr addieren

		dollars = dollars + dollars * zinssatz ;
		
		// f�gen Sie die j�hrliche Einzahlung hinzu
		dollars = dollars + eingabeD ;

	
		jahre = jahre + 1 ;
		}
		System.out.println("Nach 40 Jahren bei " + zinssatz*100
		+ " Prozent Zinsen werden Sie " + dollars + " Dollar haben." ) ;
	}

}
