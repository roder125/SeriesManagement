/**
 * 
 */
package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.CLogin;

/**
 * @author rschuessler View, in welcher der Login stattfindet und man sich
 *         Registrieren kann.
 */
public class VLogin extends JFrame {

	/*
	 * Variablen erstellen
	 */
	private JButton btnLogin;
	private JButton btnRegister;

	private JLabel lbUserName;
	private JLabel lbPassword;

	private JTextField txtUserName;

	private JPasswordField pwPassword;

	private JPanel pnlLabels;
	private JPanel pnlTextfield;
	private JPanel pnlLabelsAndTextfield;
	private JPanel pnlButtons;
	private JPanel pnlButtonsAndLabelsAndTextfield;

	/*
	 * Iniziallisierung
	 */
	public VLogin() {
		this.setBounds(0, 0, 300, 200);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new onLogin());
		btnRegister = new JButton("Register");

		lbUserName = new JLabel("Username");
		lbPassword = new JLabel("Password");

		txtUserName = new JTextField(20);
		pwPassword = new JPasswordField(20);

		/*
		 * Panel für die Labels
		 */
		pnlLabels = new JPanel(new BorderLayout());
		pnlLabels.add(lbUserName, BorderLayout.NORTH);
		lbUserName.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		pnlLabels.add(lbPassword, BorderLayout.SOUTH);
		lbPassword.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		/*
		 * Panel für das Textfeld und das Passwortfeld
		 */
		pnlTextfield = new JPanel(new BorderLayout());
		pnlTextfield.add(txtUserName, BorderLayout.NORTH);
		txtUserName.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		pnlTextfield.add(pwPassword, BorderLayout.SOUTH);
		pwPassword.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		/*
		 * Panel, welches Panel Labels und Panel Textfield beinhaltet
		 */
		pnlLabelsAndTextfield = new JPanel(new BorderLayout());
		pnlLabelsAndTextfield.add(pnlLabels, BorderLayout.WEST);
		pnlLabelsAndTextfield.add(pnlTextfield, BorderLayout.EAST);

		/*
		 * Panel für die Buttons
		 */
		pnlButtons = new JPanel(new GridLayout(1, 2));
		pnlButtons.add(btnLogin);
		btnLogin.setPreferredSize(new Dimension(30, 20));
		pnlButtons.add(btnRegister);

		/*
		 * Panel, welches Panel Labels und Textfiels und Panel Buttons
		 * beinhaltet
		 */
		pnlButtonsAndLabelsAndTextfield = new JPanel(new BorderLayout());
		pnlButtonsAndLabelsAndTextfield.add(pnlLabelsAndTextfield, BorderLayout.NORTH);
		pnlButtonsAndLabelsAndTextfield.add(pnlButtons, BorderLayout.SOUTH);

		this.add(pnlButtonsAndLabelsAndTextfield);
		this.pack();
	}

	/*
	 * Die Quelle wird mit getSource() abgefragt und mit den Buttons
	 * abgeglichen. Beim klicken des Button Login wird der Name und das Passwort
	 * an die Klasse CLogin geschickt
	 */
	public class onLogin implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			CLogin login = new CLogin();

			String userName = txtUserName.getText();
			String password = String.valueOf(pwPassword.getPassword());
			login.controllerLogin(userName, password);
			System.out.println(userName);
			System.out.println(password);
		}
	}
}
