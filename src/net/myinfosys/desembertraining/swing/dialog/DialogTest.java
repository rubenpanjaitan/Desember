package net.myinfosys.desembertraining.swing.dialog;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DialogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JFrame frame = new JFrame("JDialog");
		frame.setSize(new Dimension(700,400));
		frame.setLocationRelativeTo(null);
		
		//image icon
		ImageIcon image = new ImageIcon("logo.jpg");
		frame.setIconImage(image.getImage());
		//add panel
		PanelDialog panel = new PanelDialog();
		frame.add(panel);
		
		//show
		frame.setVisible(true);
		
	}

}
