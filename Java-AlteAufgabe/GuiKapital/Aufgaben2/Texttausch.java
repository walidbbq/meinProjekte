package Aufgaben2;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Texttausch extends JFrame implements ActionListener
{

	JButton ausTausch = new JButton();
	
   JLabel inLabel     = new JLabel( "ausgetauschte Texte:  " ) ;
   JTextField inText  = new JTextField( 15 );

   JLabel outLabel    = new JLabel( "ausgetauschte Texte:  " ) ;
   JTextField outText = new JTextField( 15 );
   
   
   

   public Texttausch( String titel )      // Konstruktor
   {
      super( titel );
      setLayout( new FlowLayout() ); 
      add( ausTausch );
      add( inLabel  ) ;
      add( inText   ) ;
      add( outLabel ) ;
      add( outText  ) ;
     
      
      inText.addActionListener( this );
      outText.addActionListener(this);
      ausTausch.addActionListener(this);
      
      ausTausch.setActionCommand("ancklick");
      
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

  public void actionPerformed( ActionEvent evt)
  {
	  
	  String tempIn ="", tempOut="";
	  
	  
	  if (evt.getActionCommand().equals("ancklick"))
		  
		tempIn= inText.getText() ;
	  	tempOut=outText.getText();
		  
		  inText.setText( tempOut );
		  outText.setText( tempIn );

    
  }

  public static void main ( String[] args )
  {
	  Texttausch echo  = new Texttausch( "Wiederholer" ) ;

    echo.setSize( 400, 100 );
    echo.setVisible( true );
  }
}
