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
		
		System.out.println("Stärke eingeben (1-10) : ");
		Staerke=scan.nextInt();
		
		System.out.println("Gesundheit eingeben (1-10) : ");
		Gesundheit=scan.nextInt();
		
		System.out.println("Glück eingeben (1-10): ");
		Glueck=scan.nextInt();
		
		GesamtePunkte=Staerke+Gesundheit+Glueck;
		
		if (GesamtePunkte<=15)
			System.out.println(name + " Stärke: " + Staerke +", "+ "Gesundheit: "+Gesundheit+ ", " +"Glück: " +Glueck  );
		else
			System.out.println("Sie haben Ihrer Spielfigur zu viele Punkt gegeben! Es wurden die Standarwerte zugewiesen: \n"
					+ name + " Stärke: 5, " + "Gesundheit: 5, " +"Glück: 5");
		
	
		


	}

}
