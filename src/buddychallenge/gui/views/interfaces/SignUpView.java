/*
 * 
 */
package buddychallenge.gui.views.interfaces;

import javax.swing.JFrame;

import buddychallenge.gui.presenters.SignUpPresenter;



// TODO: Auto-generated Javadoc
/**
 * The Interface SignUpView.
 */
public interface SignUpView {
	
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
	 * Sets the sign up presenter.
	 *
	 * @param presenter the new sign up presenter
	 */
	void setSignUpPresenter(SignUpPresenter presenter);
	
	//Sign Up Service
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
	
	/**
	 * Gets the email string.
	 *
	 * @return the email string
	 */
	String getEmailString();
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	String getFirstName();
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	String getLastName();
	
	/**
	 * Gets the gender pos.
	 *
	 * @return the gender pos
	 */
	int getGenderPos();
	
	/**
	 * Gets the birth date string.
	 *
	 * @return the birth date string
	 */
	String getBirthDateString();
	
	
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
