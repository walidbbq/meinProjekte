package Aufgaben1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Farbkreis extends JFrame implements ActionListener 

{
JButton Farbkreis;
	
	public Farbkreis (String title )
	{
		super(title);

		Farbkreis = new JButton("Farbkreis");
		Farbkreis.addActionListener(this);
		
		getContentPane().setBackground(  Color.red);


		setLayout( new FlowLayout());
		add( Farbkreis );
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	
	public void actionPerformed( ActionEvent evt)
	{
		
		
		 Color farbe = getContentPane().getBackground();
		 
		 if (farbe.equals(Color.red))
			 getContentPane().setBackground(Color.green);
		 
		 if (farbe.equals(Color.green))
			 getContentPane().setBackground(Color.blue);
		 
		 if (farbe.equals(Color.blue))
			 getContentPane().setBackground(Color.gray);
		 
		 if (farbe.equals(Color.gray))
			 getContentPane().setBackground(Color.red);
		 
//		 repaint();

		}

	public static void main(String[] args) {
		
		Farbkreis fk = new Farbkreis ("Klicken Sie auf dem Button! ");
		fk.setSize( 200, 150 );
	    fk.setVisible( true );


	}

}
