package aufgabe2;

import java.util.Scanner;

public class MeilenProGallone {

	public static void main(String[] args)

	{
		// Auto auto = new Auto (32456, 32810, 10.6);
		// System.out.println("Meilen pro Gallonen: " + auto.berechneMPG());
		
//		double startMeilen;
//		startMeilen=0;
		


		Scanner scan = new Scanner(System.in);
		
		Auto auto = new Auto(0);
		
		String schleife="n";
		
		while(schleife.equals("n")) {

		System.out.println("Aktuellen Tachometerstand eingeben: ");
		double aktTacho = scan.nextDouble();

		// System.out.println("Endstand eingeben: ");
		// endM=scan.nextDouble();

		System.out.println("Anzahl der Gallone für die Tankfüllung: ");
		double gallonen = scan.nextDouble();
			
		auto.auftanken(aktTacho, gallonen);
		
		System.out.println("Meilen pro Gallonen: " + auto.berechneMPG());
		

		if (auto.berechneMPG() <= 15)
			auto.benzinschwein();

		if (auto.berechneMPG() >= 30) {
			auto.sparauto();
		}
		
		System.out.println("Program beenden <j>a  <n>ein?");
		schleife=scan.next();
		}
		
		
		
//		System.out.println("Program beenden <ja>a <n>ein ?");
//		Scanner scan1 = new Scanner (System.in);
//		String scn=scan1.nextLine();
//		
//		//String jaNein = null;
//		 if (scn.equalsIgnoreCase("n") )
//		    {
//			 main(args);
//		    }
//		 else 
//			 System.out.println("Bye Bye !");
	}


}
