package KapitalBeispiele;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ZweiButtons extends JFrame implements ActionListener
{
  JButton rotButton ;
  JButton gruenButton ;

  // Konstruktor für ZweiButtons
  public ZweiButtons(String title)
  {
    super( title );

    rotButton = new JButton("Rot");
    gruenButton = new JButton("Grün");
    rotButton.setActionCommand( "rot" );   // Befehl setzen
    gruenButton.setActionCommand( "gruen" ); // Befehl setzen

    // den Frame als Listener
    // für beide Buttons registrieren
    rotButton.addActionListener( this );
    gruenButton.addActionListener( this );

    setLayout( new FlowLayout() );
    add( rotButton );
    add( gruenButton );

    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  public void actionPerformed( ActionEvent evt)
  {
    // überprüfen, welcher Befehlsstring gesendet wurde
    if ( evt.getActionCommand().equals( "rot" ) )
      getContentPane().setBackground(  Color.red  ) ;
    else
      getContentPane().setBackground( Color.green ) ;

    repaint();
  }

  public static void main ( String[] args )
  {
    ZweiButtons demo  = new ZweiButtons( "Klicken Sie auf einen Button" ) ;

    demo.setSize( 200, 150 );
    demo.setVisible( true );
  }
}