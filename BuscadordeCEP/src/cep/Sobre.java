package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/3669170_home_ic_icon.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscador de CEP Version 1.0.0");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel.setBounds(114, 11, 263, 27);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Desenvolvido por Brenno Oliveira");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(58, 62, 326, 28);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WEB Service:");
		lblNewLabel_2.setBounds(98, 129, 104, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblWebService = new JLabel("republicavirtual.com.br");
		lblWebService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.republicavirtual.com.br/");
			}
		});
		lblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblWebService.setForeground(SystemColor.textHighlight);
		lblWebService.setBounds(182, 129, 141, 14);
		getContentPane().add(lblWebService);
		
		JButton btnGit = new JButton("");
		btnGit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/Brenno0liveira");
			}
		});
		btnGit.setToolTipText("GitHub");
		btnGit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGit.setBorder(null);
		btnGit.setForeground(SystemColor.desktop);
		btnGit.setBackground(SystemColor.control);
		btnGit.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGit.setBounds(140, 181, 54, 50);
		getContentPane().add(btnGit);
		
		JButton btnLink = new JButton("");
		btnLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("www.linkedin.com/in/brenno-oliveira");
			}
		});
		btnLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLink.setToolTipText("LinkedIn");
		btnLink.setBorder(null);
		btnLink.setBackground(SystemColor.control);
		btnLink.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkedin.png")));
		btnLink.setBounds(239, 181, 50, 50);
		getContentPane().add(btnLink);

	}
	// metodo para abrir link externos no navegador
	private void link (String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
}
