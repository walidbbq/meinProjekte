package ueberwachungsgesteuerteSchleife;

import java.util.Scanner;

public class BereicheAddieren {

	public static void main(String[] args) {
		
		int summe1=0 ,summe2=0;

		System.out.println("Bereiche addieren" + "\n" + "Untergernze des Bereichs:");
		Scanner scan=new Scanner (System.in);
		int unterG=scan.nextInt();
		
		System.out.println("Obergrenze des Bereichs: ");
		int oberG=scan.nextInt();
		
		System.out.println("Daten eingeben: ");
		int datenE=scan.nextInt();
		
		while (datenE!=0) {
			

			if (datenE >= unterG && datenE<=oberG) 
				summe1=summe1+datenE;
			
			
			else 
		     	summe2=summe2+datenE;
			
			System.out.println("Daten eingeben: ");
			datenE=scan.nextInt();
			
//			
//			if ((datenE < unterG) || (datenE>oberG)) {
//				summe1=summe1+datenE;
//			}
//			
//			else { if  ((datenE >= unterG) || (datenE <= oberG))
//				summe2=summe2+datenE;
//			}
//			
//			System.out.println("Daten eingeben: ");
//			datenE=scan.nextInt();
	}
		
		System.out.println("Summer der Werte ausserhalb des Berecihs: " + summe1);
		System.out.println("Summe der Werte innerhalbe des Bereichs: " + summe2);	

}

}
