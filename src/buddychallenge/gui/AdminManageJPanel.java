package buddychallenge.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import buddychallenge.gui.presenters.AdminManagePresenter;
import buddychallenge.gui.views.interfaces.AdminManageView;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminManageJPanel extends JPanel implements AdminManageView {


	private static final long serialVersionUID = 1L;

	/** The main frame. */
	private JFrame mainFrame;
	
	private AdminManagePresenter presenter;
	
	/** The previus panel. */
	private JPanel previusPanel;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;
	

	public AdminManageJPanel(JFrame frame){
		setBackground(Color.ORANGE);
		this.mainFrame = frame;
		setLayout(null);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(213, 81, 86, 20);
		add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JButton btnAddAdmin = new JButton("Add Admin");
		btnAddAdmin.setBackground(new Color(255, 99, 71));
		btnAddAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				presenter.addAdmin();
				presenter.cancel();
			}
		});
		btnAddAdmin.setBounds(223, 168, 108, 23);
		add(btnAddAdmin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(213, 127, 86, 20);
		add(passwordField);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(110, 83, 72, 14);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(111, 129, 71, 14);
		add(lblPassword);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.cancel();
			}
		});
		btnCancel.setBackground(new Color(255, 215, 0));
		btnCancel.setBounds(94, 167, 117, 25);
		add(btnCancel);
	}

	@Override
	public void open() {
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
	
	public void setPresenter(AdminManagePresenter presenter) {
		this.presenter = presenter;
	}
	
	@Override
	public String getUserNameString() {
		return textFieldUsername.getText();
	}

	@SuppressWarnings("deprecation")
	@Override
	public String getPasswordString() {
		return passwordField.getText();
	}

	@Override
	public void close() {
		removeAll();
		mainFrame.setContentPane(previusPanel);
		mainFrame.revalidate();
		mainFrame.repaint();
	}

	@Override
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
		
	}

	@Override
	public JFrame getMainFrame() {
		return mainFrame;
	}
}
