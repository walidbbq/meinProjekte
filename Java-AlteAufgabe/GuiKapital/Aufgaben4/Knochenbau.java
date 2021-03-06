package Aufgaben4;

import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;

public class Knochenbau extends JFrame implements ActionListener
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
	
	double aus;
	double sch= 0.95;
	double nor= 1;
	double st= 1.05;
	
	
	
  JRadioButton genderM, genderF;
  ButtonGroup  genderGroup;
  Box          genderBox;

  JRadioButton heightA, heightB, heightC, heightD, heightE;
  ButtonGroup  heightGroup;
  Box          heightBox;

  JRadioButton schmal , normal , stark;
  ButtonGroup  knochenbauGroup;
  Box 		   knochenbauBox; 
  
  Box          buttonBox;

  JTextField   resultText;
  JLabel       resultLabl;
  JPanel       resultPanel;

  public Knochenbau()
  {
    setTitle( "Your Ideal Weight" );
    setDefaultCloseOperation( EXIT_ON_CLOSE );

    // Gender-Gruppe
    genderM = new JRadioButton("Male", true );
    genderF = new JRadioButton("Female", false );
    genderGroup = new ButtonGroup();
    genderGroup.add( genderM );
    genderGroup.add( genderF );

    genderBox = new Box( BoxLayout.Y_AXIS );
    genderBox.add( new JLabel("Your Gender") );
    genderBox.add( Box.createRigidArea( new Dimension(1,8) ) );
    genderBox.add( genderM );
    genderBox.add( genderF );
    genderBox.add( Box.createRigidArea( new Dimension(1, 73) ) );

    // Height-Gruppe
    heightA = new JRadioButton("60 to 64 inches", false  );
    heightB = new JRadioButton("64 to 68 inches", false );
    heightC = new JRadioButton("68 to 72 inches", true );
    heightD = new JRadioButton("72 to 76 inches", false );
    heightE = new JRadioButton("76 to 80 inches", false );

    heightGroup = new ButtonGroup();
    heightGroup.add( heightA ); heightGroup.add( heightB );
    heightGroup.add( heightC ); heightGroup.add( heightD );
    heightGroup.add( heightE );

    heightBox = new Box(BoxLayout.Y_AXIS);
    heightBox.add( new JLabel("Your Height") );
    heightBox.add( Box.createRigidArea( new Dimension(1, 8) ) );
    heightBox.add( heightA ); heightBox.add( heightB );
    heightBox.add( heightC ); heightBox.add( heightD );
    heightBox.add( heightE );
    
    //Knochenbau Gruppe
    schmal = new JRadioButton("schmal", false);
    normal= new JRadioButton("normal", true);
    stark= new JRadioButton("stark", false);
    
    knochenbauGroup = new ButtonGroup();
    knochenbauGroup.add(schmal); knochenbauGroup.add(normal);
    knochenbauGroup.add(stark);
    
    knochenbauBox = new Box(BoxLayout.Y_AXIS);
    knochenbauBox.add(new JLabel("Knochenbau") );
    knochenbauBox.add(Box.createRigidArea(new Dimension(1,8)) );
    knochenbauBox.add(schmal); knochenbauBox.add(normal);
    knochenbauBox.add(stark);
    
    
    // Button-Box
    buttonBox = new Box( BoxLayout.X_AXIS );
    buttonBox.add( Box.createHorizontalGlue() );
    buttonBox.add( genderBox );
    buttonBox.add( Box.createHorizontalGlue() );
    buttonBox.add( heightBox );
    buttonBox.add( Box.createHorizontalGlue() );
    buttonBox.add( knochenbauBox );
    buttonBox.add(Box.createHorizontalGlue());



    // Result-Panel
    resultText  = new JTextField(7);
    resultText.setText("175");
    resultText.setEditable( false );
    resultLabl  = new JLabel("Ideal Weight");
    resultPanel = new JPanel();
    resultPanel.add( resultLabl );
    resultPanel.add( resultText );

    // Frame
   setLayout( new BoxLayout( getContentPane(), BoxLayout.Y_AXIS ) );
    add( buttonBox );
    add( resultPanel );
    
    genderM.addActionListener(this);
    genderF.addActionListener(this);
    
    heightA.addActionListener(this);
    heightB.addActionListener(this);
    heightC.addActionListener(this);
    heightD.addActionListener(this);
    heightE.addActionListener(this);
    
    schmal.addActionListener(this);
    normal.addActionListener(this);
    stark.addActionListener(this);
    
    genderM.setActionCommand("Mann");
    genderF.setActionCommand("Frau");
    
    heightA.setActionCommand("a");
    heightB.setActionCommand("b");
    heightC.setActionCommand("c");
    heightD.setActionCommand("d");
    heightE.setActionCommand("e");
    
    schmal.setActionCommand ("s");
    normal.setActionCommand("n");
    stark.setActionCommand("st");
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
	  
	  if(evt.getActionCommand().equals("s") )
		  aus=sch;
	  
	  if (evt.getActionCommand().equals("n") )
		  aus=nor;
	  
	  if (evt.getActionCommand().equals("st") )
		  aus=st;
		  
	  
	  idealGewicht=Math.round( (height/W) * aus);
	  resultText.setText(" " +idealGewicht);
	  
	  System.out.println((height/W) * aus);
	  
	}

  public static void main ( String[] args )
  {
    Knochenbau weightApp  = new Knochenbau() ;
    weightApp.setSize( 300, 225 );
    weightApp.setResizable( false );
    weightApp.setVisible( true );
  }
}
