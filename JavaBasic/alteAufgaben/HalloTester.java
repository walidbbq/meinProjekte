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
}

public class HalloTester
{
  public static void main(String[] args)
  {
    System.out.println( "1. Konstruktor" );
    HalloObjekt einObjekt = new HalloObjekt(); // den paramterlosen Konstruktor verwenden
    einObjekt.sprich();
    System.out.println( "\n2. Konstruktor" );
    einObjekt = new HalloObjekt("Hallo Objekt"); // den 2. Konstruktor verwenden
    einObjekt.sprich();

  }
}
