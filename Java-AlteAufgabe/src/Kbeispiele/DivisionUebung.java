package KapitalBeispiele;

import java.lang.* ;
import java.io.* ;

public class DivisionUebung
{
  public static void main ( String[] a ) throws IOException
  {
    BufferedReader stdin =
        new BufferedReader ( new InputStreamReader( System.in ) );
    String inData;
    int    zahl=0, div=0 ;

    try
    {
      System.out.println("Geben Sie den Zaehler ein:");
      inData = stdin.readLine();
      zahl    = Integer.parseInt( inData );
      System.out.println("Geben Sie den Divisor ein:");
      inData = stdin.readLine();
      div    = Integer.parseInt( inData );

      System.out.println( zahl + " / " + div + " ist " + (zahl/div) );
    }
   
    catch ( ArithmeticException ex )
    {
      System.out.println
        ( "Sie koennen  " + zahl + " nicht durch " + div + " dividieren" );
    }
    
    catch ( NumberFormatException ex )
    {
      System.out.println("Sie haben falsche Daten eingegeben." );
      System.out.println("Starten Sie das Programm erneut." );
    }

  }
}