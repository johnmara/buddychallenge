/*
 * 
 */
package buddychallenge.gui.views.interfaces;

import javax.swing.JFrame;

import buddychallenge.gui.presenters.ShowProfilePresenter;

// TODO: Auto-generated Javadoc
/**
 * The Interface ShowProfileView.
 */
public interface ShowProfileView {
	// Presenter
	/**
	 * Open the frame.
	 */
	void open();
	
	/**
	 * Close the frame.
	 */
	void close();

	/**
	 * Sets the show profile presenter.
	 *
	 * @param presenter the new show profile presenter
	 */
	void setShowProfilePresenter(ShowProfilePresenter presenter);

	// Show Profile Service

	// GUI
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
	 * Gets the selected value.
	 *
	 * @return selected value
	 */
	String getSelectedValue();
}
