package Aufgaben3;

//public class TemperaturKonverter {

import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;

public class TemperaturKonverter extends JFrame implements ActionListener
{
  JLabel heading  = new JLabel("Convert Fahrenheit to Celsius");
  JLabel inLabel  = new JLabel("Celsius    ");
  JLabel outLabel = new JLabel("Fahrenheit	 ");

  JTextField inCel = new JTextField( 7 );
  JTextField outFahr = new JTextField( 7 );

  int fahrTemp ;
  int celsTemp ;

  TemperaturKonverter( String title )
  {
     super( title );
     setLayout( new FlowLayout() );

     inCel.addActionListener( this );
     outFahr.setEditable( false );

     add( heading );
     add( inLabel );
     add( outLabel );
     add( inCel );
     add( outFahr );

     setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  // Die Applikation
  public int convert( int C )
  {
    return (C*9/5) + 32;
  }

  public void actionPerformed( ActionEvent evt)
  {
	  String userIn = inCel.getText() ;

	 
	    try
	    {
	      celsTemp = Integer.parseInt( userIn ) ;
	      fahrTemp = convert( celsTemp ) ;
	      outFahr.setText( fahrTemp+"" );
	    }

	    catch ( Exception ex )
	    {
	      outFahr.setText( "Re-enter F" );
	    }
	    repaint();
  }

  public static void main ( String[] args )
  {
	  TemperaturKonverter   fahr  = new TemperaturKonverter( "F to C" ) ;

    fahr.setSize( 200, 150 );
    fahr.setVisible( true );
  }

}