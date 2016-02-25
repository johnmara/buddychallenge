/*
 * 
 */
package buddychallenge.gui;

import java.awt.Color;
import java.awt.Container;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import buddychallenge.gui.presenters.ProfilePresenter;
import buddychallenge.gui.views.interfaces.ProfileView;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

// TODO: Auto-generated Javadoc
/**
 * The Class ProfileJPanel.
 */
public class ProfileJPanel extends JPanel implements ProfileView {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The main frame. */
	private JFrame mainFrame;
	
	/** The tabbed pane. */
	private JTabbedPane tabbedPane;
	
	/** The previus panel. */
	private Container previusPanel;
	
	/** The list my buddies. */
	private JList<String> listMyBuddies;
	
	/** The l model my buddies. */
	private DefaultListModel<String> lModelMyBuddies;
	
	/** The list posts. */
	private JList<String> listPosts;
	
	/** The l model posts. */
	private DefaultListModel<String> lModelPosts;
	
	/** The lb profile name. */
	private JLabel lbProfileName;

	
	/** The presenter. */
	private ProfilePresenter presenter;



	/**
	 * Instantiates a new profile j panel.
	 *
	 * @param frame the frame
	 * @param tabbedPane the tabbed pane
	 */
	public ProfileJPanel(JFrame frame, JTabbedPane tabbedPane) {
		previusPanel = frame.getContentPane();
		this.tabbedPane = tabbedPane;
		this.mainFrame = frame;
		setBackground(Color.ORANGE);
		setLayout(null);
		
		lbProfileName = new JLabel("");
		lbProfileName.setBounds(177, 38, 75, 14);
		add(lbProfileName);
		
		JLabel lblMyFriends = new JLabel("My Friends");
		lblMyFriends.setBounds(40, 80, 81, 30);
		add(lblMyFriends);
		
		lModelMyBuddies = new DefaultListModel<String>();		
		listMyBuddies = new JList<String>(lModelMyBuddies);
		listMyBuddies.setBounds(21, 121, 113, 136);
		add(listMyBuddies);
		
		JLabel lblMyPosts = new JLabel("My Posts");
		lblMyPosts.setBounds(273, 80, 64, 30);
		add(lblMyPosts);
		
		lModelPosts = new DefaultListModel<String>();
		listPosts = new JList<String>(lModelPosts);
		listPosts.setBounds(177, 121, 263, 136);
		add(listPosts);
		
		JButton btnAddPost = new JButton("Add Post");
		btnAddPost.setBackground(new Color(255, 99, 71));
		btnAddPost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.addPostAction();
			}
		});
		btnAddPost.setBounds(273, 268, 104, 23);
		add(btnAddPost);
		
		Icon refreshIcon = new ImageIcon(this.getClass().getResource("/refresh.png"));
		JButton btnRefresh = new JButton(refreshIcon);
		btnRefresh.setBackground(Color.ORANGE);
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				open();
			}
		});
		btnRefresh.setBounds(414, 12, 30, 30);
		add(btnRefresh);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		btnLogout.setBackground(new Color(255, 215, 0));
		btnLogout.setBounds(186, 315, 90, 25);
		add(btnLogout);
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.ProfileView#open()
	 */
	@Override
	public void open() {
		tabbedPane.setSelectedIndex(1);
		mainFrame.revalidate();
		mainFrame.repaint();
		this.setVisible(true);
		lbProfileName.setText(presenter.getProfileName());
		if(!lModelMyBuddies.isEmpty())
			lModelMyBuddies.clear();
		
		if(!lModelPosts.isEmpty())
			lModelPosts.clear();
		
		List<String> buddiesString = presenter.getBuddiesAsString();
		for(String s : buddiesString){
			lModelMyBuddies.addElement(s);
		}
		
		List<String> postsString = presenter.getPostsAsString();
		for(String s : postsString){
			lModelPosts.addElement(s);
		}
		
		this.revalidate();
		this.repaint();
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.ProfileView#close()
	 */
	@Override
	public void close() {
		removeAll();
		mainFrame.setContentPane(previusPanel);
		mainFrame.revalidate();
		mainFrame.repaint();
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.ProfileView#setProfilePresenter(buddychallenge.gui.presenters.ProfilePresenter)
	 */
	@Override
	public void setProfilePresenter(ProfilePresenter presenter) {
		this.presenter = presenter;
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.ProfileView#showMessage(java.lang.String)
	 */
	@Override
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.ProfileView#getMainFrame()
	 */
	@Override
	public JFrame getMainFrame() {
		return null;
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.ProfileView#getPreviousPanel()
	 */
	@Override
	public JPanel getPreviousPanel() {
		return null;
	}
}
