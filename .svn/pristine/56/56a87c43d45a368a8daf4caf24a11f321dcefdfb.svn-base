package buddychallenge.gui.stubs;

import javax.swing.JFrame;

import buddychallenge.gui.presenters.SignUpPresenter;
import buddychallenge.gui.views.interfaces.SignUpView;

public class SignUpStub implements SignUpView {

	private int messagesSent,genderPos;
	private boolean opened = false;
	private String usernameString,passwordString,emailString,firstName,lastName,birthDateString;

	@Override
	public void open() {
		opened = true;

	}
	
	public boolean isOpened() {
		return opened;
	}

	@Override
	public void close() {
		opened = false;

	}

	@Override
	public void setSignUpPresenter(SignUpPresenter presenter) {

	}

	@Override
	public String getUsernameString() {
		return usernameString;
	}

	@Override
	public String getPasswordString() {
		return passwordString;
	}

	@Override
	public String getEmailString() {
		return emailString;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public int getGenderPos() {
		return genderPos;
	}

	@Override
	public String getBirthDateString() {
		return birthDateString;
	}

	@Override
	public void showMessage(String message) {
		messagesSent++;
	}

	@Override
	public JFrame getMainFrame() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setGenderPos(int genderPos) {
		this.genderPos = genderPos;
	}

	public void setUsernameString(String usernameString) {
		this.usernameString = usernameString;
	}

	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	public void setLastname(String lastname) {
		this.lastName = lastname;
	}

	public void setBirthDateString(String birthdateString) {
		this.birthDateString = birthdateString;
	}

	public int getMessagesSent() {
		return messagesSent;
	}

}
