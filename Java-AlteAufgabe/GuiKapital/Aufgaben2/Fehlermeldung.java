package Aufgaben2;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class Fehlermeldung extends JFrame implements ActionListener
{
	final String gWort = "walid";
	int versuch = 1;

	JLabel inLabel     = new JLabel( "Geben Sie das geheimese Wort ein:  " ) ;
	   JTextField inText  = new JTextField( 15 );

	   JLabel outLabel    = new JLabel( "Das Ergebniss: " ) ;
	   JTextField outText = new JTextField( 15 );
   

      public Fehlermeldung( String titel )      // Konstruktor
      {
         super( titel );
         setLayout( new FlowLayout() );
         add( inLabel  ) ;
         add( inText   ) ;
         add( outLabel ) ;
         add( outText  ) ;
         
         //outText.setEditable(false);
         inText.setActionCommand("intext");
         outText.setActionCommand("outtext");
         
         inText.addActionListener( this );
         outText.addActionListener(this);
         
         setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      
      
      }
      
      

     public void actionPerformed( ActionEvent evt)
     {
    	 String eWort = inText.getText();
    	 
    	if (evt.getActionCommand().equals("outtext")) 
    		outText.setText("Geben Sie Text im oberen Feld ein!");

    	
    	
 	       
    	else if (versuch <3) 
 	       {
    		versuch =versuch + 1;
 	       	if (eWort.equals(gWort)) 
 	    
 	       			outText.setText("korrekt");
 	       	
 	       		else 
 	       			outText.setText("falsch");
 	       }
        
        else 
        	System.exit(0);       	
 	       	repaint();
    	}
     

     public static void main ( String[] args )
     {
   	  Fehlermeldung echo  = new Fehlermeldung( "Wiederholer" ) ;

      echo.setSize( 300, 100 );
      echo.setVisible( true );
     }
   }
