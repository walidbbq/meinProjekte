import java.util.Scanner;

public class MeilenProGallone {

	public static void main(String[] args) 
	
	{	
//		Auto auto = new Auto (32456, 32810, 10.6);
//		System.out.println("Meilen pro Gallonen: " + auto.berechneMPG());	
//		
//		Scanner scan = new Scanner (System.in);
//		double startM, endM, gallonen;
//		
//		System.out.println("Anfangsstand eingeben: " );
//		startM=scan.nextDouble();
//		
//		System.out.println("Endstand eingeben: ");
//		endM=scan.nextDouble();
//		
//		System.out.println("Gallonen eingeben: ");
//		gallonen=scan.nextDouble();
//		
//		Auto auto2 = new Auto (startM,endM,gallonen);
//		
//		System.out.println("Meilen pro Gallonen: " + auto2.berechneMPG() );
//	
//
//		
//		if (auto2.benzinschwein()==true) {
//		System.out.println("Benzinschwein!");
//		}
//		
//		if (auto2.sparauto() ==true) {
//			System.out.println("Sparauto! ");
//		}
		
		Fuhrpark meineAutos=new Fuhrpark(1000,1234,10,777,999,20);
		System.out.println("Fuhrpark durchschnittlich MPG = " + meineAutos.berechneMPG());
		
		meineAutos.auftanken(1434, 10, 1099, 10);
		System.out.println("neuer durchschnuttlicher MPG Fuhrpark = " + meineAutos.berechneMPG());
	
	}

}
