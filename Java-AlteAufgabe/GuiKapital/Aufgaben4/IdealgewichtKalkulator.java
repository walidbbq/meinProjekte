package Aufgaben4;

//public class IdealgewichtKalkulator {

import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;

public class IdealgewichtKalkulator extends JFrame implements ActionListener
{
 
	
	double idealGewicht;
	String geschlecht;
	int grosse;
	double height=1;
	int heighta= 62*62;
	int heightb= 66*66;
	int heightc= 70*70;
	int heightd= 74*74;
	int heighte= 78*78;
	int W;
	int wF=30;
	int wM=28;
	
	
	
  JRadioButton genderM, genderF;
  ButtonGroup  genderGroup;
  JPanel       genderPanel;

  JRadioButton heightA, heightB, heightC, heightD, heightE;
  ButtonGroup  heightGroup;
  JPanel       heightPanel;

  JTextField   resultText;
  JLabel       resultLabl;
  JPanel       resultPanel;

  public IdealgewichtKalkulator()
  {
    setTitle( "Your Ideal Weight" );

    // Gender-Gruppe
    genderM = new JRadioButton("Male", true );
    genderF = new JRadioButton("Female", false );
    genderGroup = new ButtonGroup();
    genderGroup.add( genderM );
    genderGroup.add( genderF );
    genderPanel = new JPanel();
    genderPanel.setLayout( new BoxLayout( genderPanel, BoxLayout.Y_AXIS ) );
    genderPanel.add( new JLabel("Your Gender") );
    genderPanel.add( genderM );  genderPanel.add( genderF );
    

    
    // Height-Gruppe
    heightA = new JRadioButton("60 to 64 inches", false );
    heightB = new JRadioButton("64 to 68 inches", false );
    heightC = new JRadioButton("68 to 72 inches", true );
    heightD = new JRadioButton("72 to 76 inches", false );
    heightE = new JRadioButton("76 to 80 inches", false );

    heightGroup = new ButtonGroup();
    heightGroup.add( heightA ); heightGroup.add( heightB );
    heightGroup.add( heightC ); heightGroup.add( heightD );
    heightGroup.add( heightE );

    heightPanel = new JPanel();
    heightPanel.setLayout( new BoxLayout( heightPanel, BoxLayout.Y_AXIS ) );
    heightPanel.add( new JLabel("Your Height") );
    heightPanel.add( heightA ); heightPanel.add( heightB );
    heightPanel.add( heightC ); heightPanel.add( heightD );
    heightPanel.add( heightE );

    // Result-Panel
    resultText  = new JTextField(7);
    resultText.setEditable( false );
    resultText.setText("175");
    resultLabl  = new JLabel("Ideal Weight");
    resultPanel = new JPanel();
    resultPanel.add( resultLabl );
    resultPanel.add( resultText );

    // Frame: verwendet den Standard Layoutmanager
    add( genderPanel, BorderLayout.WEST );
    add( heightPanel, BorderLayout.EAST );
    add( resultPanel, BorderLayout.SOUTH  );
    
    genderM.addActionListener(this);
    genderF.addActionListener(this);
    
    heightA.addActionListener(this);
    heightB.addActionListener(this);
    heightC.addActionListener(this);
    heightD.addActionListener(this);
    heightE.addActionListener(this);
    
    genderM.setActionCommand("Mann");
    genderF.setActionCommand("Frau");
    
    heightA.setActionCommand("a");
    heightB.setActionCommand("b");
    heightC.setActionCommand("c");
    heightD.setActionCommand("d");
    heightE.setActionCommand("e");
    
    setDefaultCloseOperation( EXIT_ON_CLOSE );

  }
  
  
  public void actionPerformed( ActionEvent evt)
  {
	  height=heightc;
	  W=wM;
	  idealGewicht=height/W;
	  
	  if (evt.getActionCommand().equals("a")) 
		  height=heighta;
	  
	  if (evt.getActionCommand().equals("b")) 
		  height=heightb;
		  
	   if (evt.getActionCommand().equals("c"))
		  height=heightc;
	  
	  if (evt.getActionCommand().equals("d"))
		  height=heightd;
	  
	  if (evt.getActionCommand().equals("e"))
		  height=heighte;
	  
	  
	  if (evt.getActionCommand().equals("Mann"))
		  W=wM;
	  
	  if (evt.getActionCommand().equals("Frau"))  
		  W=wF;
	  
	  idealGewicht=(int)height/W;
	  resultText.setText(" " +idealGewicht);
	  
	  System.out.println(height/W);
	  
	}
			 
 

  public static void main ( String[] args )
  {
    IdealgewichtKalkulator weightApp  = new IdealgewichtKalkulator() ;
    weightApp.setSize( 250, 225 );
    weightApp.setResizable( false );
    weightApp.setVisible( true );
  }
}