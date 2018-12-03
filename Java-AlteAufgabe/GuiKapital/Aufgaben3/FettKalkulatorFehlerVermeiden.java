package Aufgaben3;

//public class FettKalkulatorFehlerVermeidenFehlerVermeiden {

import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;


public class FettKalkulatorFehlerVermeiden extends JFrame implements ActionListener
{
  JLabel heading   = new JLabel("Percent of Calories from Fat");
  JLabel fatLabel  = new JLabel("Enter grams of fat:   ");
  JLabel calLabel  = new JLabel("Enter total calories: ");
  JLabel perLabel  = new JLabel("Percent calories from fat: ");

  JTextField inFat  = new JTextField( 7 );
  JTextField inCal  = new JTextField( 7 );
  JTextField outPer = new JTextField( 7 );

  JButton    doit   = new JButton("Do It!");

  double calories;  // Input: Gesamtkalorien pro Packung
  double fatGrams;  // Input: Gramm Fett pro Packung
  double percent;   // Ergebnis in Prozent

  double fettTemp;
  double kalkTemp;
  double calTemp;
  
  public FettKalkulatorFehlerVermeiden()
  {
    setTitle( "Calories from Fat" );
    setLayout( new FlowLayout() );

    add( heading );
    add( fatLabel );
    add( inFat );
    add( calLabel );
    add( inCal );
    add( perLabel );
    add( outPer );
    outPer.setEditable( false );

    add( doit );
    doit.addActionListener( this );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  // die Applikation
  public void calcPercent( )
  {
    percent = ((fatGrams * 9) / calories) * 100 ;

  }

  public void actionPerformed( ActionEvent evt)
  {
    String userIn ,userIn2;
    userIn    = inFat.getText()  ;    
    userIn2 = inCal.getText();
    
    
    try {
    	fatGrams=Double.parseDouble( userIn );
    	//calories=Double.parseDouble(userIn2);
//    	calcPercent();
//    	outPer.setText(percent + "");
    }

    
    catch ( Exception ex ) 
    {
    	inFat.setText("Re - Enter: ");
    	//inCal.setText("Re - Enter: ");
    }

    
    try {
    	//fatGrams=Double.parseDouble( userIn );
    	calories=Double.parseDouble(userIn2);
//    	outPer.setText(percent + "");
//    	calcPercent();
    }
    
    catch ( Exception ex ) 
    {
//    	inFat.setText("Re - Enter: ");
    	inCal.setText("Re - Enter: ");
    }
    
    if (fatGrams>0 && calories>0)
    	calcPercent();
    	outPer.setText(percent + "");
    
}
  
  
  
    


  public static void main ( String[] args )
  {
	 FettKalkulatorFehlerVermeiden fatApp  = new FettKalkulatorFehlerVermeiden() ;
    fatApp.setSize( 280, 200 );
    fatApp.setVisible( true );
  }
}