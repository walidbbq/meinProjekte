package ifAnweisung;

import java.util.Scanner;

public class EffizienzVonDampfmaschine {

	public static void main(String[] args) {
		
		double tLuft, tDampf;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Geben Sie die Lufttemperatur ein : ");
		tLuft=scan.nextDouble();
		
		System.out.println("Geben Sie die Dampftemperatur ein ");
		tDampf=scan.nextDouble();
		
		if (tDampf< 373)
			System.out.println("Die Effizienz betr�gt: 0");
		
		else
			System.out.println("Die Effizienz betr�gt: " + (1-(tLuft/tDampf)));
		
	}

}
