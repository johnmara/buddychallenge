/*
 * 
 */
package buddychallenge.gui.views.interfaces;

import javax.swing.JFrame;
import javax.swing.JPanel;

import buddychallenge.gui.presenters.ProfilePresenter;

// TODO: Auto-generated Javadoc
/**
 * The Interface ProfileView.
 */
public interface ProfileView {
	
	//Presenter
	/**
	 * Open the frame.
	 */
	void open();
	
	/**
	 * Close the frame.
	 */
	void close();
	
	/**
	 * Sets the profile presenter.
	 *
	 * @param presenter the new profile presenter
	 */
	void setProfilePresenter(ProfilePresenter presenter);
	
	
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
	
	/**
	 * Gets the previous panel.
	 *
	 * @return the previous panel
	 */
	JPanel getPreviousPanel();

}
