/**
 * 
 */
package model;

/**
 * @author rschuessler Objekte dieser Klasse werden zu neuen Benutzern
 *
 */
public class MRegister {

	private int MUIdNew;
	private String MUnserNameNew;
	private String MPasswordNew;
	private int MEIdNew;

	public MRegister(int mUIdNew, String mUserNameNew, String mPasswordNew, int MeIdNew) {
		MUIdNew = mUIdNew;
		MUnserNameNew = mUserNameNew;
		MPasswordNew = mPasswordNew;
		MEIdNew = MeIdNew;
	}

	public MRegister() {
		super();
	}

	/*
	 * Getter und Setter
	 */

	public int getMUIdNew() {
		return MUIdNew;
	}

	public void setMUIdNew(int mUIdNew) {
		MUIdNew = mUIdNew;
	}

	public String getMUnserNameNew() {
		return MUnserNameNew;
	}

	public void setMUnserNameNew(String mUnserNameNew) {
		MUnserNameNew = mUnserNameNew;
	}

	public String getMPasswordNew() {
		return MPasswordNew;
	}

	public void setMPasswordNew(String mPasswordNew) {
		MPasswordNew = mPasswordNew;
	}

	public int getMEIdNew() {
		return MEIdNew;
	}

	public void setMEIdNew(int mEIdNew) {
		MEIdNew = mEIdNew;
	}

}
