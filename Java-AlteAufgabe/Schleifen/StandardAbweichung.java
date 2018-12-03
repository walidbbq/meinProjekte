import java.util.Scanner;

public class StandardAbweichung {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Wie viele Zahlen N follgen werden ? ");
		double AnzahlZ=scan.nextInt();
		
		int i = 0;
		double gp=0;
		double summe =0;
		double summe2=0;
		while (i < AnzahlZ) {
			
			System.out.println("Geben Sie bite die Gleitpunktzahlen nacheinader: ");
		    gp=scan.nextDouble();
		    summe=summe+gp;
		    summe2=summe2+gp*gp;
			i++;
			
		}
		
		double durchschnitt=summe/AnzahlZ; // i klappt auch 
		System.out.println("durchschnitt= " + durchschnitt);
		
		double durchschnitt2=durchschnitt*durchschnitt;
		System.out.println("durchschnitt Hoch 2 = " + durchschnitt2);
		
		double durchschnittQ=summe2/AnzahlZ;
		System.out.println("durchschnittQ= " + durchschnittQ);
		
		double SD=Math.sqrt(durchschnittQ-durchschnitt2);
		System.out.println("Die Standardabweichung : " +SD);
		
		

		

		

		
	}

}
