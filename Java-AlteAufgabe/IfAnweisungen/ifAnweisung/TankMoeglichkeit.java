package ifAnweisung;

import java.util.Scanner;

public class TankMoeglichkeit {

	public static void main(String[] args) {

		double TankKapazit�t, BenzinAnzeige, MeilenProGallone, AktuellesGalloneImTank, Ueberpruefen;

		System.out.println("Tankkapazit�t");
		Scanner scan = new Scanner(System.in);
		TankKapazit�t = scan.nextDouble();

		System.out.println("Benzinanzeige: ");
		BenzinAnzeige = scan.nextDouble();
		BenzinAnzeige = BenzinAnzeige / 100;

		System.out.println("Meilen prog Gallone: ");
		MeilenProGallone = scan.nextDouble();

		AktuellesGalloneImTank = TankKapazit�t * BenzinAnzeige; // �brige Benzin im Tank pro Gallone
		Ueberpruefen = AktuellesGalloneImTank * MeilenProGallone; // �berpr�fen ob es reicht durch Multiplikation mit
																	// MPG

		if (Ueberpruefen < 200)
			System.out.println("Tanken !");
		else
			System.out.println("Weiterfahren ! ");
		
		int i =(int)Ueberpruefen;
		 System.out.println(i);
	}

}
