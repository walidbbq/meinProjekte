package standardmaessig;

import standardmaessig.model.Genre;
import standardmaessig.model.schauspieler;

public class App {
	
	public static void main (String [] args ) {
		
		System.out.println("App MovieMaker ist gestartet !");
		
		schauspieler Hana= new schauspieler();
		schauspieler fridolin = new schauspieler();
		schauspieler lars=new schauspieler("lars", "lustig",2000,1,11);
		schauspieler susi=new schauspieler("susi", "sonneschein");
		
		String [] talenteThriller= {"Flüstern ", "Düster schauen"};
		String [] talenteKomoedie= {"Lachen", " Schmunzeln"};
		String [] talenteHorror= {"Schreien" , " Düster schauen"};
		
		
		Genre thriller =new Genre ("Thriller", 80, talenteThriller);
		Genre komoedie = new Genre ("Kömodie", 110, talenteKomoedie);
		Genre horror = new Genre ("Horror", 60, talenteHorror);
		
		Hana.vorname="Hana";
		Hana.nachname="Heiter";
		Hana.gehalt=40000;
		Hana.erfahrung=60;
		Hana.setGenre(komoedie);
		
		fridolin.vorname= "Fridolin";
		fridolin.nachname= "Fröhlich";
		fridolin.gehalt=30000;
		fridolin.erfahrung=80;
		fridolin.setGenre(komoedie);
		//fridolin.setGenre("Komodie",110);
		
		/*ausgabe(Hana);
		ausgabe(fridolin);
		*/
		
		Hana.ausgabe();
		fridolin.ausgabe();
		lars.ausgabe();
		susi.ausgabe();
		
		System.out.println("Susi erfolgsfaktor " + susi.erfolgsfaktor);
		
		schauspieler erfahrenerSchauspieler=Hana.erfahrungVergleichen(fridolin);{
			System.out.println( "Erfahrener ist " + erfahrenerSchauspieler.getVollstaendigerName());
		}
		
	}
	
	/*public static void ausgabe (schauspieler s ) {		
	System.out.println(s.vorname_ + " " + s.nachname_ + " " + "verdient $ " + s.gehalt_);
	}
	*/
}


