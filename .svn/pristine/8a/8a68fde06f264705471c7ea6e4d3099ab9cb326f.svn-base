/*
 * 
 */
package buddychallenge.gui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

import buddychallenge.dao.PostsDAO;
import buddychallenge.dao.ReportsDAO;
import buddychallenge.dao.UsersDAO;
import buddychallenge.entities.User;
import buddychallenge.gui.presenters.HomePagePresenter;
import buddychallenge.gui.presenters.ProfilePresenter;
import buddychallenge.gui.presenters.SearchPresenter;
import buddychallenge.gui.views.interfaces.HomePageView;
import buddychallenge.gui.views.interfaces.ProfileView;
import buddychallenge.gui.views.interfaces.SearchView;

import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// TODO: Auto-generated Javadoc
/**
 * The Class HomePageJTabbedPane.
 */
public class HomePageJTabbedPane extends JTabbedPane {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The main frame. */
	private JFrame mainFrame;
	
	/** The previus panel. */
	private Container previusPanel;

	/** The homepage panel. */
	JPanel homepagePanel;
	
	/** The profile panel. */
	JPanel profilePanel;
	
	/** The search panel. */
	JPanel searchPanel;

	/** The users. */
	UsersDAO users;
	
	/** The posts. */
	PostsDAO posts;
	
	ReportsDAO reports;
	
	/** The current user. */
	User currentUser;

	/**
	 * Instantiates a new home page j tabbed pane.
	 *
	 * @param frame the frame
	 * @param users the users
	 * @param posts the posts
	 * @param currentUser the current user
	 */
	public HomePageJTabbedPane(JFrame frame, final UsersDAO users,
			final PostsDAO posts, final User currentUser,final ReportsDAO reports) {
		previusPanel = frame.getContentPane();
		this.mainFrame = frame;
		setBackground(Color.ORANGE);
		homepagePanel = new HomePageJPanel(frame,this);
		profilePanel = new ProfileJPanel(frame, this);
		searchPanel = new SearchJPanel(frame, this);
		addTab("Homepage", homepagePanel);
		addTab("Profile", profilePanel);
		addTab("Search", searchPanel);
		this.users = users;
		this.posts = posts;
		this.reports = reports;
		this.currentUser = currentUser;

		addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (getSelectedIndex() == 0)
					new HomePagePresenter((HomePageView) homepagePanel, currentUser,
							posts).start();
				if (getSelectedIndex() == 1)
					new ProfilePresenter((ProfileView) profilePanel, posts,
							currentUser).start();
				else if (getSelectedIndex() == 2)
					new SearchPresenter((SearchView) searchPanel, users, posts,
							currentUser,reports).start();
			}
		});
	}

	/**
	 * Gets the main frame.
	 *
	 * @return the main frame
	 */
	public JFrame getMainFrame() {
		return mainFrame;
	}

	/**
	 * Open.
	 */
	public void open() {
		// this.previusPanel = mainFrame.getContentPane();
		mainFrame.setContentPane(this);
		mainFrame.revalidate();
		mainFrame.repaint();
		this.setVisible(true);
	}

	/**
	 * Close.
	 */
	public void close() {
		removeAll();
		mainFrame.setContentPane(previusPanel);
		mainFrame.revalidate();
		mainFrame.repaint();
	}

}
