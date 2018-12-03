package Aufgaben_OldScotch_Sonderposten;


class Artikel {
	
	double einkaufspreis;
	int lagerzeit;
	String artikelNr;
	String bezeichnung;
	
	final double Handelsspanne=0.6; //60 Prozent des Einkaufsprreises
	final double MWST = 0.19; 		//19 Prozent
	
	public Artikel (String artikelNr, String bezeichnung, double einkaufspreis, int lagerzeit){
		this.artikelNr=artikelNr;
		this.bezeichnung=bezeichnung;
		this.einkaufspreis=einkaufspreis;
		this.lagerzeit=lagerzeit;
	}
	
	public void anzeige () {
		System.out.println("ArtikelNr " + artikelNr + "\t Bezeichnung: " + bezeichnung+ " \t Einkaufspreis: "+ einkaufspreis+
				"\t Verkaufspreis: " + berechneVerkaufspris() +"\t Lagerzeit: " + lagerzeit );
	}
	
	public int berechneVerkaufspris() {
		double verkaufpreis;
		verkaufpreis=Math.round(einkaufspreis + (einkaufspreis*Handelsspanne) + (einkaufspreis*MWST) );
		int gerundetePreis=(int) verkaufpreis;
		
		//Math.ceil(verkaufpreis);
//		int gerundetePreis= (int) (verkaufpreis + (verkaufpreis > 0 ? 0.5 :0.5));
		return gerundetePreis;
	}
}
	
	class test extends Artikel{
		
		public test (String artikelNr, String bezeichnung, double einkaufspreis, int lagerzeit) {
			super(artikelNr,bezeichnung,einkaufspreis,lagerzeit);
		}
	}
	
	
	class Sonderposten extends Artikel {
		String rabatt;
		
		
		//Konstruktor des Subklasse
		
		public Sonderposten (String artikelNr, String bezeichnung, double einkaufspreis, int lagerzeit) 
		{
			super(artikelNr,bezeichnung,einkaufspreis,lagerzeit);
			if (lagerzeit > 12)
				this.rabatt = "30 %" ;
			else
				this.rabatt = "10 %";
		}
		
		
		public void anzeige( ) {
			super.anzeige(); 
			System.out.println("Rabat: " + rabatt + "  alter Verkaufspreis: " + super.berechneVerkaufspris());
		
		}
		
		public int berechneVerkaufspris () {
			
			int verkaufpreis = (int) (lagerzeit > 12 ?super.berechneVerkaufspris() - super.berechneVerkaufspris()*0.3 : 
				super.berechneVerkaufspris()-super.berechneVerkaufspris()*0.1);
			
			super.berechneVerkaufspris();
			return verkaufpreis;
		}
	}


public class oldScotchTester {

	public static void main(String[] args) {

		Artikel obT = new Artikel ("ScSbbQ","Test1",10.5,3);
		obT.anzeige();
		obT.berechneVerkaufspris();
		
		Sonderposten angebot= new Sonderposten ("dkjfkd", "Test2", 10.5, 3);
		angebot.anzeige();
		
	
		
	}

}
