package KapitalBeispiele;
import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;

//public class dreiJPanelsEbene {


public class dreiJPanelsEbene extends JFrame implements ActionListener
{
  JLabel     lData1  = new JLabel("Monday");
  JTextField txData1 = new JTextField( 7 );
  JPanel     Panel1  = new JPanel();

  JLabel     lData2  = new JLabel("Tuesday");
  JTextField txData2 = new JTextField( 7 );
  JPanel     Panel2  = new JPanel();

  JLabel     lData3  = new JLabel("Wednesday");
  JTextField txData3 = new JTextField( 7 );
  JPanel     Panel3  = new JPanel();

  JLabel     lData4  = new JLabel("Thursday");
  JTextField txData4 = new JTextField( 7 );
  JPanel     Panel4  = new JPanel();

  JLabel     lData5  = new JLabel("Friday");
  JTextField txData5 = new JTextField( 7 );
  JPanel     Panel5  = new JPanel();

  JLabel     lData6  = new JLabel("Saturday");
  JTextField txData6 = new JTextField( 7 );
  JPanel     Panel6  = new JPanel();

  JLabel     lData7  = new JLabel("Sunday");
  JTextField txData7 = new JTextField( 7 );
  JPanel     Panel7  = new JPanel();

  JPanel     dataPanel = new JPanel();

  JButton    butMorn = new JButton("Morning");
  JButton    butNoon = new JButton("Noon");
  JButton    butNite = new JButton("Night");

  JPanel     MTWPanel  = new JPanel();
  JPanel     RFSPanel  = new JPanel();
  JPanel     SunPanel  = new JPanel();
  JPanel     butPanel  = new JPanel();

  public dreiJPanelsEbene()
  {
    setTitle( "Morning Noon Night" );

    Panel1.add( lData1 ); Panel1.add( txData1 );
    Panel2.add( lData2 ); Panel2.add( txData2 );
    Panel3.add( lData3 ); Panel3.add( txData3 );
    Panel4.add( lData4 ); Panel4.add( txData4 );
    Panel5.add( lData5 ); Panel5.add( txData5 );
    Panel6.add( lData6 ); Panel6.add( txData6 );
    Panel7.add( lData7 ); Panel7.add( txData7 );

    MTWPanel.add( Panel1 );
    MTWPanel.add( Panel2 );
    MTWPanel.add( Panel3 );

    RFSPanel.add( Panel4 );
    RFSPanel.add( Panel5 );
    RFSPanel.add( Panel6 );

    SunPanel.add( Panel7 );

    butPanel.add( butMorn );
    butPanel.add( butNoon );
    butPanel.add( butNite );

    dataPanel.setLayout( new BoxLayout( dataPanel, BoxLayout.Y_AXIS ) );
    dataPanel.add( MTWPanel );
    dataPanel.add( RFSPanel );
    dataPanel.add( SunPanel );

    setLayout( new FlowLayout()  );
    add( dataPanel );
    add( butPanel );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

  }

  public void actionPerformed( ActionEvent evt)
  {
    repaint();
  }

  public static void main ( String[] args )
  {
	  dreiJPanelsEbene mnn  = new dreiJPanelsEbene() ;

    mnn.setSize( 500, 225 );
    mnn.setResizable( false );
    mnn.setVisible( true );
  }
}