package schnittstelle;


class Waren
{
  String beschreibung;
  double preis;

  Waren( String beschreibung, double preis )
  {
    this.beschreibung = beschreibung;
    this.preis        = preis;
  }

  void anzeigen()
  {
    System.out.println( "Artikel: " + beschreibung +
        " Preis: " + preis );
  }
}


class Lebensmittel extends Waren
{
  double kalorien;

  Lebensmittel( String beschreibung, double preis, double kalorien)
  {
    super( beschreibung, preis );
    this.kalorien = kalorien ;
  }

  void anzeigen()
  {
    super.anzeigen();
    System.out.println( "Kalorien: " + kalorien );
  }
}

interface Besteuerbar
{
  final double STEUERSATZ = 0.06 ;
  double berechneSteuer() ;
}

//public 

interface Verbrauchssteuer extends Besteuerbar
{
  double VERBRAUCHSSTEUER = 0.02 ;
  double berechneVerbrauchsteuer() ;
}

class Spielwaren extends Waren implements Besteuerbar
{
  int mindestalter;

  Spielwaren( String beschreibung, double preis, int mindestalter)
  {
    super( beschreibung, preis );
    this.mindestalter = mindestalter;
  }

  void anzeigen()
  {
    super.anzeigen();
    System.out.println( "Mindestalter: " + mindestalter  );
  }

  public double berechneSteuer()
  {
    return preis * STEUERSATZ ;
  }
  
}

class Buecher extends Waren implements Besteuerbar
{
  String autor;

  Buecher( String beschreibung, double preis, String autor)
  {
    super( beschreibung, preis );
    this.autor  = autor ;
  }

  void anzeigen()
  {
    super.anzeigen() ;
    System.out.println( "Autor: " + autor );
  }

  public double berechneSteuer()
  {
    return preis*STEUERSATZ ;
  }
}



public class BeispieleEnerSchnittstelle {

	
	
	
	public static void main(String[] args) {
		Waren         waren        = new Waren( "Tube", 1.40 );
	    Lebensmittel  lebensmittel = new Lebensmittel ( "Milch", 0.95, 690 );
	    Spielwaren    spiel        = new Spielwaren  ( "Lego", 24.45, 8 );
	    Buecher       buch         = new Buecher ( "Emma", 14.95, "Austin" );

	    waren.anzeigen();

	    lebensmittel.anzeigen();
//
	    spiel.anzeigen();
	    System.out.println
	      ("Die Steuer betraegt: " + spiel.berechneSteuer() + "\n" );
//
	    buch.anzeigen();
	    System.out.println
	      ("Die Steuer betraegt: " + buch.berechneSteuer() + "\n" );
	    

	    Waren[] inventar =  new Waren[10];
	    inventar[0] = new Waren( "Tube", 1.40 );
	    inventar[1] = new Lebensmittel ( "Milch", 0.95, 690 );
	    inventar[2] = new Buecher ( "Emma", 14.95, "Austin" );
	    inventar[3] = new Spielwaren  ( "Lego", 24.45, 8 );

	    inventar[0].anzeigen();
	    inventar[1].anzeigen();
	    inventar[2].anzeigen();
	    inventar[3].anzeigen();
	    
	    Besteuerbar artikel1 = new Buecher ( "Emma", 24.95, "Austin" );
	    Besteuerbar artikel2 = new Spielwaren  ( "Lego", 54.45, 8 );
	    System.out.println( "Steuer fuer Artikel 1: " + artikel1.berechneSteuer() );
	    System.out.println( "Steuer fuer Artikel 2: " + artikel2.berechneSteuer() );
	    ((Buecher)artikel1).anzeigen();
	    
//	    Buecher     buch ;
	    Besteuerbar besteuerbar = new Buecher ( "Emma", 24.95, "Austin" );
	    buch = (Buecher)besteuerbar;
	    buch.anzeigen();
	    System.out.println( "Steuer fuer Artikel 1 "+ buch.berechneSteuer() );
	    
	    Waren       spielzeug;
	    Besteuerbar besteuerbar1 = new Spielwaren ( "Grobot", 1.49, 6 );
	    spielzeug = (Spielwaren)besteuerbar1;
	    spielzeug.anzeigen();
	    System.out.println( "Tax: "+ ((Besteuerbar)spielzeug).berechneSteuer());

	}

}
