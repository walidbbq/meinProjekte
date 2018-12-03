package ifAnweisung;

import java.util.Scanner;

public class TankMoeglichkeit {

	public static void main(String[] args) {

		double TankKapazität, BenzinAnzeige, MeilenProGallone, AktuellesGalloneImTank, Ueberpruefen;

		System.out.println("Tankkapazität");
		Scanner scan = new Scanner(System.in);
		TankKapazität = scan.nextDouble();

		System.out.println("Benzinanzeige: ");
		BenzinAnzeige = scan.nextDouble();
		BenzinAnzeige = BenzinAnzeige / 100;

		System.out.println("Meilen prog Gallone: ");
		MeilenProGallone = scan.nextDouble();

		AktuellesGalloneImTank = TankKapazität * BenzinAnzeige; // Übrige Benzin im Tank pro Gallone
		Ueberpruefen = AktuellesGalloneImTank * MeilenProGallone; // Überprüfen ob es reicht durch Multiplikation mit
																	// MPG

		if (Ueberpruefen < 200)
			System.out.println("Tanken !");
		else
			System.out.println("Weiterfahren ! ");
		
		int i =(int)Ueberpruefen;
		 System.out.println(i);
	}

}
