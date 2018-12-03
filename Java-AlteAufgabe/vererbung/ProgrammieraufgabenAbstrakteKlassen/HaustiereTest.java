package ProgrammieraufgabenAbstrakteKlassen;

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
		System.out.println("Name: "+ name + " " + "Tage der Futtervorrat: " + anzahlTage);
	}
	
	public abstract void friss ();
	public abstract void sprich ();

}


class Hund extends Haustiere {
	
	Hund (String name, double futtervorrat )
	{
		super(name, futtervorrat);
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
		super.anzeigen();
	}
}


class Katze extends Haustiere {
	Katze (String name, double futtervorrat)
	{
		super (name,futtervorrat);
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
	super.anzeigen();	
	}
	
	        
}



public class HaustiereTest {

	public static void main(String[] args) {
		
		Hund h = new Hund ("hoho", 3);
		h.fuettern();
		h.anzeigen();
		
		Katze k = new Katze ("Momo", 3);
		k.futtern();
		k.anzeigen();

	}

}
