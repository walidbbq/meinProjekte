package Beispiele;

class Videoband
{
  String   titel;        // Titel des Videos
  int      laenge;       // Anzahl der Minuten
  boolean  vorhanden;    // ist das Video vorhanden?

  // Konstruktor
  public Videoband( String ttl )
  {
    titel = ttl; laenge = 90; vorhanden = true;
  }

  // Konstruktor
  public Videoband( String ttl, int len )
  {
    titel = ttl; laenge = len; vorhanden = true;
  }

  public void anzeigen()
  {
    System.out.println( titel + ", " + laenge + " Min. verfuegbar: " + vorhanden );
  }

}


class Spielfilm extends Videoband
{
  String  regisseur;     // Name des Regisseurs
  String  bewertung;     // G, PG, R, oder X

  // Konstruktor
  public Spielfilm( String ttl, int len, String reg, String bew )
  {
    super( ttl, len ); // den Konstruktor der Superklasse verwenden
    regisseur = reg;   // initialisieren, was in Spielfilm neu ist
    bewertung = bew;
  }
  
  public Spielfilm( String ttl, String reg, String bew )
  {
    super( ttl );     // den passenden Konstruktor der Superklasse aufrufen
    regisseur = reg;  // die eigenen Elemente von Spielfilm initialisieren
    bewertung = bew;
  }
  
////der Klasse Spielfilm hinzugefügt
//	public void anzeigen() {
//		System.out.println(titel + ", " + laenge + " Min. verfuegbar:" + vorhanden);
//		System.out.println("Regisseur: " + regisseur + "  " + bewertung);
//	}
	
	
	public void anzeigen()
  {
    super.anzeigen();
    System.out.println( "Regisseur: " + regisseur + "  " + bewertung );
}
	
}

class Musikvideo extends Videoband
{
  String kuenstler;
  String kategorie;
  
  // Konstruktor
  public Musikvideo ( String ttl, int len, String kuenst, String kat )
  {
    super( ttl, len );
    kuenstler = kuenst;
    kategorie = kat;
  }
  

  
  public void anzeigen()
  {
    super.anzeigen();
    System.out.println( "Kuenstler:" + kuenstler + " Kategorie: " + kategorie );
  }
  
}
  

public class videoverleih {
	
	public static void main(String[] args) 
	  {
	    Videoband artikelA = new Videoband("Jaws", 120 );
	    Videoband artikelB = new Videoband("Star Wars" );
	    Spielfilm artikelc = new Spielfilm("Jaws", 120, "Spielberg", "PG" );
	    
	    

	    artikelA.anzeigen();
	    artikelB.anzeigen();
	    artikelc.anzeigen();
	  }
}

