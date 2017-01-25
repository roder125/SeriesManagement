package controller;

import controller.dao.DaoUser;
import model.MUser;

/**
 * 
 * @author rschuessler Klasse, welche die Daten aus der VLogin View behandelt
 *         und weiter verarbeitet
 *
 */
public class CLogin {

	/**
	 * Methode welche die eingegebenen Daten aus der Login View holt und
	 * abgleicht
	 **/
	public MUser controllerLogin(String userName, String password) {

		MUser user = DaoUser.getInstance().select(userName);

		if (userName.equals("Roderick") && password.equals("123")) {
			System.out.println("Einloggen war erfolgreich, weiter zum nächstren Fenster.");
		} else {
			System.out.println("Logininformationen sind falsch.");
		}
	}

	public void controllerRegister() {
		MUser user = new MUser();
		user.getUserName();
		user.getPassword();
	}
}
