/*
 * 
 */
package buddychallenge.gui.views.interfaces;

import javax.swing.JFrame;

import buddychallenge.gui.presenters.HomePagePresenter;

// TODO: Auto-generated Javadoc
/**
 * The Interface HomePageView.
 */
public interface HomePageView {

	// Presenter
	/**
	 * Open the panel.
	 */
	void open();

	/**
	 * Close the panel.
	 */
	void close();

	/**
	 * Sets the home page presenter.
	 *
	 * @param presenter
	 *            the new home page presenter
	 */
	void setHomePagePresenter(HomePagePresenter presenter);

	// GUI
	/**
	 * Show message.
	 *
	 * @param message
	 *            the message
	 */
	void showMessage(String message);

	/**
	 * Gets the main frame.
	 *
	 * @return the main frame
	 */
	JFrame getMainFrame();

}
