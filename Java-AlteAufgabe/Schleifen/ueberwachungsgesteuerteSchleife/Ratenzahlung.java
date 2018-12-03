package ueberwachungsgesteuerteSchleife;

import java.util.Scanner;

public class Ratenzahlung {

	public static void main(String[] args) {

	    double KKG=1000;
		double saldo, gesamtb;
		
		System.out.println("Geben Sie den monatlichen Betrag ein: ");
		Scanner scan=new Scanner(System.in);
		double RatenZ=scan.nextDouble();
		
		int n = 1;
		gesamtb=RatenZ;

		do {
			saldo= (KKG * 0.015) +KKG -RatenZ;
			System.out.println("Monat: " + n + " Saldo: " +saldo + 
					"Gedamtbetrag: " + gesamtb); 
			KKG=saldo;
			gesamtb=gesamtb+RatenZ;
			n++;
			
		}while (saldo >0);
		
	}

}
