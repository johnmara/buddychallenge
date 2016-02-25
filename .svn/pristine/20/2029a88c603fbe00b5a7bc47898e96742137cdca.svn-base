/*
 * 
 */
package buddychallenge.gui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import buddychallenge.gui.presenters.AddPostPresenter;
import buddychallenge.gui.views.interfaces.AddPostView;
import buddychallenge.rules.BuddiesPostingRuleImpl;
import buddychallenge.rules.PublicPostingRuleImpl;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class AddPostJFrame.
 */
public class AddPostJFrame extends JFrame implements AddPostView {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The main frame. */
	private JFrame mainFrame;
	
	/** The panel. */
	private JPanel panel;
	
	/** The btn group. */
	private ButtonGroup btnGroup;
	
	/** The rdbtn public post rule. */
	private JRadioButton rdbtnPublicPostRule;
	
	/** The radio button only buddies. */
	private JRadioButton radioButtonOnlyBuddies;
	
	/** The btn submit. */
	private JButton btnSubmit;

	/** The presenter. */
	private AddPostPresenter presenter;
	
	/** The text field post text. */
	private JTextField textFieldPostText;

	/**
	 * Instantiates a new adds the post j frame.
	 *
	 * @param frame the frame
	 */
	public AddPostJFrame(JFrame frame) {
		this.mainFrame = frame;
		
		this.setSize(450,300);
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		
		textFieldPostText = new JTextField();
		textFieldPostText.setBounds(75, 43, 275, 26);
		textFieldPostText.setToolTipText("PostText");
		getContentPane().add(textFieldPostText);
		textFieldPostText.setColumns(10);
		
		panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(112, 90, 213, 57);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		rdbtnPublicPostRule = new JRadioButton("Public");
		rdbtnPublicPostRule.setBackground(Color.ORANGE);
		rdbtnPublicPostRule.setBounds(6, 27, 81, 23);
		panel.add(rdbtnPublicPostRule);
		
		radioButtonOnlyBuddies = new JRadioButton("OnlyBuddies");
		radioButtonOnlyBuddies.setBackground(Color.ORANGE);
		radioButtonOnlyBuddies.setBounds(89, 27, 118, 23);
		radioButtonOnlyBuddies.setSelected(true);
		panel.add(radioButtonOnlyBuddies);
		
		btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnPublicPostRule);
		btnGroup.add(radioButtonOnlyBuddies);
		
		JLabel labelR = new JLabel("Rule");
		labelR.setBounds(90, 0, 41, 36);
		panel.add(labelR);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(255, 99, 71));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				presenter.setText(textFieldPostText.getText());
				if(rdbtnPublicPostRule.isSelected())
					presenter.setRule(new PublicPostingRuleImpl());
				else 
					presenter.setRule(new BuddiesPostingRuleImpl());
				
				
				presenter.addPost();
				
			}
		});
		btnSubmit.setBounds(157, 174, 107, 23);
		getContentPane().add(btnSubmit);
		
		JLabel labelT = new JLabel("Text");
		labelT.setBounds(195, 11, 41, 36);
		getContentPane().add(labelT);
		
		
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AddPostView#open()
	 */
	@Override
	public void open() {
		this.setVisible(true);
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AddPostView#close()
	 */
	@Override
	public void close() {
		this.setVisible(false);
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AddPostView#setAddPostPresenter(buddychallenge.gui.presenters.AddPostPresenter)
	 */
	@Override
	public void setAddPostPresenter(AddPostPresenter presenter) {
		this.presenter = presenter;
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AddPostView#showMessage(java.lang.String)
	 */
	@Override
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AddPostView#getMainFrame()
	 */
	@Override
	public JFrame getMainFrame() {
		return this.mainFrame;
	}
}
