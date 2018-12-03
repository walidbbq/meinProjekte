package KapitalBeispiele;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonFrame2 extends JFrame implements ActionListener
{
  JButton bChange ; // Referenz auf ein Button Objekt

  // Konstruktor von ButtonFrame2
  ButtonFrame2(String title)
  {
    super( title );                   // den JFrame Konstruktor aufrufen
    setLayout( new FlowLayout() );    // den Layoutmanager setzen

    // construct a Button
    bChange = new JButton("Color ändern !");

    // das ButtonFrame2-Objekt als Listener für den JButton registrieren
    bChange.addActionListener( this );

    add( bChange );                   // dem JFrame den Button hinzufügen
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  public void actionPerformed( ActionEvent evt)
  {
    getContentPane().setBackground( Color.blue );     // den Hintergrund des Frames ändern
    repaint();  // das System aufforden den Bildschirm zu zeichnen.
  }
}




public class EInEventEinesButtuonHinzufuegen {
	
	
	public static void main(String[] args) {

		ButtonFrame2 frm2 = new ButtonFrame2 ("Button Demo2");
		frm2.setSize(200,100);
		frm2.setVisible(true);
	}

}
