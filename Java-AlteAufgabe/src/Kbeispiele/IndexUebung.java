package KapitalBeispiele;
import java.lang.* ;
import java.io.* ;

public class IndexUebung
{
  public static void main ( String[] a ) throws IOException
  {
    BufferedReader stdin =
        new BufferedReader ( new InputStreamReader( System.in ) );
    String inData; int zahl=0, slot=0 ;

    int[] zahlen = new int[10];

    try
    {
      System.out.println("Geben Sie eine Zahl ein:");
      inData = stdin.readLine();
      zahl   = Integer.parseInt( inData );
      System.out.println("Geben Sie den Array-Index ein:");
      inData = stdin.readLine();
      slot   = Integer.parseInt( inData );

      zahlen[slot] = zahl;
    }

    catch (NumberFormatException ex )
    {
      System.out.println("Es ist folgendes Problem aufgetreten: " + ex.getMessage()
          + "\nHier ist wobei es passiert ist:\n");
      ex.printStackTrace();
    }

    catch (IndexOutOfBoundsException ex )
    {
      System.out.println("Es ist folgendes Problem aufgetreten: " + ex.getMessage()
          + "\nHier ist wobei es passiert ist:\n");
      ex.printStackTrace();
    }

    System.out.println("Good-bye" );
  }
}