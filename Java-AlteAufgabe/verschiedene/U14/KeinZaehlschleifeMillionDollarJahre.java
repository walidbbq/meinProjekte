package U14;

import java.util.Scanner;
public class KeinZaehlschleifeMillionDollarJahre {

	public static void main(String[] args) {
		
		double dollars ;
		final double ZINSSATZ = 0.05;
		int jahre = 0 ;
		System.out.println("den Betrag eingeben: ");
		Scanner scan=new Scanner (System.in);
		dollars=scan.nextDouble();
		while ( dollars < 1000000.0 )
		{
		// Zinsen f�r ein weiteres Jahr addieren
		dollars = dollars + dollars*ZINSSATZ;
		jahre = jahre + 1;
		}
		System.out.println(
		"Es braucht " + jahre + " Jahre, um das Ziel zu erreichen.");
		}
	}

