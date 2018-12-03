package KapitalBeispiele;

//public class VerschachtelnePanels {

import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;

public class VerschachtelnePanels extends JFrame
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
  JPanel     pnTop  = new JPanel();
  JPanel     pnBot  = new JPanel();

  public VerschachtelnePanels()
  {
    setTitle( "LayoutEg2" );

    // Label und Text Paare den kleineren Panels hinzufügen
    panel1.add( lData1 ); panel1.add( txData1 );
    panel2.add( lData2 ); panel2.add( txData2 );
    panel3.add( lData3 ); panel3.add( txData3 );
    panel4.add( lData4 ); panel4.add( txData4 );
    panel5.add( lData5 ); panel5.add( txData5 );
    panel6.add( lData6 ); panel6.add( txData6 );

    // die kleineren Panels dem oberen und unteren Panel hinzufügen
    pnTop.add ( panel1 ); pnTop.add( panel2 );
    pnTop.add ( panel3 );

    pnBot.add( panel4); pnBot.add( panel5);
    pnBot.add( panel6);

    // das obere und untere Panel dem Frame hinzufügen
    setLayout( new FlowLayout() );
    add( pnTop  );
    add( pnBot );

    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  public static void main ( String[] args )
  {
	VerschachtelnePanels leg  = new VerschachtelnePanels() ;
    leg.setSize( 525, 150 );
    leg.setVisible( true );
  }
}
