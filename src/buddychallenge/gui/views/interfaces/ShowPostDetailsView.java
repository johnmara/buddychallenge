package buddychallenge.gui.views.interfaces;


import buddychallenge.gui.presenters.ShowPostDetailsPresenter;
import buddychallenge.util.Category;

public interface ShowPostDetailsView {
	
	/**
	 * Open the frame.
	 */
	void open();
	
	/**
	 * Close the frame.
	 */
	void close();
	
	
	String getReasonString();

	Category getCategory();
	
	String getCommentString();
	
	/**
	 * Sets the show post details presenter.
	 *
	 * @param presenter the new search presenter
	 */
	void setShowPostDetailsPresenter(ShowPostDetailsPresenter presenter);
	
	/**
	 * Show message to User.
	 *
	 * @param message the message
	 */
	void showMessage(String message);
	
	
	/**
	 * Gets the selected value.
	 *
	 * @return the selected value
	 */
	String getSelectedValue();




}
