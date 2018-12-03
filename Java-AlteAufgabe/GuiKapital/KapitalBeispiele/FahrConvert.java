package KapitalBeispiele;

import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;

public class FahrConvert extends JFrame implements ActionListener
{
  JLabel heading  = new JLabel("Convert Fahrenheit to Celsius");
  JLabel inLabel  = new JLabel("Fahrenheit    ");
  JLabel outLabel = new JLabel("Celsius ");

  JTextField inFahr = new JTextField( 7 );
  JTextField outCel = new JTextField( 7 );

  int fahrTemp ;
  int celsTemp ;

  FahrConvert( String title )
  {
     super( title );
     setLayout( new FlowLayout() );

     inFahr.addActionListener( this );
     outCel.setEditable( false );

     add( heading );
     add( inLabel );
     add( outLabel );
     add( inFahr );
     add( outCel );

     setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  // Die Applikation
  public int convert( int F )
  {
    return ( (F-32) * 5 ) / 9;
  }

  public void actionPerformed( ActionEvent evt)
  {
	  String userIn = inFahr.getText() ;

	    try
	    {
	      fahrTemp = Integer.parseInt( userIn ) ;
	      celsTemp = convert( fahrTemp ) ;
	      outCel.setText( celsTemp+"" );
	    }

	    catch ( Exception ex )
	    {
	      outCel.setText( "Re-enter F" );
	      
	      System.out.println("*** Fehler aufgetreten***");
	      System.out.println("Urscahce: " + ex.getMessage());;
	      System.out.println(ex.toString());
	    }

	    repaint();
  }

  public static void main ( String[] args )
  {
    FahrConvert   fahr  = new FahrConvert( "F to C" ) ;

    fahr.setSize( 200, 150 );
    fahr.setVisible( true );
  }

}