package U14;

import java.util.Scanner;


public class FlaecheEinesKreises {

	public static void main(String[] args) {

		double flaeche , radius;
		System.out.println(" Geben Sie den Radius ein :");
		Scanner scan = new Scanner (System.in);
		radius = scan.nextDouble();
		flaeche= (Math.PI * radius * radius);
		System.out.println(" Der Radius ist " + radius + " Die Fl�che betr�gt: " + flaeche);
	}

}
d