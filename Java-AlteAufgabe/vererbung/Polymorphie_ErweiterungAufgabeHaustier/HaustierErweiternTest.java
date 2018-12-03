package Polymorphie_ErweiterungAufgabeHaustier;


abstract class Haustiere {
	String name;
	double futtervorrat;
	int anzahlTage;
	
	Haustiere (String name, double futtervorrat ) {
		this.name=name;
		this.futtervorrat=futtervorrat;
	}
	
	
	public void fuettern()
	{
		sprich();
		
		
		for (;futtervorrat>0;) {
			friss();
			anzahlTage ++;
		}
		
		
	}
	
	public void anzeigen() 
	{
		System.out.println( "Der Vorrt für " + name + " reicht für : " + anzahlTage + " Tage.");
	}
	
	public abstract void friss ();
	public abstract void sprich ();

}


class Hund extends Haustiere {
	String kategorie;
	
	Hund (String name, double futtervorrat, int kat )
	{
		super(name, futtervorrat);
		if (kat==1)
			this.kategorie="Kleinhunde";
		else if  (kat==2)
			this.kategorie="Mittelgrosse Hunde";
		else if (kat==3)
			this.kategorie="Große Hunde";
		
	}
	
	public void sprich () 
	{
	System.out.println("Wuff!");
	}
	
	public void friss () 
	{
		System.out.println(name + ": " + futtervorrat);
		futtervorrat= futtervorrat -1;
	}
	
	public void futtern () 
	{
		super.fuettern();
	
	}
	
	public void anzeigen () 
	{
		System.out.print("(Kategorie: " + kategorie + ") ");
		super.anzeigen();
	}
}


class Katze extends Haustiere {
	String haltung;
	
	Katze (String name, double futtervorrat, int kat)
	{
		super (name,futtervorrat);
		if (kat==1)
			this.haltung="Whonung";
		else if  (kat==2)
			this.haltung="Artgerecht";
	}
	
	public void sprich ()
		{
		System.out.println("Miau!");
		}
	
	
	public void friss ()
		{
		System.out.println(name + ": " + futtervorrat);
		futtervorrat= futtervorrat - 0.5;	
		}
	
	
	public void futtern ( ) 
	{
		super.fuettern();
	}
	
	public void anzeigen () 
	{
	System.out.print("(Haltung: " + haltung + ") ");
	super.anzeigen();	
	}
	
	        
}



public class HaustierErweiternTest {

	public static void main(String[] args) {
		Hund h = new Hund ("hoho", 3,2);
		h.fuettern();
		h.anzeigen();
		
		Katze k = new Katze ("Momo", 3,2);
		k.futtern();
		k.anzeigen();
	}

}
