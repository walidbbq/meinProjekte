package KapitalBeispiele;

import java.awt.*;
import javax.swing.*;

public class EinKleinesGuiProgrammErweitern {

	public static void main(String[] args) {

		    int breite=200, hoehe=100;
		    JFrame frame = new JFrame("Test Frame Extra");

		    frame.setVisible( true );
		    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		    for ( int extra=0; extra<500; extra+=1 )
		      frame.setSize( breite+extra, hoehe+extra );
		  }
		
	}

