package ifAnweisung;

import java.util.Scanner;
public class Discountpreise {

	public static void main(String[] args) {
		
		double discount, eingabe, gesamtenBetrag;
		final double rabat = 0.1;
		System.out.println("Geben Sie den Gesamtenbetrag aus: ");
		Scanner scan = new Scanner (System.in);
		eingabe=scan.nextInt();
		
		if (eingabe > 10) {
			
			discount=eingabe*rabat;
			gesamtenBetrag= eingabe - discount;
			
		 
			int i =(int)gesamtenBetrag;     // double zu int wechseln
			
			System.out.println("Desountpreis:" + i );
			
		}
		

		
		
	}

}
