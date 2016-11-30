package net.myinfosys.desembertraining.swing.text;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

public class PanelText extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1248453340072817212L;

	public PanelText() throws IOException {
		initComponents();

	}

	private void initComponents() throws IOException {
		// TODO Auto-generated method stub

		// label nama
		setLayout(null);
		JLabel lbNama = new JLabel("Nama");
		lbNama.setBounds(10, 10, 80, 25);
		add(lbNama);

		// field nama
		JTextField tfNama = new JTextField();
		tfNama.setBounds(100, 10, 160, 25);
		add(tfNama);

		// label tanggal
		JLabel lbTanggal = new JLabel("Tanggal Lahir");
		lbTanggal.setBounds(10, 40, 80, 25);
		add(lbTanggal);

		// field tanggal
		JFormattedTextField tfTanggal = new JFormattedTextField("28/11/2016");
		tfTanggal.setBounds(100, 40, 160, 25);
		add(tfTanggal);

		// label password
		JLabel lbPassword = new JLabel("Password");
		lbPassword.setBounds(10, 70, 80, 25);
		add(lbPassword);

		// field password
		JPasswordField tfPassword = new JPasswordField();
		tfPassword.setBounds(100, 70, 160, 25);
		add(tfPassword);

		// label alamat
		JLabel lbAlamat = new JLabel("Alamat");
		lbAlamat.setBounds(10, 100, 80, 25);
		add(lbAlamat);

		// field alamat
		JTextArea tfAlamat = new JTextArea();
		tfAlamat.setBounds(100, 100, 160, 50);
		add(tfAlamat);

		// label editor pane
		JLabel lbWebsite = new JLabel("Website");
		lbWebsite.setBounds(10, 170, 80, 25);
		add(lbWebsite);

		// field website
		
		JEditorPane tfWebsite = new JEditorPane();
		
		
		URL url = PanelText.class.getResource("index.html");
		if (url != null) {
			try {
				tfWebsite.setPage(url);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				System.out.println("file not found");
			}
		}else{
			System.out.println("file null");
		}
		JScrollPane editorPane = new JScrollPane(tfWebsite);
		editorPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		editorPane.setPreferredSize(new Dimension(170,100));
		editorPane.setMinimumSize(new Dimension(10,10));

		tfWebsite.setBounds(100, 170, 500, 250);
		tfWebsite.setEditable(false);
		//tfWebsite.setAutoscrolls(true);
		add(tfWebsite);

		// label keterangan
		JLabel lbKeterangan = new JLabel("Keterangan");
		lbKeterangan.setBounds(300, 10, 300, 25);
		add(lbKeterangan);

		// field keterangan
		JTextPane tfKeterangan = new JTextPane();
		tfKeterangan.setBounds(300, 40, 300, 100);
		tfKeterangan.setAutoscrolls(true);
		add(tfKeterangan);
	}

}
