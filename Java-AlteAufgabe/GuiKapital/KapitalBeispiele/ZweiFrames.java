package KapitalBeispiele;

import java.awt.*;
import javax.swing.*;

public class ZweiFrames {

	public static void main(String[] args) {
		
		
		JFrame master = new JFrame ("Klicken Sie, um alles zu beenden! ");
		JFrame temp = new JFrame (" Klicken Sie, um nur diesen Frame zu beenden! ");
		
		master.setVisible(true);
		master.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		master.setSize(400, 300);
		
		temp.setVisible(true);
		temp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		temp.setSize(300, 200);
				
				
	}

}
