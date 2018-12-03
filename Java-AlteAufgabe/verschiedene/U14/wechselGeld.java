package U14;

import java.util.Scanner;

public class wechselGeld {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		int betrag, rest , dollar , quarter, dime, nickel, cent;
		
		System.out.println("Geben Sie das Wechselgeld ein: ");
		
		betrag=scan.nextInt();
		
		dollar=betrag / 100;
		rest=betrag % 100;
		quarter= rest / 25;
		rest= rest % 25;
		dime= rest / 10;
		rest= rest % 10;
		nickel= rest / 5;
		rest= rest % 5;
		cent= rest / 1;
		//rest=rest%1;
		
		System.out.println("Das Wechselgeld ist " +dollar+ " Dollar, "+quarter+" Quarter, "+dime+" Dime, "+
		nickel+" Nickel, "+cent+" Cent.");
}
}
