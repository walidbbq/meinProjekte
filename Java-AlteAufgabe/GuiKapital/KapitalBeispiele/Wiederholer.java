package KapitalBeispiele;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Wiederholer extends JFrame implements ActionListener
{

   JLabel inLabel     = new JLabel( "Geben Sie Ihren Namen ein:  " ) ;
   JTextField inText  = new JTextField( 15 );

   JLabel outLabel    = new JLabel( "Hier kommt dann Ihr Name:" ) ;
   JTextField outText = new JTextField( 15 );
   

   public Wiederholer( String titel )      // Konstruktor
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

    String name = inText.getText();
    outText.setText( name );
    repaint();
  }

  public static void main ( String[] args )
  {
    Wiederholer echo  = new Wiederholer( "Wiederholer" ) ;

    echo.setSize( 400, 100 );
    echo.setVisible( true );
  }
}
