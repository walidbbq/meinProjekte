package KapitalBeispiele;

import java.awt.FlowLayout;

import javax.swing.*;


//public class vertikalPanels {

public class vertikalPanels extends JFrame
{
  // kleine Panels erzeugen, die Paare von Labels und Textfeldern enthalten
  JLabel     lData1  = new JLabel("Data Item 1");
  JTextField txData1 = new JTextField( 7 );
  JPanel     panel1  = new JPanel();

  JLabel     lData2  = new JLabel("Data Item 2");
  JTextField txData2 = new JTextField( 7 );
  JPanel     panel2  = new JPanel();

  JLabel     lData3  = new JLabel("Data Item 3");
  JTextField txData3 = new JTextField( 7 );
  JPanel     panel3  = new JPanel();

  JLabel     lData4  = new JLabel("Data Item 4");
  JTextField txData4 = new JTextField( 7 );
  JPanel     panel4  = new JPanel();

  JLabel     lData5  = new JLabel("Data Item 5");
  JTextField txData5 = new JTextField( 7 );
  JPanel     panel5  = new JPanel();

  JLabel     lData6  = new JLabel("Data Item 6");
  JTextField txData6 = new JTextField( 7 );
  JPanel     panel6  = new JPanel();

  // das obere und untere Panel erzeugen, die die kleineren Panels enthalten werden
  JPanel     pnLeft  = new JPanel();
  JPanel     pnRight  = new JPanel();

 

public vertikalPanels()
{
  setTitle( "LayoutEg3 Box Alignment" );

  // Komponenten den kleinen Panels hinzufügen
  panel1.add( lData1 ); panel1.add( txData1 );
  panel2.add( lData2 ); panel2.add( txData2 );
  panel3.add( lData3 ); panel3.add( txData3 );
  panel4.add( lData4 ); panel4.add( txData4 );
  panel5.add( lData5 ); panel5.add( txData5 );
  panel6.add( lData6 ); panel6.add( txData6 );

  // den Layoutmanager für das linke Panel setzen, ihm drei kleine Panels hinzufügen
  pnLeft.setLayout( new BoxLayout( pnLeft, BoxLayout.Y_AXIS ) );
  pnLeft.add ( panel1 ); pnLeft.add( panel2 );
  pnLeft.add ( panel3 );

  // den Layoutmanager für das rechte Panel setzen, ihm drei kleine Panels hinzufügen
  pnRight.setLayout( new BoxLayout( pnRight, BoxLayout.Y_AXIS ) );
  pnRight.add( panel4); pnRight.add( panel5);
  pnRight.add( panel6);

  // das linke und rechte Panel dem Frame hinzufügen
  setLayout( new FlowLayout() );
  add( pnLeft  );
  add( pnRight );

  setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  
}
public static void main ( String[] args )
{
	vertikalPanels leg  = new vertikalPanels() ;
  leg.setSize( 525, 150 );
  leg.setVisible( true );
}
}
