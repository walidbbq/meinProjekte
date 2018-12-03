package schnittstelleAugabe;


class Waren
{
  private String beschreibung;
  private double preis;
  private int anzahl;

  public Waren( String beschreibung, double preis, int anzahl )
  {
    this.beschreibung = beschreibung;
    this.preis        = preis;
    this.anzahl       = anzahl;
  }

  public void anzeigen()
  {
    System.out.println( "Artikel: " + beschreibung +
        " Preis: " + setPreis() + " Anzahl: " + anzahl);
  }
  
  public double getPreis() 
  {
	  return preis;
  }
  
  public double setPreis() 
  {
	 double preis=getPreis()*anzahl;
	  return preis;
  }
}
  
  
  class Lebensmittel extends Waren
  {
   private double kalorien;

    Lebensmittel( String beschreibung, double preis, int anzahl, double kalorien)
    {
      super( beschreibung, preis, anzahl );
      this.kalorien = kalorien ;
    }

    public void anzeigen()
    {
      super.anzeigen();
      System.out.println( "Kalorien: " + kalorien );
    }
    
    public double getPreis()
    {
     return super.getPreis();
    }
    
    public double setPreis() 
    {
    return super.setPreis();
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
   private int mindestalter;

    Spielwaren( String beschreibung, double preis, int anzahl, int mindestalter)
    {
      super( beschreibung, preis, anzahl );
      this.mindestalter = mindestalter;
    }

    public void anzeigen()
    {
      super.anzeigen();
      System.out.println( "Mindestalter: " + mindestalter  );
    }

    public double berechneSteuer()
    {
      return getPreis() * STEUERSATZ ;
    }
    
    public double getPreis()
    {
     return super.getPreis();
    }
    
    public double setPreis () 
    {
    return super.setPreis();
    }
    
  }

  class Buecher extends Waren implements Besteuerbar
  {
   private String autor;

    Buecher( String beschreibung, double preis, int anzahl, String autor)
    {
      super( beschreibung, preis, anzahl );
      this.autor  = autor ;
    }

   public void anzeigen()
    {
      super.anzeigen() ;
      System.out.println( "Autor: " + autor );
    }

    public double berechneSteuer()
    {
      return getPreis()*STEUERSATZ ;
    }
    
    public double getPreis()
    {
     return super.getPreis();
    }
    
    public double setPreis() 
    {
    return super.setPreis();
    }
  }
  
  // fehlende Methoden
  // getPreis(), setPreis(), getAnzahl(), setAnzahl()

public class BessereKapselung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Waren ware=new Waren ("Schuhe", 4,2);
		ware.anzeigen();
		//System.out.println(ware.getPreis());
		System.out.println(ware.setPreis());
		
		Lebensmittel lm= new Lebensmittel ("Milch", 2.5,2,300);
		lm.anzeigen();
		
		
		
		Buecher buch = new Buecher("Duden", 2,3,"HerrDuden");
		buch.anzeigen();
		System.out.println(buch.getPreis());
		
	
		
	}

}
