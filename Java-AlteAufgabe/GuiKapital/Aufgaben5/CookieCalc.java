package Aufgaben5;

import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.* ;

public class CookieCalc extends JFrame implements ChangeListener {
	
	JPanel sliderPanel, txtPanel;
	JSlider hunger, aussehen, aroma;
	TextField txt , txt2;
	 int Value=15;
	
	public  CookieCalc ()
	{
		setTitle("Cookie Calculator");
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		  
		
		
		hunger=new JSlider (JSlider.VERTICAL,0,10,5);
		hunger.add(new JLabel ("Hunger"));
		hunger.setMajorTickSpacing(10);
		hunger.setMinorTickSpacing(1);
		hunger.setPaintTicks(true);
		hunger.setPaintLabels(true);
		hunger.addChangeListener(this);
		hunger.setName("hun");
		
//	    hunger.setPreferredSize( new Dimension(300,50) ) ;
		
		JPanel hunPanel = new JPanel ();
		hunPanel.setLayout( new BoxLayout( hunPanel, BoxLayout.Y_AXIS ) );
		hunPanel.add(new JLabel ("Hunger"));
		hunPanel.add( Box.createRigidArea( new Dimension(1,10) ) );
		hunPanel.add(hunger);
		hunPanel.add( Box.createRigidArea( new Dimension(1, 73) ) );
		
		
		aussehen=new JSlider (JSlider.VERTICAL,0,10,5);
		aussehen.setMajorTickSpacing(10);
		aussehen.setMinorTickSpacing(1);
		aussehen.setPaintTicks(true);
		aussehen.setPaintLabels(true);
		aussehen.addChangeListener(this);
		aussehen.setName("aus");
//		aussehen.setPreferredSize( new Dimension(300,50) ) ;
		
		JPanel ausPanel = new JPanel ();
		ausPanel.setLayout( new BoxLayout( ausPanel, BoxLayout.Y_AXIS ) );
		ausPanel.add(new JLabel ("Aussehen"));
		ausPanel.add( Box.createRigidArea( new Dimension(1,10) ) );
		ausPanel.add(aussehen);
		ausPanel.add( Box.createRigidArea( new Dimension(1, 73) ) );
		

		
		aroma=new JSlider (JSlider.VERTICAL,0,10,5);
		aroma.setMajorTickSpacing(10);
		aroma.setMinorTickSpacing(1);
		aroma.setPaintTicks(true);
		aroma.setPaintLabels(true);
		aroma.addChangeListener(this);
		aroma.setName("aroma");
//		aroma.setPreferredSize( new Dimension(150,50) ) ;
		
		JPanel aromaPanel = new JPanel ();
		aromaPanel.setLayout( new BoxLayout( aromaPanel, BoxLayout.Y_AXIS ) );
		aromaPanel.add(new JLabel ("Aroma"));
		aromaPanel.add( Box.createRigidArea( new Dimension(1,10) ) );
		aromaPanel.add(aroma);
		aromaPanel.add( Box.createRigidArea( new Dimension(1, 73) ) );

		
		
	    Box SliderBox = new Box( BoxLayout.X_AXIS );
	    SliderBox.add (Box.createHorizontalGlue());
	    SliderBox.add(hunPanel);
	    SliderBox.add (Box.createHorizontalGlue());
	    SliderBox.add(ausPanel);
	    SliderBox.add (Box.createHorizontalGlue());
	    SliderBox.add(aromaPanel);
	    SliderBox.add (Box.createHorizontalGlue());

	   
	    


	    
	    
//	    buttonBox = new Box( BoxLayout.X_AXIS );
//	    buttonBox.add( Box.createHorizontalGlue() );
//	    buttonBox.add( genderBox );
//	    buttonBox.add( Box.createHorizontalGlue() );
//	    buttonBox.add( heightBox );
//	    buttonBox.add( Box.createHorizontalGlue() );
//	    buttonBox.add( knochenbauBox );
//	    buttonBox.add(Box.createHorizontalGlue());

		
		txt= new TextField(30);
		txt2=new TextField(30);
		JLabel txtLabel= new JLabel ("Die Summe");
		JLabel txt2Label = new JLabel ("Sie Können ");
		
		
		txtPanel = new JPanel();
		txtPanel.setLayout( new BoxLayout( txtPanel, BoxLayout.X_AXIS ) );
		txtPanel.add(txtLabel); txtPanel.add(txt);
		
		
		JPanel txt2Panel = new JPanel ();
		txt2Panel.setLayout( new BoxLayout( txt2Panel, BoxLayout.X_AXIS ) );
		txtPanel.add(txt2Label);txtPanel.add(txt2);
		
		JPanel textPanel = new JPanel ();
		textPanel.setLayout( new BoxLayout( textPanel, BoxLayout.Y_AXIS ) );
		textPanel.add(txtPanel); textPanel.add(txt2Panel);
	
		
		
		
		JLabel sliderLabel = new JLabel ("Cookie Calc"); 
		
//		sliderPanel = new JPanel();
////		sliderPanel.setLayout( new BoxLayout( sliderPanel, BoxLayout.Y_AXIS ) );
////		sliderPanel.add( Box.createRigidArea( new Dimension(1,8) ) );
//		sliderPanel.add(hunger);
//		sliderPanel.add(aussehen);
//		sliderPanel.add(aroma);
		
//		JPanel SliLabelPanel = new JPanel ();
//		SliLabelPanel.setLayout(new BoxLayout(SliLabelPanel , BoxLayout.Y_AXIS));
//		SliLabelPanel.add(sliderLabel);
//		SliLabelPanel.add( Box.createRigidArea( new Dimension(1,8) ) );
//		SliLabelPanel.add(sliderPanel);

		
//		 setLayout( new FlowLayout() );
//		    add( hunger  );
//		    add( aussehen  );
//		    add( aroma  );
//		    add( txtPanel  );
//		    

//		
//		add(SliderBox, BorderLayout.NORTH);
//		add(txtPanel, BorderLayout.SOUTH);
		
	    setLayout( new BoxLayout( getContentPane(), BoxLayout.Y_AXIS ) );
	    add(SliderBox);
	    add(textPanel);

	}
	
	  
	  public void stateChanged( ChangeEvent evt )
	  {
		  int tempValue=0;
	  	JSlider source;
	    source = (JSlider)evt.getSource();
	    	
	    tempValue= hunger.getValue() + aussehen.getValue() + aroma.getValue();
	    
	    txt.setText("" + tempValue);
	    
	  }
	  
	 public int getValue ()
	 {
		 return Value;
	 }
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		CookieCalc test = new CookieCalc();
		test.setSize(500,500);
		test.setVisible(true);

		System.out.println(test.getValue());
	}
	

}

