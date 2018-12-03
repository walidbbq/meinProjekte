package Kbeispiele;

//public class AnwenderFreundlicherCode {

import java.lang.* ;
import java.util.Scanner;
import java.io.* ;

public class AnwenderFreundlicherCode
{

  public static void main ( String[] a ) throws IOException
  {
//    BufferedReader stdin =
//        new BufferedReader ( new InputStreamReader( System.in ) );

	  String inData;
	  int     zahl=0 ;
	  double zahld=0;
	  boolean goodData = false ;
	  
	  Scanner scn = new Scanner (System.in);
//	  zahl=scn.nextInt();
   
  

    while ( goodData==false )
    {
     System.out.println("Eine Zahl eingeben:");
     inData=scn.nextLine();

      try
      {
        zahl = Integer.parseInt(inData);
       // zahld=Double.parseDouble(inData);
        goodData = true;
      }

      catch (NumberFormatException ex )
      {
        System.out.println("Versuchen Sie es noch einmal.\n" );
      }

    }

    System.out.println("Das Quadrat von " + zahl + " ist " + zahl*zahl );

  }
}