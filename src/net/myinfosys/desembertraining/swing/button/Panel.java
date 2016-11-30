package net.myinfosys.desembertraining.swing.button;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2934418456692139117L;

	JButton btnAdd = new JButton("Add");
	JLabel lbLogo = new JLabel();
	JLabel lbHobby = new JLabel("Hobby :");
	JCheckBox btnSepakbola = new JCheckBox("Sepakbola");
	JCheckBox btnMembaca = new JCheckBox("Membaca");
	JCheckBox btnMenonton = new JCheckBox("Menonton");
	JCheckBox btnGaming = new JCheckBox("Gaming");
	JCheckBox btnMusik = new JCheckBox("Musik");
	JLabel lbReligi = new JLabel("Religi");
	JLabel lbInfo = new JLabel("Info");
	JComboBox btnReligi = new JComboBox();
	JLabel lbSex = new JLabel("Sex");
	JRadioButton btnMale = new JRadioButton(Sex.Male.name(),true);
	JRadioButton btnFemale = new JRadioButton(Sex.Female.name());
	ButtonGroup btnGroupSex = new ButtonGroup();
	//menu
	JMenuBar menuBar = new JMenuBar();
	JMenu menu, subMenu;
	JMenuItem menuItem;
	JCheckBoxMenuItem cbMenu;
	ButtonGroup btnGroupMenu = new ButtonGroup();
	JRadioButtonMenuItem rbMenu;
	
	public Panel(){
		initComponents();
		createMenu();
		setLayout(null);
		
	}
	
	private void createMenu(){
		//create menu 
		//menu file
		createMenuFile();
		
		//menu help
		createMenuHelp();
	}
	
	private void createMenuFile(){
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_F);//membuat garis bawah pada huruf f
		menuBar.add(menu);
		
		//add sub menu new
		menuItem = new JMenuItem("New");
		menu.add(menuItem);
		
		//add sub menu open
		ImageIcon iconFolder = new ImageIcon("export.jpg");
		menuItem = new JMenuItem("Open",iconFolder);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(
	                KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				openFile();
			}
		});
		menu.add(menuItem);
		
		//add radio button menu like
		rbMenu = new JRadioButtonMenuItem("Like");
		menu.add(rbMenu);
		btnGroupMenu.add(rbMenu);
		
		//add radio menu dislike
		rbMenu = new JRadioButtonMenuItem("Dislike");
		menu.add(rbMenu);
		btnGroupMenu.add(rbMenu);
		
		//add checkbox menu
		cbMenu = new JCheckBoxMenuItem("Agree");
		menu.add(cbMenu);
		
		//add submenu
		subMenu = new JMenu("Editor");
		menuItem = new JMenuItem("Tomcat");
		subMenu.add(menuItem);
		menu.add(subMenu);
	}
	
	private void createMenuHelp(){
		menu = new JMenu("Help");
		menu.setMnemonic(KeyEvent.VK_H);//membuat garis bawah pada huruf H
		menuBar.add(menu);
	}
	
	private void openFile(){
		JFileChooser fc = new JFileChooser();
		int val = fc.showOpenDialog(this);
	}
	
	
	private void initComponents() {
		// TODO Auto-generated method stub
		
		//set lbl image icon
		lbLogo.setIcon(new ImageIcon("logo.jpg"));
		lbLogo.setBounds(250,10,120,100);
		
		//set position hobby
		lbHobby.setBounds(10, 130, 80, 25);
		btnGaming.setBounds(100, 160, 90, 25);	
		btnMembaca.setBounds(100, 190, 90, 25);
		btnMenonton.setBounds(100, 220, 90, 25);
		btnMusik.setBounds(100, 250, 90, 25);
		btnSepakbola.setBounds(100, 280, 90, 25);
		
		
		//set religi
		lbReligi.setBounds(10, 330, 80, 25);
		btnReligi.setBounds(100, 330, 200, 25);
		btnReligi.setModel(new DefaultComboBoxModel(Religi.values()));
		
		//set sex
		lbSex.setBounds(10, 370, 80, 25);
		btnMale.setBounds(100,370,160,25);
		btnMale.setActionCommand("Male");
		btnFemale.setBounds(100,400,160,25);
		btnFemale.setActionCommand("Female");
		btnGroupSex.add(btnMale);
		btnGroupSex.add(btnFemale);
		
		
		//info religi choose
		lbInfo.setBounds(100, 450, 300, 25);
		//set add
		btnAdd.setBounds(500, 500, 100, 25);
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add();
			}
		});
		
		
		//add to panel
		add(btnAdd);
		add(lbLogo);
		add(lbHobby);
		add(btnGaming);
		add(btnMembaca);
		add(btnMenonton);
		add(btnMusik);
		add(btnSepakbola);
		add(lbReligi);
		add(btnReligi);
		add(lbSex);
		add(btnMale);
		add(lbInfo);
		add(btnFemale);
		
	}
	
	private void add(){
		int index = btnReligi.getSelectedIndex();
		String sex = btnGroupSex.getSelection().getActionCommand();
		String info=("Religi :"+(Religi.values()[index]).toString()+" Sex:"+sex);
		JOptionPane.showMessageDialog(this, info,"Info",JOptionPane.PLAIN_MESSAGE);

	}
	
	
}
