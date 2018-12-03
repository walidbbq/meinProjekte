package Aufgaben2;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ratespiel extends JFrame implements ActionListener
{
	
	final String gWort = "walid";
	int versuch = 0;

	JLabel inLabel     = new JLabel( "Geben Sie das geheimese Wort ein:  " ) ;
   JTextField inText  = new JTextField( 15 );

   JLabel outLabel    = new JLabel( "Das Ergebniss: " ) ;
   JTextField outText = new JTextField( 15 );
   

   public Ratespiel( String titel )      // Konstruktor
   {
      super( titel );
      setLayout( new FlowLayout() );
      add( inLabel  ) ;
      add( inText   ) ;
      add( outLabel ) ;
      add( outText  ) ;
      
      outText.setEditable(false);
      inText.addActionListener( this );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

  public void actionPerformed( ActionEvent evt)
  {

    String eWort = inText.getText();
    
    
    versuch =versuch + 1;
    
    if (versuch <3) 
    {
    	if (eWort.equals(gWort)) 
 
    			outText.setText("korrekt");
    	
    		else 
    			outText.setText("falsch");
    }
    
    else
    	System.exit(0);
    	
   // outText.setText( name );
    repaint();
  }

  public static void main ( String[] args )
  {
	  Ratespiel echo  = new Ratespiel( "Wiederholer" ) ;

    echo.setSize( 400, 100 );
    echo.setVisible( true );
  }
}
