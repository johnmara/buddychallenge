/*
 * 
 */
package buddychallenge.gui.views.interfaces;

import javax.swing.JFrame;

import buddychallenge.entities.Question;
import buddychallenge.gui.presenters.BuddyRequestPresenter;

// TODO: Auto-generated Javadoc
/**
 * The Interface BuddyRequestView.
 */
public interface BuddyRequestView {
	
	/**
	 * Open the frame.
	 */
	public void open();
	
	/**
	 * Close the frame.
	 */
	public void close();
	
	
	/**
	 * Sets the buddy request presenter.
	 *
	 * @param buddyRequestPresenter the new buddy request presenter
	 */
	public void setBuddyRequestPresenter(
			BuddyRequestPresenter buddyRequestPresenter);
	
	/**
	 * Gets the question1.
	 *
	 * @return the question1
	 */
	public Question getQuestion1();
	
	/**
	 * Gets the answer1.
	 *
	 * @return the answer1
	 */
	public String getAnswer1();
	
	/**
	 * Gets the question2.
	 *
	 * @return the question2
	 */
	public Question getQuestion2();
	
	/**
	 * Gets the answer2.
	 *
	 * @return the answer2
	 */
	public String getAnswer2();
	
	/**
	 * Gets the question3.
	 *
	 * @return the question3
	 */
	public Question getQuestion3();
	
	/**
	 * Gets the answer3.
	 *
	 * @return the answer3
	 */
	public String getAnswer3();
	
	/**
	 * Gets the question4.
	 *
	 * @return the question4
	 */
	public Question getQuestion4();
	
	/**
	 * Gets the answer4.
	 *
	 * @return the answer4
	 */
	public String getAnswer4();
	
	/**
	 * Gets the question5.
	 *
	 * @return the question5
	 */
	public Question getQuestion5();
	
	/**
	 * Gets the answer5.
	 *
	 * @return the answer5
	 */
	public String getAnswer5();
	
	/**
	 * Show message.
	 *
	 * @param message the message
	 */
	public void showMessage(String message);
	
	/**
	 * Gets the previus frame.
	 *
	 * @return the previus frame
	 */
	public JFrame getPreviusFrame();
	
}
