/*
 * 
 */
package buddychallenge.gui;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;








import buddychallenge.exceptions.UserException;
import buddychallenge.gui.presenters.SignUpPresenter;
import buddychallenge.gui.views.interfaces.SignUpView;

import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.Color;

// TODO: Auto-generated Javadoc
/**
 * The Class SignUpJPanel.
 */
public class SignUpJPanel extends JPanel implements SignUpView {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignUpView#getMainFrame()
	 */
	public JFrame getMainFrame() {
		return mainFrame;
	}

	/**
	 * Sets the main frame.
	 *
	 * @param mainFrame the new main frame
	 */
	public void setMainFrame(JFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	/** The main frame. */
	private JFrame mainFrame;
	
	/** The previus panel. */
	private Container previusPanel;

	/** The username. */
	private JTextField username;
	
	/** The password. */
	private JPasswordField password;
	
	/** The email. */
	private JTextField email;
	
	/** The first name. */
	private JTextField firstName;
	
	/** The last name. */
	private JTextField lastName;
	
	/** The btngroup. */
	private ButtonGroup btngroup;
	
	/** The radio panel. */
	private JPanel radioPanel;
	
	/** The male rb. */
	private JRadioButton maleRB;
	
	/** The female rb. */
	private JRadioButton femaleRB;
	
	/** The birth date. */
	private JTextField birthDate;

	/** The lbl username. */
	private JLabel lblUsername;
	
	/** The lbl password. */
	private JLabel lblPassword;
	
	/** The lbl first name. */
	private JLabel lblFirstName;
	
	/** The lbl last name. */
	private JLabel lblLastName;
	
	/** The lbl gender. */
	private JLabel lblGender;
	
	/** The lbl new label. */
	private JLabel lblNewLabel;
	
	/** The lblemail. */
	private JLabel lblemail;

	/** The confirm button. */
	private JButton confirmButton;
	
	/** The cancel button. */
	private JButton cancelButton;

	/** The presenter. */
	private SignUpPresenter presenter;

	/**
	 * Instantiates a new sign up j panel.
	 *
	 * @param frame the frame
	 */
	public SignUpJPanel(JFrame frame) {
		setBackground(Color.ORANGE);
		mainFrame = frame;

		username = new JTextField();
		username.setToolTipText("Username");
		username.setBounds(147, 41, 97, 20);
		add(username);

		password = new JPasswordField();
		password.setToolTipText("Password");
		password.setBounds(147, 73, 97, 20);
		add(password);

		email = new JTextField();
		email.setBounds(147, 105, 97, 20);
		add(email);

		firstName = new JTextField();
		firstName.setToolTipText("Firstname");
		firstName.setBounds(147, 139, 97, 20);
		add(firstName);

		lastName = new JTextField();
		lastName.setToolTipText("LastName");
		lastName.setBounds(147, 163, 97, 20);
		add(lastName);

		maleRB = new JRadioButton();
		maleRB.setBackground(Color.ORANGE);
		maleRB.setText("Male");
		maleRB.setToolTipText("Male");
		maleRB.setSelected(true);

		femaleRB = new JRadioButton();
		femaleRB.setBackground(Color.ORANGE);
		femaleRB.setText("Female");
		femaleRB.setToolTipText("Female");

		btngroup = new ButtonGroup();
		btngroup.add(maleRB);
		btngroup.add(femaleRB);

		radioPanel = new JPanel();
		radioPanel.setBackground(Color.ORANGE);
		radioPanel.setBounds(147, 189, 150, 22);
		radioPanel.setLayout(new BorderLayout(0, 0));
		radioPanel.add(maleRB, BorderLayout.WEST);
		radioPanel.add(femaleRB, BorderLayout.CENTER);
		add(radioPanel);

		birthDate = new JTextField();
		birthDate.setText("dd-mm-yy");
		birthDate.setBounds(147, 220, 120, 20);
		add(birthDate);

		confirmButton = new JButton("Sign Up");
		confirmButton.setBackground(new Color(255, 99, 71));
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					presenter.action();
				}catch(UserException ex){
					showMessage(ex.getMessage());
				}
			}
		});
		confirmButton.setMnemonic(KeyEvent.VK_ENTER);
		confirmButton.setBounds(114, 266, 106, 23);
		add(confirmButton);

		cancelButton = new JButton("Cancel");
		cancelButton.setBackground(new Color(255, 215, 0));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				presenter.cancel();
			}
		});
		cancelButton.setMnemonic(KeyEvent.VK_CANCEL);
		cancelButton.setBounds(232, 266, 95, 23);
		add(cancelButton);

		setLayout(null);

		lblUsername = new JLabel("Username");
		lblUsername.setLabelFor(username);
		lblUsername.setBounds(38, 40, 83, 23);
		add(lblUsername);

		lblPassword = new JLabel("Password");
		lblPassword.setLabelFor(password);
		lblPassword.setBounds(38, 75, 83, 23);
		add(lblPassword);

		lblFirstName = new JLabel("First Name");
		lblFirstName.setLabelFor(firstName);
		lblFirstName.setBounds(38, 138, 83, 23);
		add(lblFirstName);

		lblLastName = new JLabel("Last Name");
		lblLastName.setLabelFor(lastName);
		lblLastName.setBounds(38, 161, 83, 23);
		add(lblLastName);

		lblGender = new JLabel("Gender");
		lblGender.setBounds(38, 189, 83, 23);
		add(lblGender);

		lblNewLabel = new JLabel("Birthdate");
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setBounds(38, 220, 67, 20);
		add(lblNewLabel);

		lblemail = new JLabel("Email");
		lblemail.setLabelFor(email);
		lblemail.setBounds(38, 110, 55, 16);
		add(lblemail);

	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignUpView#open()
	 */
	@Override
	public void open() {
		previusPanel = mainFrame.getContentPane();
		mainFrame.setContentPane(this);
		mainFrame.revalidate();
		mainFrame.repaint();
		this.setVisible(true);
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignUpView#close()
	 */
	@Override
	public void close() {
		removeAll();
		mainFrame.setContentPane(previusPanel);
		mainFrame.revalidate();
		mainFrame.repaint();
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignUpView#setSignUpPresenter(buddychallenge.gui.presenters.SignUpPresenter)
	 */
	@Override
	public void setSignUpPresenter(SignUpPresenter presenter) {
		this.presenter = presenter;
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignUpView#getUsernameString()
	 */
	@Override
	public String getUsernameString() {
		return username.getText();
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignUpView#getPasswordString()
	 */
	@SuppressWarnings("deprecation")
	@Override
	public String getPasswordString() {
		return password.getText();
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignUpView#getEmailString()
	 */
	@Override
	public String getEmailString() {
		return email.getText();
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignUpView#getFirstName()
	 */
	@Override
	public String getFirstName() {
		return firstName.getText();
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignUpView#getLastName()
	 */
	@Override
	public String getLastName() {
		return lastName.getText();
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignUpView#getGenderPos()
	 */
	public int getGenderPos() {
		if (maleRB.isSelected())
			return 0;
		else
			return 1;
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignUpView#getBirthDateString()
	 */
	@Override
	public String getBirthDateString() {
		return birthDate.getText();
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SignUpView#showMessage(java.lang.String)
	 */
	@Override
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);

	}
}
