package net.myinfosys.desembertraining.swing.button;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("JButton");
		frame.setSize(700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		//get image icon
		ImageIcon image = new ImageIcon("logo.jpg");
		frame.setIconImage(image.getImage());
		
		
		Panel panel = new Panel();
		frame.setJMenuBar(panel.menuBar);
		frame.add(panel);
		frame.setVisible(true);
	}

}
