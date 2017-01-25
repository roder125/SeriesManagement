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

import controller.CRegister;

/**
 * @author rschuessler View, welche aufgerufen wird, wenn der Button Register
 *         auf der Login View geklickt werden.
 *
 */
public class VRegister extends JFrame {

	/*
	 * Variablen erstellen
	 */
	private JButton btnCancel;
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
	public VRegister() {
		this.setBounds(0, 0, 300, 200);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnRegister = new JButton("Accept");
		btnRegister.addActionListener(new onRegister());
		btnCancel = new JButton("Cancel");
		// btnCancel.addActionListener(this);

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
		pnlButtons.add(btnRegister);
		btnCancel.setPreferredSize(new Dimension(30, 20));
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

	/**
	 * 
	 * @param ae
	 */
	public class onRegister implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			CRegister register = new CRegister();

			String userNameNew = txtUserName.getText();
			String passwordNew = String.valueOf(pwPassword.getPassword());
			register.controllerRegister(userNameNew, passwordNew);
			System.out.println(userNameNew);
			System.out.println(passwordNew);
		}
	}
}
