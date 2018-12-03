import java.util.Scanner;

class HalloObjekt
{
  String mitteilung;

  // 1. Konstruktor
  HalloObjekt()
  {
    mitteilung = "Hallo";
  }

  // 2. Konstruktor
  HalloObjekt(String mit)
  {
    mitteilung = mit;
  }

  // Methodendefinition
  void sprich()
  {
    int i = 0;
    while ( i < mitteilung.length() )
    {
      System.out.println(mitteilung);
      i = i + 1;
    }
  }
  
  
  void mitteilungMorgens()
  {
    System.out.println("Guten Morgen " + mitteilung );
  }

  void mitteilungAbends()
  {
    System.out.println("Guten Abend " + mitteilung );
  }

  //  void sprich() // ausgelassen...

}

  
  
  


public class HalloTester
{
  public static void main(String[] args)
  {
	  
	//  Aufgabe1
//    System.out.println( "1. Konstruktor" );
//    HalloObjekt einObjekt = new HalloObjekt(); // den paramterlosen Konstruktor verwenden
//    einObjekt.sprich();
//    System.out.println( "\n2. Konstruktor" );
//    einObjekt = new HalloObjekt("Hallo Objekt"); // den 2. Konstruktor verwenden
//    einObjekt.sprich();
	  
//	  Aufgabe2   
//    HalloObjekt einObjekt = new HalloObjekt("Welt");
//    einObjekt.mitteilungMorgens();
//    einObjekt.mitteilungAbends();
	  
	  String inData;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Geben Sie einen Gruss ein:");
	    inData = scan.nextLine();

	    HalloObjekt einObjekt = new HalloObjekt(inData);
	    einObjekt.sprich();


  }
}
