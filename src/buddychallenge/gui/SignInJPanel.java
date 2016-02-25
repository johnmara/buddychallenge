/*
 * 
 */
package buddychallenge.gui;

import javax.swing.JPanel;

import buddychallenge.gui.presenters.SignInPresenter;
import buddychallenge.gui.views.interfaces.SignInView;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.Color;

// TODO: Auto-generated Javadoc
/**
 * The Class SignInJPanel.
 */
public class SignInJPanel extends JPanel implements SignInView {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The main frame. */
	private JFrame mainFrame;
	
	/** The previus panel. */
	private JPanel previusPanel;

	/** The username. */
	private JTextField username;
	
	/** The password. */
	private JPasswordField password;

	/** The btn sign in. */
	private JButton btnSignIn;
	
	/** The btn cancel. */
	private JButton btnCancel;

	/** The lbl username. */
	private JLabel lblUsername;
	
	/** The lbl password. */
	private JLabel lblPassword;

	/** The presenter. */
	private SignInPresenter presenter;

	/**
	 * Instantiates a new sign in j panel.
	 *
	 * @param frame the frame
	 */
	public SignInJPanel(JFrame frame) {
		setBackground(Color.ORANGE);

		mainFrame = frame;

		setLayout(null);

		username = new JTextField();
		username.setBounds(202, 104, 86, 20);
		add(username);

		password = new JPasswordField();
		password.setBounds(202, 151, 86, 20);
		add(password);

		btnSignIn = new JButton("Sign In");
		btnSignIn.setBackground(new Color(255, 99, 71));
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.action();
			}
		});
		btnSignIn.setMnemonic(KeyEvent.VK_ENTER);
		btnSignIn.setBounds(105, 212, 89, 23);
		add(btnSignIn);

		btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(255, 215, 0));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				presenter.cancel();
			}
		});
		btnCancel.setMnemonic(KeyEvent.VK_CANCEL);

		btnCancel.setBounds(202, 212, 89, 23);
		add(btnCancel);

		lblUsername = new JLabel("Username");
		lblUsername.setBounds(105, 107, 79, 14);
		add(lblUsername);

		lblPassword = new JLabel("Password");
		lblPassword.setBounds(106, 154, 78, 14);
		add(lblPassword);

	}
	
	/**
	 * Gets the previous panel.
	 *
	 * @return the previous panel
	 */
	public JPanel getPreviousPanel(){
		return (JPanel)previusPanel;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignInView#getMainFrame()
	 */
	public JFrame getMainFrame(){
		return mainFrame;
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignInView#open()
	 */
	@Override
	public void open() {
		previusPanel = (JPanel)mainFrame.getContentPane();
		mainFrame.setContentPane(this);
		mainFrame.revalidate();
		mainFrame.repaint();
		this.setVisible(true);
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignInView#close()
	 */
	@Override
	public void close() {
		removeAll();
		mainFrame.setContentPane(previusPanel);
		mainFrame.revalidate();
		mainFrame.repaint();
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignInView#setSignInPresenter(buddychallenge.gui.presenters.SignInPresenter)
	 */
	@Override
	public void setSignInPresenter(SignInPresenter presenter) {
		this.presenter = presenter;
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignInView#getUsernameString()
	 */
	@Override
	public String getUsernameString() {
		return username.getText();
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignInView#getPasswordString()
	 */
	@SuppressWarnings("deprecation")
	@Override
	public String getPasswordString() {
		return password.getText();
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignInView#showMessage(java.lang.String)
	 */
	@Override
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}
}
