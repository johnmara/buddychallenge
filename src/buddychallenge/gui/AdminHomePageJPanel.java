/*
 * 
 */
package buddychallenge.gui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import buddychallenge.dao.PostsDAO;
import buddychallenge.dao.ReportsDAO;
import buddychallenge.entities.Admin;
import buddychallenge.gui.presenters.AdminManagePresenter;
import buddychallenge.gui.presenters.ManageReportsPresenter;
import buddychallenge.gui.presenters.QuestionManagePresenter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class AdminHomePageJPanel.
 */
public class AdminHomePageJPanel extends JPanel {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The main frame. */
	private JFrame mainFrame;
	
	/** The previus panel. */
	private JPanel previusPanel;
	
	/** The current admin. */
	private Admin currentAdmin;
	

	/**
	 * Instantiates a new admin home page j panel.
	 *
	 * @param frame the frame
	 * @param currentAdmin the current admin
	 */
	public AdminHomePageJPanel(final JFrame frame, Admin currentAdmin,final ReportsDAO reports,final PostsDAO posts) {
		setBackground(Color.ORANGE);
		this.mainFrame = frame;
		setCurrentAdmin(currentAdmin);
		setLayout(null);
		
		JButton btnManageAdmins = new JButton("Manage Admins");
		btnManageAdmins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AdminManagePresenter(new AdminManageJPanel(frame)).start();
			}
		});
		btnManageAdmins.setBackground(new Color(255, 215, 0));
		btnManageAdmins.setBounds(148, 48, 175, 23);
		add(btnManageAdmins);
		
		JButton buttonManageQuestions = new JButton("Manage Questions");
		buttonManageQuestions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new QuestionManagePresenter(new QuestionManageJPanel(frame)).start();
			}
		});
		buttonManageQuestions.setBackground(new Color(255, 215, 0));
		buttonManageQuestions.setBounds(148, 98, 175, 23);
		add(buttonManageQuestions);
		
		JButton btnManageUsers = new JButton("Manage Users");
		btnManageUsers.setBackground(new Color(255, 215, 0));
		btnManageUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnManageUsers.setBounds(148, 150, 175, 23);
		add(btnManageUsers);
		
		JButton btnManageReports = new JButton("Manage Reports");
		btnManageReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ManageReportsPresenter(new ManageReportsJFrame(),reports,posts).start();
			}
		});
		btnManageReports.setBackground(new Color(255, 215, 0));
		btnManageReports.setBounds(148, 204, 175, 23);
		add(btnManageReports);
		
		JButton buttonLogout = new JButton("Log out");
		buttonLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				close();
			}
		});
		buttonLogout.setBackground(new Color(255, 99, 71));
		buttonLogout.setBounds(166, 266, 140, 23);
		add(buttonLogout);
		
	}
	
	/**
	 * Open.
	 */
	public void open(){
		setPreviusPanel((JPanel)mainFrame.getContentPane());
		mainFrame.setContentPane(this);
		mainFrame.revalidate();
		mainFrame.repaint();
		this.setVisible(true);
	}

	/**
	 * Sets the previus panel.
	 *
	 * @param contentPane the new previus panel
	 */
	private void setPreviusPanel(JPanel contentPane) {
		this.previusPanel = contentPane;
		
	}

	/**
	 * Gets the previus panel.
	 *
	 * @return the previus panel
	 */
	public JPanel getPreviusPanel() {
		return previusPanel;
	}

	/**
	 * Gets the current admin.
	 *
	 * @return the current admin
	 */
	public Admin getCurrentAdmin() {
		return currentAdmin;
	}

	/**
	 * Sets the current admin.
	 *
	 * @param currentAdmin the new current admin
	 */
	public void setCurrentAdmin(Admin currentAdmin) {
		this.currentAdmin = currentAdmin;
	}
	
	public void close() {
		removeAll();
		mainFrame.setContentPane(previusPanel);
		mainFrame.revalidate();
		mainFrame.repaint();
	}
}
