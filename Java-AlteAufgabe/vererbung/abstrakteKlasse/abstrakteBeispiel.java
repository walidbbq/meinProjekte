package abstrakteKlasse;

import java.util.Scanner;

abstract class Karte
{
  String empfaenger;             // Name des Empfängers
  public abstract void gruss();  // abstrakte gruss() Methode
}


class Feiertag extends Karte
{
  public Feiertag( String e )
  {
    empfaenger = e;
  }

  public void gruss()
  {
    System.out.println("Dear " + empfaenger + ",\n");
    System.out.println("frohe Feiertage!\n\n");
  }
  
}


class Geburtstag extends Karte
{
  int alter;

  public Geburtstag ( String e, int jahre )
  {
    empfaenger = e;
    alter = jahre;
  }

  public void gruss()
  {
    System.out.println("\n\nDear " + empfaenger );
    System.out.println("alles Gute zum " + alter + ". Geburtstag.");
  }
}

class KinderGeburtstag extends Geburtstag{
	
	KinderGeburtstag (String e, int jahre){
		super ( e, jahre );
	}
	
	public void gruss () {
		super.gruss();
		System.out.println("Was bist du gross geworden!!\n");
	}
	
	public void  gruss (String absender) {
		super.gruss();
	    System.out.println("Was bist du gross geworden!!");
	    System.out.println("In Liebe, " + absender + "\n" );
	}
	
}


class ErwachsenenGeburtstag  extends Geburtstag {

	ErwachsenenGeburtstag (String e, int jahre) {
		super (e,jahre);
	}
	
	public void gruss() {
		super.gruss();
		System.out.println("Du siehst so jung aus wie immer!");
	}
}



class Valentin extends Karte
{
  int kuesse;

  public Valentin ( String e, int k )
  {
    empfaenger = e;
    kuesse     = k;
  }

  public void gruss()
  {
    System.out.println("Dear " + empfaenger + ",\n");
    System.out.println("herzliche Gruesse und Kuesse,\n");
    for ( int j = 0; j < kuesse; j++ )
      System.out.print("X");
   System.out.println("\n\n");
  }
}


public class abstrakteBeispiel {

	public static void main(String[] args) {

		 String name;
		 int alter;
		 int valentein;
		    Scanner scan = new Scanner( System.in );
//
//		    System.out.println("Ihr Name");
//		    name = scan.nextLine();
//		    
//		    System.out.println("Ihr Alter");
//		    alter=scan.nextInt();
//		    
//		    System.out.println("Iht Valentinjahr");
//		    valentein=scan.nextInt();
//		    
//
//		    Feiertag   feiern = new Feiertag( name );
//		    feiern.gruss();
//
//		    Geburtstag  geb  = new Geburtstag( name, alter );
//		    geb.gruss();
//
//		    Valentin val = new Valentin( name, valentein );
//		    val.gruss();
//		    
//		    
//
//		    Karte postkarte = new Feiertag( "Amy" );
//		    postkarte.gruss();                      //Feiertag gruss() aufrufen
//
//		    postkarte = new Valentin( "Bob", 3 );
//		    postkarte.gruss();                      //Valentin gruss() aufrufen
//
//		    postkarte = new Geburtstag( "Cindy", 17 );
//		    postkarte.gruss();                      //Geburtstag gruss() aufrufen
//		    
//		    Geburtstag geb1 = new KinderGeburtstag ("Valerie",7);
//		    	geb1.gruss();
//		    
//		    geb1= new ErwachsenenGeburtstag("Walter", 47);
//		    		geb1.gruss();
//		    
//		    geb1= new Geburtstag ("Zoe", 30);
//		    geb1.gruss();
//		    
//		    KinderGeburtstag kg = new KinderGeburtstag ("Henry", 12 );
//		    kg.gruss();
//		    kg.gruss("Walidxxx");
//		    
		    Karte[] karten = new Karte[12];

		    karten[0]     = new KinderGeburtstag( "Valerie", 7 );
		    karten[1]     = new ErwachsenenGeburtstag( "Walter", 47 );
		    karten[2]     = new Geburtstag( "Zoe", 30 );
		    karten[3]     = new Feiertag( "Kelly" );
		    karten[4]     = new Valentin( "Jill", 42 );

		    for ( int j = 0; j <= 4; j++ )
		      karten[ j ].gruss();
		    
		    Object obj;
		    KinderGeburtstag kinder = new KinderGeburtstag ( "Ian", 4 );
		    String           str    = "Yertle" ;

		    obj = kinder;
		   

		    if ( obj instanceof KinderGeburtstag )
		      ( (KinderGeburtstag)obj ).gruss();

		    if ( obj instanceof Geburtstag )
			      ( (KinderGeburtstag)obj ).gruss();
		    
		    if ( obj instanceof String )
		      System.out.print( (String)obj );

		    
	}

}
