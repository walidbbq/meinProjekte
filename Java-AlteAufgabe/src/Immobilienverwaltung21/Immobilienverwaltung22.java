import java.util.Calendar;

import java.util.GregorianCalendar;


  class Einfamilienhaus1 {
	
	// Definition der Attribute
	public String Besitzer;
	public String Adresse;
	public int Baujahr ;
	public double Verkaufspreis;
	public String Haustyp;
	public double Wohnflaeche;
	public double AnzahlZimmer;
	public double Gartenflaeche;
	public boolean HatGarage;
	public int alter;
	
//Methoden
	public double anfragenVerkaufspreis() {
	 System.out.println("Verkaufspreis: " + Verkaufspreis + " Euro");
	 return Verkaufspreis;
	}
	
	
	 // Einfamilienhaus2 f2 = new Einfamilienhaus1().new Einfamilienhaus2();
	
 }	
	
  

	
	 class Einfamilienhaus2 {	
		 
			 int berechneAlter(Einfamilienhaus1 alterBerechnen) {
				 
				 GregorianCalendar aktuell = new GregorianCalendar();
				 int AktuellesJahr = aktuell.get(Calendar.YEAR);
				 alterBerechnen.alter = (AktuellesJahr - alterBerechnen.Baujahr);
				 System.out.println(alterBerechnen.alter);
				 return  alterBerechnen.alter;
			 }
			 
	 }
	
 


public class Immobilienverwaltung22 {

	public static void main(String args[]) {
		
		System.out.println("Programm Immobilienverwaltung v2");
		
//		  new Einfamilienhaus1().new Einfamilienhaus2().berechneAlter();
		
//		Einfamilienhaus1 f1= new Einfamilienhaus1();
//		Einfamilienhaus1.Einfamilienhaus2 f2 = f1.new Einfamilienhaus2();
//		f2.berechneAlter(einEinfamilienhaus);
			
//		Einfamilienhaus1 f1=new Einfamilienhaus1();
//		Einfamilienhaus2 f2=f1.new Einfamilienhaus2();
		//f2.berechneAlter();
		
			
			// Reservieren des Speicherplatzes für dieses Objekt
			 Einfamilienhaus1 einEinfamilienhaus = new Einfamilienhaus1();
			 Einfamilienhaus2 e2 = new Einfamilienhaus2();
			
			// Füllen des Objektes mit Werten
			einEinfamilienhaus.Besitzer = "Meier";
			einEinfamilienhaus.Adresse = "Augsburg";
			einEinfamilienhaus.Baujahr = 1920;
			einEinfamilienhaus.Verkaufspreis = 7500000.0;
			einEinfamilienhaus.Haustyp = "Bauernhaus";
			einEinfamilienhaus.Wohnflaeche = 250;
			einEinfamilienhaus.AnzahlZimmer = 8;
			einEinfamilienhaus.Gartenflaeche = 10000;
			einEinfamilienhaus.HatGarage = true;
			
			//f2.berechneAlter(einEinfamilienhaus.Baujahr);
			
			e2.berechneAlter(einEinfamilienhaus);
			
			// Ausgabe des Objektes
			System.out.println("Haustyp : " + einEinfamilienhaus.Haustyp);
			System.out.println("Besitzer : " + einEinfamilienhaus.Besitzer);
			System.out.println("Baujahr : " + einEinfamilienhaus.Baujahr);

			
			
			// Aufruf der Methode anfragenVerkaufspreis()
			einEinfamilienhaus.anfragenVerkaufspreis();
		
	}
	
	
	
	}


