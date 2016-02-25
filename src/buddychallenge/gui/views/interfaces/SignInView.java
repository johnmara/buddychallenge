/*
 * 
 */
package buddychallenge.gui.views.interfaces;

import javax.swing.JFrame;

import buddychallenge.gui.presenters.SignInPresenter;

// TODO: Auto-generated Javadoc
/**
 * The Interface SignInView.
 */
public interface SignInView {
	
	//Presenter
	/**
	 * Open the panel.
	 */
	void open();
	
	/**
	 * Close the panel.
	 */
	void close();
	
	/**
	 * Sets the sign in presenter.
	 *
	 * @param presenter the new sign in presenter
	 */
	void setSignInPresenter(SignInPresenter presenter);
	
	//Sign In Service
	/**
	 * Gets the username string.
	 *
	 * @return the username string
	 */
	String getUsernameString();
	
	/**
	 * Gets the password string.
	 *
	 * @return the password string
	 */
	String getPasswordString();
	
	//GUI
	/**
	 * Show message.
	 *
	 * @param message the message
	 */
	void showMessage(String message);
	
	/**
	 * Gets the main frame.
	 *
	 * @return the main frame
	 */
	JFrame getMainFrame();
}
