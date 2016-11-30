package net.myinfosys.desembertraining.swing.text;

import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TextTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("JText");
		frame.setSize(new Dimension(700,500));
		frame.setLocationRelativeTo(null);
		ImageIcon image = new ImageIcon("logo.jpg");
		frame.setIconImage(image.getImage());
		
		PanelText panel = new PanelText();
		frame.add(panel);
		
		frame.setVisible(true);
		
	}

}
