/*
 * 
 */
package buddychallenge.gui;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JList;

import buddychallenge.gui.presenters.HomePagePresenter;
import buddychallenge.gui.views.interfaces.HomePageView;

import javax.swing.JLabel;

// TODO: Auto-generated Javadoc
/**
 * The Class HomePageJPanel.
 */
public class HomePageJPanel extends JPanel implements HomePageView{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The main frame. */
	private JFrame mainFrame;
	
	/** The previus panel. */
	private Container previusPanel;
	
	/** The tabbed pane. */
	private JTabbedPane tabbedPane;
	
	/** The list model posts. */
	private DefaultListModel<String> listModelPosts;
	
	/** The list posts. */
	private JList<String> listPosts;
	
	/** The label profile name. */
	private JLabel labelProfileName;
	
	/** The presenter. */
	private HomePagePresenter presenter;

	/**
	 * Instantiates a new home page j panel.
	 *
	 * @param frame the frame
	 * @param tabbedPane the tabbed pane
	 */
	public HomePageJPanel(JFrame frame,JTabbedPane tabbedPane) {
		setBackground(Color.ORANGE);
		setLayout(null);
		previusPanel = frame.getContentPane();
		this.mainFrame = frame;
		this.tabbedPane = tabbedPane;
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		btnLogout.setBounds(186, 315, 90, 25);
		btnLogout.setBackground(new Color(255, 215, 0));
		add(btnLogout);
		
		listModelPosts = new DefaultListModel<String>();
		listPosts = new JList<String>(listModelPosts);
		listPosts.setToolTipText("Other Users Posts");
		listPosts.setBounds(24, 50, 399, 175);
		add(listPosts);
		
		labelProfileName = new JLabel("");
		labelProfileName.setBounds(155, 11, 134, 14);
		add(labelProfileName);

	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.HomePageView#open()
	 */
	@Override
	public void open() {
		//mainFrame.setContentPane(this);
		tabbedPane.setSelectedIndex(0);
		mainFrame.revalidate();
		mainFrame.repaint();
		this.setVisible(true);
		this.labelProfileName.setText(presenter.getProfileName());
		if(!listModelPosts.isEmpty())
			listModelPosts.clear();
		
		for(String s : presenter.getPosts()){
			listModelPosts.addElement(s);
		}
		
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.HomePageView#close()
	 */
	@Override
	public void close() {
		removeAll();
		mainFrame.setContentPane(previusPanel);
		mainFrame.revalidate();
		mainFrame.repaint();
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.HomePageView#setHomePagePresenter(buddychallenge.gui.presenters.HomePagePresenter)
	 */
	@Override
	public void setHomePagePresenter(HomePagePresenter presenter) {
		this.presenter = presenter;
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.HomePageView#showMessage(java.lang.String)
	 */
	@Override
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.HomePageView#getMainFrame()
	 */
	@Override
	public JFrame getMainFrame() {
		return this.mainFrame;
	}
}
