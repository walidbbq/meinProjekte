package ifAnweisung;

import java.util.Scanner;

public class FantasySpiel {

	public static void main(String[] args) {
		
		int Staerke , Gesundheit, Glueck, GesamtePunkte;
		String name;
		
		System.out.println("Willkommen zu Yertle's Schatzsuche ! ");
		System.out.println("Geben Sie den Namen der Spielerfigur ein");
		Scanner scan = new Scanner(System.in);
		name=scan.nextLine();
		
		System.out.println("St�rke eingeben (1-10) : ");
		Staerke=scan.nextInt();
		
		System.out.println("Gesundheit eingeben (1-10) : ");
		Gesundheit=scan.nextInt();
		
		System.out.println("Gl�ck eingeben (1-10): ");
		Glueck=scan.nextInt();
		
		GesamtePunkte=Staerke+Gesundheit+Glueck;
		
		if (GesamtePunkte<=15)
			System.out.println(name + " St�rke: " + Staerke +", "+ "Gesundheit: "+Gesundheit+ ", " +"Gl�ck: " +Glueck  );
		else
			System.out.println("Sie haben Ihrer Spielfigur zu viele Punkt gegeben! Es wurden die Standarwerte zugewiesen: \n"
					+ name + " St�rke: 5, " + "Gesundheit: 5, " +"Gl�ck: 5");
		
	
		


	}

}
