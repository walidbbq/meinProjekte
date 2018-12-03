package Aufgaben1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Zahlenschloss extends JFrame implements ActionListener {
	
	int versuch;
	String buttonIn ="";
	final String CODE= "735";

	JButton B0;
	JButton B1;
	JButton B2;
	JButton B3;
	JButton B4;		
	JButton B5;
	JButton B6;
	JButton B7;
	JButton B8;
	JButton B9;

	public Zahlenschloss (String title)
	{
		super(title);
		B0= new JButton ("Button 0");
		B1= new JButton ("Button 1");
		B2= new JButton ("Button 2");
		B3= new JButton ("Button 3");
		B4= new JButton ("Button 4");
		B5= new JButton ("Button 5");
		B6= new JButton ("Button 6");
		B7= new JButton ("Button 7");
		B8= new JButton ("Button 8");
		B9= new JButton ("Button 9");

		
		B0.setActionCommand("0");		
		B1.setActionCommand("1");
		B2.setActionCommand("2");
		B3.setActionCommand("3");
		B4.setActionCommand("4");		
		B5.setActionCommand("5");
		B6.setActionCommand("6");
		B7.setActionCommand("7");
		B8.setActionCommand("8");
		B9.setActionCommand("9");

		B0.addActionListener(this);
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
		B5.addActionListener(this);
		B6.addActionListener(this);
		B7.addActionListener(this);
		B8.addActionListener(this);
		B9.addActionListener(this);

		
		 setLayout( new FlowLayout() );
		 add(B0);
		 add(B1);
		 add(B2);
		 add(B3);
		 add(B4);
		 add(B5);
		 add(B6);
		 add(B7);
		 add(B8);
		 add(B9);

		 getContentPane().setBackground(Color.white);
		 
		 setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		
	}
		
		public void actionPerformed (ActionEvent evt) 
		{
			versuch = versuch + 1;
		  	if ( versuch <= 3 )
		  	{
		  		buttonIn = buttonIn + evt.getActionCommand();
		  		System.out.println( buttonIn ); // Teststatement
		  	}

		  	if( versuch == 3 && buttonIn.equals( CODE ) )
		    	System.exit(0);

		  	if( versuch == 3 && !buttonIn.equals( CODE ) )
		    	getContentPane().setBackground(Color.red
		    		);

		    repaint();
		}
		
		public static void main(String[] args) {

			Zahlenschloss test = new Zahlenschloss ("irgendwas");
			test.setSize(200,100);
			test.setVisible(true);
			
		}

	}