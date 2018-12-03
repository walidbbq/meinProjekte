package KapitalBeispiele;

import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;

public class idealWeight extends JFrame
{
  JRadioButton genderM, genderF;
  ButtonGroup  genderGroup;
  JPanel       genderPanel;

  JRadioButton heightA, heightB, heightC, heightD, heightE;
  ButtonGroup  heightGroup;
  JPanel       heightPanel;

  JTextField   resultText;
  JLabel       resultLabl;
  JPanel       resultPanel;

  public idealWeight()
  {
    setTitle( "Your Ideal Weight" );
    setDefaultCloseOperation( EXIT_ON_CLOSE );

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
    heightA = new JRadioButton("60 to 64 inches", true );
    heightB = new JRadioButton("64 to 68 inches", false );
    heightC = new JRadioButton("68 to 72 inches", false );
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
    resultLabl  = new JLabel("Ideal Weight");
    resultPanel = new JPanel();
    resultPanel.add( resultLabl );
    resultPanel.add( resultText );

    // Frame: verwendet den Standard Layoutmanager
    add( genderPanel, BorderLayout.WEST );
    add( heightPanel, BorderLayout.EAST );
    add( resultPanel, BorderLayout.SOUTH  );

  }

  public static void main ( String[] args )
  {
    idealWeight weightApp  = new idealWeight() ;
    weightApp.setSize( 250, 225 );
    weightApp.setResizable( false );
    weightApp.setVisible( true );
  }
}