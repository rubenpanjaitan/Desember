package net.myinfosys.desembertraining.swing.frame;

import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class FormTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		
		//add panel to frame
		Form form = new Form();
		frame.add(form);
		
		//visible frame
		frame.setVisible(true);
		
	}	

}
