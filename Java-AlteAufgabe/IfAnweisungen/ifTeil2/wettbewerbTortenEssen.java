package ifTeil2;

import java.util.Scanner;

public class wettbewerbTortenEssen {

	public static void main(String[] args) {

		double gewicht;
		System.out.println("Geben Sie bitte Ihr Gewicht ein: ");
		Scanner scan = new Scanner (System.in);
		gewicht=scan.nextDouble();
		
		if (gewicht > 235 && gewicht<=265)
			System.out.println("Sie sind zum Wettbewerb zugelassen! ");
		else
			System.out.println("Sie sind leider zum Wettbewerb nicht zugelassen -_-");
		
	}

}
