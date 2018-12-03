package ifAnweisung;

import java.util.Scanner;

public class InternetDelikatessen {

	public static void main(String[] args) {

	String Artikel;
	int Preis, Versand ,ExVersand;
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Geben Sie den Artikel ein: ");
	Artikel=scan.nextLine();
	
	System.out.println("Geben Sie den Preis ein : ");
	Preis=scan.nextInt();
	
	System.out.println("Expressversan (0==nein, 1==ja) :");
	ExVersand=scan.nextInt();
	if (ExVersand==1)
		ExVersand=5;
	else
		ExVersand=0;
	
	if (Preis<10)
		Versand=2;
	else 
		Versand=3;
	System.out.println("Rechnung"+ "\n" + Artikel +"  "+ Preis +"\n" + "Versand: " + (Versand+ExVersand) + "\n" 
		+ "Gesamt: " + (Preis+Versand+ExVersand));
	
	}

}
