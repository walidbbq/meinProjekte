package Aufgaben3;

//public class FettKalkulatorMitHinweis {

import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;


public class FettKalkulatorMitHinweis extends JFrame implements ActionListener
{
  JLabel heading   = new JLabel("Percent of Calories from Fat");
  JLabel fatLabel  = new JLabel("Enter grams of fat:   ");
  JLabel calLabel  = new JLabel("Enter total calories: ");
  JLabel perLabel  = new JLabel("Percent calories from fat: ");
  JLabel fetkalLabel   =  new JLabel ("Hinweis: ");

  JTextField inFat  = new JTextField( 7 );
  JTextField inCal  = new JTextField( 7 );
  JTextField outPer = new JTextField( 7 );
  JTextField hinweis = new JTextField( 12 );

  JPanel headPanel = new JPanel ();
  JPanel fatPanel = new JPanel ();
  JPanel calPanel = new JPanel ();
  JPanel perPanel = new JPanel ();
  JPanel hinPanel = new JPanel ();
  JPanel butPanel = new JPanel ();
  
  JButton    doit   = new JButton("\t Do It!	" );

  double calories;  // Input: Gesamtkalorien pro Packung
  double fatGrams;  // Input: Gramm Fett pro Packung
  double percent;   // Ergebnis in Prozent

 
  public FettKalkulatorMitHinweis()
  {
    setTitle( "Calories from Fat" );
    setLayout( new FlowLayout() );

    // den Panels Komponenten hinzufügen
    headPanel.add(heading);
    fatPanel.add(fatLabel);
    fatPanel.add(inFat);
    calPanel.add(calLabel);
    calPanel.add(inCal);
    perPanel.add(perLabel);
    perPanel.add(outPer);
    hinPanel.add(fetkalLabel);
    hinPanel.add(hinweis);
    butPanel.add(doit);
    
    // dem Frame Panels hinzufügen
    add(headPanel);
    add(fatPanel);
    add(calPanel);
    add(perPanel);
    add(hinPanel);
    add(butPanel);
    
    hinweis.setEditable(false);
    outPer.setEditable( false );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    doit.addActionListener( this );

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
    	
    if (percent <= 30)
    	hinweis.setText("Fettanteil OK");
    else 
    	hinweis.setText("Zu viele Fettkalorien!");
    
}
  
  
  
    


  public static void main ( String[] args )
  {
	  FettKalkulatorMitHinweis fatApp  = new FettKalkulatorMitHinweis() ;
    fatApp.setSize( 300, 225 );
    fatApp.setResizable(false);
    fatApp.setVisible( true );
  }
}