package net.myinfosys.desembertraining.swing.dialog;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.sun.org.apache.bcel.internal.generic.Select;

public class PanelDialog extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1525960987794693943L;
	JButton button;
	JRadioButton rb;

	public PanelDialog() {
		initComponents();

	}

	private void initComponents() {
		// TODO Auto-generated method stub
		// message
		button = new JButton("Message");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showMessage();
			}
		});
		add(button);

		// error
		button = new JButton("Error");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showError();
			}

		});
		add(button);

		// warning
		button = new JButton("Warning");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showWarning();
			}
		});
		add(button);

		// information
		button = new JButton("Information");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showInformation();
			}
		});
		add(button);

		// question
		button = new JButton("Question");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showQuestion();
			}
		});
		add(button);

		button = new JButton("File Chooser");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showFileChooser();
			}
		});
		add(button);

		button = new JButton("Color Chooser");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showColorChooser();
			}
		});
		add(button);

		button = new JButton("Input Dialog");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showInputDialog();
			}
		});
		add(button);
		createButton();
	}

	private void showMessage() {
		JOptionPane.showMessageDialog(this, "This is message", "Message",
				JOptionPane.PLAIN_MESSAGE);
	}

	private void showError() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "This is Error", "Error",
				JOptionPane.ERROR_MESSAGE);
	}

	private void showWarning() {
		JOptionPane.showMessageDialog(this, "This is Warning", "Warning",
				JOptionPane.WARNING_MESSAGE);
	}

	private void showInformation() {
		JOptionPane.showMessageDialog(this, "This is Information",
				"Information", JOptionPane.INFORMATION_MESSAGE);
	}

	private void showQuestion() {
		int select = JOptionPane.showConfirmDialog(this,
				"Are You Sure Want to delete?", "Question",
				JOptionPane.YES_NO_CANCEL_OPTION);
		if(select == JOptionPane.YES_OPTION){
			System.out.println("yes");
		}else if(select == JOptionPane.NO_OPTION){
			System.out.println("no");
		}else{
			System.out.println("cancel");
		}
	}

	private void showFileChooser() {
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(this);
	}

	private void showColorChooser() {
		JColorChooser cc = new JColorChooser();
		cc.showDialog(this, "Choose Color", new Color(000000));
	}

	private void showInputDialog() {
		JOptionPane.showInputDialog(new JTextField(), "Input Name");
	}

	private void createButton() {
		/*
		 * for (int i = 0; i < 4; i++) { rb = new JRadioButton("rd"+i); add(rb);
		 * }
		 */
	}
}
