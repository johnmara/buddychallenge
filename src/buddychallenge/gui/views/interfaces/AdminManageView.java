package buddychallenge.gui.views.interfaces;

import javax.swing.JFrame;

import buddychallenge.gui.presenters.AdminManagePresenter;

public interface AdminManageView {
	//Presenter
	/**
	 * Open the panel.
	 */
	void open();
	
	/**
	 * Close the panel.
	 */
	void close();
	
	String getUserNameString();
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

	void setPresenter(AdminManagePresenter adminManagePresenter);
}
