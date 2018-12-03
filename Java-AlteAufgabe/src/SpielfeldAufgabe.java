
import java.util.Scanner;


public class SpielfeldAufgabe {

	public static void main(String[] args) {
		
		int bewegen;

		int [][] spielfeld = new int [8] [8];
		int start=spielfeld[1][0];
		Scanner scn = new Scanner (System.in);
		String eingabe=scn.next();
		
		if (eingabe.equals( "w"))	
			
			System.out.println(eingabe);
			
	}

}
