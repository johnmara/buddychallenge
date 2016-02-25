/*
 * 
 */
package buddychallenge.gui.views.interfaces;

import javax.swing.JFrame;

import buddychallenge.gui.presenters.SearchPresenter;


// TODO: Auto-generated Javadoc
/**
 * The Interface SearchView.
 */
public interface SearchView {
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
	 * Sets the search presenter.
	 *
	 * @param presenter the new search presenter
	 */
	void setSearchPresenter(SearchPresenter presenter);
	
	//Search Service

	
	//GUI
	/**
	 * Show message to User.
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
	 * @return the selected value
	 */
	String getSelectedValue();
}

