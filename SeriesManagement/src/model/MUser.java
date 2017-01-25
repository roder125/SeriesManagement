package model;

/**
 * 
 * @author rschuessler Objekte dieser Klasse sind Nutzer.
 *
 */
public class MUser {

	/*
	 * Atrtibute
	 */
	private int uId;
	private String uUserName;
	private String uPassword;
	private int uEId;

	/*
	 * Konstruktor
	 */
	public MUser(int uId, String uUserName, String uPassword, int uEId) {

		this.uId = uId;
		this.uUserName = uUserName;
		this.uPassword = uPassword;
		this.uEId = uEId;
	}

	public MUser() {
		super();
	}

	/*
	 * Getter und Setter der MUser Klasse
	 */
	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getUserName() {
		return uUserName;
	}

	public void setUserName(String uUserName) {
		this.uUserName = uUserName;
	}

	public String getPassword() {
		return uPassword;
	}

	public void setPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public int geteId() {
		return uEId;
	}

	public void seteId(int uEId) {
		this.uEId = uEId;
	}

}
