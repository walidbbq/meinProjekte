package U14;

import java.util.Scanner;
public class ueberwchaungsshleifeAnwenderFragen {

	public static void main (String[] args )
	{
	Scanner scan = new Scanner ( System.in );
	int x; // ein Wert
	int sum=0; // Ergebnis
	String antwort = "j"; // "j" oder "n"
	while ( antwort.equals( "j" ) )
	{
	// Einen Wert für x holen.
	System.out.println("Geben Sie einen Wert fuer x ein:") ;
	x = scan.nextInt() ;
	//addiere value zu sum
	sum = sum + x;
	// Anwender fragen, ob das Programm fortfahren soll
	System.out.println("Fortfahren (j oder n)?");
	antwort = scan.next();
	}
	System.out.println( "Sum of the integers: " + sum );
	}

}
