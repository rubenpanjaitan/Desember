package net.myinfosys.desembertraining.swing.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Form extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JTextField tfNama = new JTextField(20);
	private final JTextArea tfAlamat = new JTextArea(3,20);
	private final JButton btnSave = new JButton("Save");
	private final JLabel lbNama = new JLabel("Nama :");
	private final JLabel lbAlamat = new JLabel("Alamat :");
	
	
	
	//constructor
	public Form(){
		initComponents();
		setPreferredSize(new Dimension(500,500));
		setBackground(Color.gray);
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		//set tfName
		GridBagConstraints grid = new GridBagConstraints();
		grid.anchor = GridBagConstraints.WEST;
		grid.insets = new Insets(10, 10, 10, 10);
		//add lbNama to grid
		grid.gridx = 0;
		grid.gridy = 0;
		add(lbNama,grid);
		
		//add tfNama
		grid.gridx = 1;
		add(tfNama,grid);
		
		//add lbAlamat
		grid.gridx = 0;
		grid.gridy = 1;
		add(lbAlamat,grid);
		
		//add tfAlamat
		grid.gridy=1;
		add(tfAlamat,grid);
		
		grid.gridx = 0;
		grid.gridy = 2;
		grid.anchor = grid.CENTER;
		add(btnSave,grid);
		
	}
	

}
