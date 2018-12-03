package KapitalBeispiele;


import java.awt.*;
import javax.swing.*;



class ButtonFrame extends JFrame
{
  JButton bChange ; // Referenz auf ein Button-Objekt

  // Konstruktor für ButtonFrame

  ButtonFrame(String title)
  {
    super( title );                     // den JFrame Konstruktor aufrufen
    setLayout( new FlowLayout() );      // den Layoutmanager setzen

    bChange = new JButton("Klick mich!"); // einen JButton konstruieren
    add( bChange );                     // dem JFrame den Button hinzufügen

    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }
}

public class ButtonHinzufuegen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ButtonFrame frm = new ButtonFrame("Button Demo ");
		frm.setSize(150,75);
		frm.setVisible(true);
	
		

	}

}
