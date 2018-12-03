import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NeuKunden extends JFrame implements ActionListener  {

	JLabel kopfLabel = new JLabel ("Erstellung neuers Kundes ");
	JLabel kNameLabel= new JLabel ("die Name eingeben : ");
	JLabel kNrLabel= new JLabel ("IBAN Nummer eingeben: ");
	
	JTextField kName = new JTextField(10);
	JTextField kNr = new JTextField(16);
	
	JButton doitB = new JButton ("Do it !");


	JPanel kopfPanel= new JPanel ();
	JPanel kNamePanel = new JPanel ();
	JPanel kNrPanel = new JPanel ();
	JPanel doitBPanel = new JPanel ();
	
	String kontoInhaber, kontoNummer;
	

	NeuKunden (String kontoInhaber, String kontoNummer)
	{
		this.kontoInhaber=kontoInhaber;
		this.kontoNummer=kontoNummer;
		
		setTitle ("Bannkkonto");
		setLayout( new FlowLayout() );
		
		 // den Panels Komponenten hinzufügen
			kopfPanel.add(kopfLabel);
			kNamePanel.add(kNameLabel);
			kNamePanel.add(kName);
			kNrPanel.add(kNrLabel);
			kNrPanel.add(kNr);
			doitBPanel.add(doitB);
			
			add (kopfPanel);
			add (kNamePanel);
			add (kNrPanel);
			add (doitBPanel);
			
			doitB.addActionListener(this);
			doitB.setActionCommand("do");
			
			
			setSize( 360, 300 );
			setVisible(true);
					
			setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}


	public static void main(String[] args) {

		
		String kontoInhaber = null, kontoNummer = null;
		NeuKunden test = new NeuKunden( kontoInhaber,  kontoNummer);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		DBAbfrage abf = new DBAbfrage ();
		
		// TODO Auto-generated method stub
		if  (!kName.getText().equals("") )
			abf.nueKunde(kName.getText());
		
		if ( !kNr.getText().equals("") )
			abf.aendereIBAN(kNr.getText());
			
//		((evt.getActionCommand().equals("do") && !(kName.getText().equals("") ) && !(kNr.getText().equals("") ) ) )
//		System.out.println(kName.getText());
		
	}

}
