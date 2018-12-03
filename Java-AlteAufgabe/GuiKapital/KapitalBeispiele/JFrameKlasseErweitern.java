package KapitalBeispiele;


import java.awt.*;
import javax.swing.*;

class MeinFrame extends JFrame
{
  JLabel label;

  // Konstruktor
  MeinFrame( String title )
  {
    super( title );                      // den Konstruktor von JFrame aufrufen
    setSize( 150, 100 );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    setLayout( new FlowLayout() );       // den Layoutmanager setzen

    label = new JLabel("Hello Swing!");  // ein JLabel konstruieren
    add( label );                        // das Label dem JFrame hinzufügen
  }

}



public class JFrameKlasseErweitern {

	public static void main(String[] args) {

		MeinFrame frame = new MeinFrame("Hello");
		frame.setVisible(true);
		
	}

}
