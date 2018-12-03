package Aufgaben1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;



public class DreiButtonMonte extends JFrame implements ActionListener
{
JButton B1;
JButton B2;
JButton B3;	

public DreiButtonMonte (String title)
{
	super(title);
	B1= new JButton ("Button 1");
	B2= new JButton ("Button 2");
	B3= new JButton ("Button 3");
	
	B1.setActionCommand("Button 1");
	B2.setActionCommand("Button 2");
	B3.setActionCommand("Button 3");
	
	B1.addActionListener(this);
	B2.addActionListener(this);
	B3.addActionListener(this);
	
	 setLayout( new FlowLayout() );
	 add(B1);
	 add(B2);
	 add(B3);
	 
	 setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	
}
	
	public void actionPerformed (ActionEvent evt) 
	{
		 Random rand = new Random ();
		 int value= rand.nextInt(3);
		 
		 if (value == 0) {
			 getContentPane().setBackground(  Color.green  ) ;
		 //System.out.println(value);
		 }
		 else 
			 System.exit(0);
		
	}
	
	public static void main(String[] args) {

		DreiButtonMonte test = new DreiButtonMonte ("irgendwas");
		test.setSize(200,100);
		test.setVisible(true);
		
	}

}




//if (evt.getActionCommand().equals("Button 1") )
//System.exit( 0 );
//
//if (evt.getActionCommand().equals("Button 2") )
//System.exit(0);
//
//if (evt.getActionCommand().equals("Button 3") )
//	 value=rand.nextInt(3);
//System.out.println(value);