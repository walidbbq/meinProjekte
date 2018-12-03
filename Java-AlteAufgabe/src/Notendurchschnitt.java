
import java.util.Scanner;

public class Notendurchschnitt {

	public static void main(String[] args) {
		double eingabe=0;
		double summe=0;
		int i=0;

		double [] noten= new double [10];
		Scanner scn = new Scanner (System.in);
		for( i =0 ; (i < 10) && (eingabe >= 0)  ; i++) {
			
			System.out.println("Die " + (i+1) + " Note: ");
			eingabe=scn.nextDouble();
			noten[i]=eingabe;
			summe=summe+noten[i];
		}
		
		double durchschnitt = summe/i;
		System.out.println("Der Durchschnitt ist : " + durchschnitt);
	} 

}
