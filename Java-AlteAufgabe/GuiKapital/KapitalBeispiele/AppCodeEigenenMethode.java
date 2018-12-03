package KapitalBeispiele;

//public class AppCodeEigenenMethode {

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AppCodeEigenenMethode extends JFrame implements ActionListener
{

   JLabel inLabel     = new JLabel( "Geben Sie Ihren Namen ein:  " ) ;
   JTextField inText  = new JTextField( 15 );

   JLabel outLabel    = new JLabel( "Hier kommt dann Ihr Name:" ) ;
   JTextField outText = new JTextField( 15 );

   public AppCodeEigenenMethode( String titel)      // Konstruktor
   {
      super( titel );
      setLayout( new FlowLayout() );
      add( inLabel  ) ;
      add( inText   ) ;
      add( outLabel ) ;
      add( outText  ) ;

      inText.addActionListener( this );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

  // Der Applikationscode.
  void copyText()
  {
    String name = inText.getText();
    outText.setText( name );
  }

  public void actionPerformed( ActionEvent evt)
  {
    copyText();
    repaint();
  }

  public static void main ( String[] args )
  {
	AppCodeEigenenMethode echo  = new AppCodeEigenenMethode( "Wiederholer" ) ;
    echo.setSize( 400, 100 );
    echo.setVisible( true );
  }
}