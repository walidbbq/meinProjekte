package Aufgaben3;

//public class ZweiWegeKonverter {

import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;

public class ZweiWegeKonverter extends JFrame implements ActionListener
{
  JLabel heading  = new JLabel("Convert Fahrenheit to Celsius oder umgekahrt ");
  JLabel ceLabel  = new JLabel("Celsius    ");
  JLabel fahrLabel = new JLabel("Fahrenheit	 ");

  JTextField Cel = new JTextField( 7 );
  JTextField Fahr = new JTextField( 7 );
  
  JButton inFahr = new JButton ("In Fahrenheit:    ");
  JButton inCel  = new JButton ("In Celsius:    ");
  JButton zuruecksetzen= new JButton ("Zurücksetzung: 	");

  int fahrTemp ;
  int celsTemp ;

  ZweiWegeKonverter( String title )
  {
     super( title );
     setLayout( new FlowLayout() );

     //Cel.addActionListener( this );
     //Fahr.addActionListener( this );
     inFahr.addActionListener(this);
     inCel.addActionListener(this);
     zuruecksetzen.addActionListener(this);
     
     inFahr.setActionCommand("BuInFahr");
     inCel.setActionCommand("BuInCel");
     zuruecksetzen.setActionCommand("zurück");

     add( heading );
     add( ceLabel );
     add( Cel );
     add( fahrLabel );
     add( Fahr );
     add(inFahr);
     add(inCel);
     add(zuruecksetzen);

     pack();
     setVisible(true);
     setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  // Die Applikation
  public int convertC( int C ) // in Fahrenheit umwandeln
  {
    return (C*9/5) + 32;
  }
  
  public int convertF( int F ) // in Celsius umvwandeln
  {
    return ( (F-32) * 5 ) / 9;
  }


  public void actionPerformed( ActionEvent evt)
  {
	  String userIn = Cel.getText() ;  
	  String userIn2 = Fahr.getText();
	  
	  if (evt.getActionCommand().equals("zurück")) {
		  Cel.setText("");
	  	  Fahr.setText("");
	  
	  }
	  
	  else if (evt.getActionCommand().equals("BuInFahr") )
		  try {
			  celsTemp= Integer.parseInt(userIn);
			  fahrTemp=convertC(celsTemp);
			  Fahr.setText(fahrTemp + "");
		  }
	  
	  catch ( Exception ex ) {
		  Cel.setText("Re-enter F");
	  }
		  
	  else 
		  try {
			  fahrTemp=Integer.parseInt(userIn2);
			  celsTemp=convertF(fahrTemp);
			  Cel.setText(celsTemp + "");
		  }
	  
	  catch (Exception ex) 
	  {
		  Fahr.setText ("Re-enter F");
	  }
	  
 }

  public static void main ( String[] args )
  {
	  ZweiWegeKonverter   fahr  = new ZweiWegeKonverter( "F to C" ) ;

//    fahr.setSize( 200, 150 );
//    fahr.setVisible( true );
  }

}