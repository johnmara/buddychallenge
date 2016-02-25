/*
 * 
 */
package buddychallenge.gui;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;

import buddychallenge.dao.AdminsDAO;
import buddychallenge.dao.PostsDAO;
import buddychallenge.dao.QuestionsDAO;
import buddychallenge.dao.ReportsDAO;
import buddychallenge.dao.UsersDAO;
import buddychallenge.gui.presenters.SignInPresenter;
import buddychallenge.gui.presenters.SignUpPresenter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.Color;

// TODO: Auto-generated Javadoc
/**
 * The Class MainFrame.
 */
public class MainFrame extends JFrame {

	/** dy. */
	private static final long serialVersionUID = 1L;

	/** The frame. */
	static MainFrame frame;
	
	/** The userdao. */
	static UsersDAO userdao = new UsersDAO();
	
	/** The postsdao. */
	static PostsDAO postsdao = new PostsDAO();
	
	/** The questiondao. */
	static QuestionsDAO questiondao = new QuestionsDAO();
	
	/** The admindao. */
	static AdminsDAO admindao = new AdminsDAO();
	
	/** The reportsdao. */
	static ReportsDAO reportsdao = new ReportsDAO();
	
	/** The table. */
	private JTable table;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Restart.
	 */
	public static void restart() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		getContentPane().setBackground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 510);
		getContentPane().setLayout(null);

		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBackground(new Color(255, 215, 0));

		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new SignUpPresenter(new SignUpJPanel(frame), userdao,
						questiondao).start();

			}
		});
		btnSignUp.setBounds(252, 244, 89, 23);
		getContentPane().add(btnSignUp);

		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.setBackground(new Color(255, 99, 71));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SignInPresenter(new SignInJPanel(frame), userdao, postsdao,
						admindao, questiondao,reportsdao).start();
			}
		});
		btnNewButton.setBounds(112, 244, 89, 23);
		getContentPane().add(btnNewButton);

		table = new JTable();
		table.setBounds(286, 127, 1, 1);
		getContentPane().add(table);

		JLabel image = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/logo.png"))
				.getImage();
		image.setIcon(new ImageIcon(img));
		image.setBounds(52, 98, 334, 119);
		getContentPane().add(image);

	}
}