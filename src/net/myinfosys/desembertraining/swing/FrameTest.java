package net.myinfosys.desembertraining.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTest {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create frame with name Frame
		JFrame frame = new JFrame("HelloWorldSwing");
		//add close widget
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set size frame
		frame.setSize(500, 500);
		//set location on center
		frame.setLocationRelativeTo(null);
	
		//create component
		
		//create button
		JLabel label = new JLabel("Hello World");
		JButton button = new JButton("Save");
		//add component to frame
		frame.add(button);
		frame.add(label);
		
		//run the frame
		
		frame.setVisible(true);
	}

}
