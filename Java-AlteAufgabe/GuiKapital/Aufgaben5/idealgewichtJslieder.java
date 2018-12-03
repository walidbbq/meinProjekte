package Aufgaben5;

import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.* ;

public class idealgewichtJslieder extends JFrame implements ChangeListener , ActionListener {

	idealgewichtJslieder tst;
	
	JRadioButton male, female;
	ButtonGroup genderGroup;
	
	
	
	JSlider Jheight;
	JTextField txtidealWeight;
	double idealWeight=0;
	double GetValue=58*58;
	
	double W=28;
	int wF=30;
	int wM=28;

	public idealgewichtJslieder()
	{
		
		setTitle(" Your ideal Weight ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		male = new JRadioButton ("Male", true);
		female = new JRadioButton ("Female", false);
		
		genderGroup = new ButtonGroup();
		genderGroup.add(male); genderGroup.add(female);
		
		
		JLabel genderLabel = new JLabel("Your Gender");
		JPanel genderPanel = new JPanel();
		genderPanel.setLayout( new BoxLayout( genderPanel, BoxLayout.Y_AXIS ) );
		genderPanel.add(genderLabel);
	    genderLabel.add( Box.createRigidArea( new Dimension(1,8) ) );
		genderPanel.add(male);
		genderPanel.add(female);
		
		
		Jheight = new JSlider(JSlider.VERTICAL, 40 , 80 , 58 ) ;
		Jheight.setMajorTickSpacing(10);
		Jheight.setMinorTickSpacing(1);
		Jheight.setPaintTicks(true);
		Jheight.setPaintLabels(true);
		Jheight.setPreferredSize(new Dimension(50,300));
		Jheight.addChangeListener(this);
		Jheight.setName("Jheight");
		
		JLabel JheightLabel = new JLabel("Your Height");
		JPanel JheightPanel = new JPanel();
		JheightPanel.setLayout( new BoxLayout( JheightPanel, BoxLayout.Y_AXIS ) );
		JheightPanel.add(JheightLabel);
		JheightPanel.add(Jheight);
		
		
		txtidealWeight = new JTextField (4);
		txtidealWeight.setText("" + 120.0);
		JLabel idealWeightLabel = new JLabel ("Ideal Weight");
		JPanel idealWeightPanel = new JPanel ();
		idealWeightPanel.add(idealWeightLabel);
		idealWeightPanel.add(txtidealWeight);
		
		male.addActionListener(this);
		female.addActionListener(this);
		
		
		male.setActionCommand("m");
		female.setActionCommand("f");
		
//		male.addChangeListener(this);
//		female.addChangeListener(this);
//		
//		male.setName("m");
//		female.setName("f");

		
		add(genderPanel,BorderLayout.WEST);
		add(JheightPanel, BorderLayout.EAST);
		add(idealWeightPanel, BorderLayout.SOUTH);
		
	
	}
	

	
	public void actionPerformed( ActionEvent evt)
	{
			if (evt.getActionCommand().equals("m") )
			W=wM;
		
			if (evt.getActionCommand().equals("f") )
//			txtidealWeight.setText("" + 58*58/30);
			W=wF;

			idealWeight= Math.round(GetValue /W);
			txtidealWeight.setText(""+idealWeight);
	}

	
	public void stateChanged (ChangeEvent evt) 
	{
		
		JSlider source;
	    source = (JSlider)evt.getSource();	    
	  
	    GetValue=source.getValue() *source.getValue();
	    
	    idealWeight= Math.round(GetValue /W);
		txtidealWeight.setText(""+idealWeight);	
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		idealgewichtJslieder test = new idealgewichtJslieder();
		test.setSize( 200, 350);
	    test.setResizable( false );
	    test.setVisible( true );
	}

	

}
