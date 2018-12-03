package U14;

import java.util.Scanner;

public class ifTester {
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Regnet es? (J oder N): ");
		String antwort;
		
		antwort= scan.nextLine();
		
		if (antwort.equalsIgnoreCase("J"))
			System.out.println("Scheibenwischer An");
		else
			System.out.println("Scheibenwischer Aus");
	}

}
