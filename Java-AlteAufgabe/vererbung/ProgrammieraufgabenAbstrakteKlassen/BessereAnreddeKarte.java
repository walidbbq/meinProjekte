package ProgrammieraufgabenAbstrakteKlassen;


abstract class Karte
{
  String empfaenger;  // Name des Empfängers
  String anrede;
  
  public Karte (String empfaenger, String sex ) {
	  if (sex == "Männlich")
			  this.anrede="Lieber";
	  if (sex == "Weiblich") 
		  this.anrede="Liebe";
	  else 
		  this.anrede="Liebe(er)";
	  
	  this.empfaenger=empfaenger;
	  
  }
  
  public abstract void gruss();  // abstrakte gruss() Methode
}


class Feiertag extends Karte
{
  public Feiertag( String empfaenger,String sex )
  {
	  super (empfaenger,sex);
  }

  public void gruss()
  {
    System.out.println(anrede+ "\t" + empfaenger );
    System.out.println("frohe Feiertage!\n\n");
  }
  
}


class Geburtstag extends Karte
{
  int alter;

  public Geburtstag ( String empfaenger,String sex, int jahre )
  {
	super (empfaenger,sex);
	alter = jahre;
  }

  public void gruss()
  {
    System.out.println(anrede +"\t" + empfaenger );
    System.out.println("alles Gute zum " + alter + ". Geburtstag.\n\n");
  }
}

class Valentin extends Karte
{
  int kuesse;

  public Valentin ( String empfaenger, String sex,int k )
  {
	super (empfaenger,sex);
    kuesse     = k;
  }

  
  public void gruss()
  {
    System.out.println(  anrede + "\t" + empfaenger + ",");
    System.out.println("herzliche Gruesse und Kuesse");
    for ( int j = 0; j < kuesse; j++ )
      System.out.print("X");
   System.out.println("\n\n");
  }
}



public class BessereAnreddeKarte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Feiertag fr = new Feiertag ("Walid", "Männlich");
		fr.gruss();
		
		Geburtstag geb= new Geburtstag ("Anna", "f", 23);
		geb.gruss();
		
		
		Valentin val = new Valentin ("A&W", "Männlich", 2);
		val.gruss();
		

	}

}
