package buddychallenge.gui.stubs;

import javax.swing.JFrame;

import buddychallenge.gui.presenters.SignInPresenter;
import buddychallenge.gui.views.interfaces.SignInView;

public class SignInStub implements SignInView {
	
	private int messagesSent;
	private boolean opened = false;
	private String usernameString, passwordString;
	

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
	public void setSignInPresenter(SignInPresenter presenter) {

	}

	@Override
	public String getUsernameString() {
		return usernameString;
	}
	
	

	public void setUsernameString(String usernameString) {
		this.usernameString = usernameString;
	}

	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}

	@Override
	public String getPasswordString() {
		return passwordString;
	}
	

	@Override
	public JFrame getMainFrame() {
		return null;
	}
	
	public int getMessagesSent() {
		return messagesSent;
	}

	@Override
	public void showMessage(String message) {
		messagesSent++;
	}


}
