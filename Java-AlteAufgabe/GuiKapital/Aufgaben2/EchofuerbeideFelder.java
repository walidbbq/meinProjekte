package Aufgaben2;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class EchofuerbeideFelder extends JFrame implements ActionListener
{

	JLabel inLabel     = new JLabel( "Geben Sie das geheimese Wort ein:  " ) ;
	   JTextField inText  = new JTextField( 15 );

	   JLabel outLabel    = new JLabel( "Das Ergebniss: " ) ;
	   JTextField outText = new JTextField( 15 );
   

      public EchofuerbeideFelder( String titel )      // Konstruktor
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
    	 
    	 if (evt.getActionCommand().equals("intext"))
    		 {
//    		 inText.getText();
    	     outText.setText(inText.getText());
    		 }
    	 
    	     else if (evt.getActionCommand().equals("outtext"))
//    	    	 outText.getText();
    	 inText.setText(outText.getText());
    	 
    	    	 
     }

   
     

     public static void main ( String[] args )
     {
    	 EchofuerbeideFelder echo  = new EchofuerbeideFelder( "Wiederholer" ) ;

       echo.setSize( 400, 100 );
       echo.setVisible( true );
     }
   }
