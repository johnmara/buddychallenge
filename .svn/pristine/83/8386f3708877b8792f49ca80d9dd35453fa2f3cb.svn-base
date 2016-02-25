/*
 * 
 */
package buddychallenge.gui;

import java.awt.Color;
import java.awt.Image;

import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import buddychallenge.entities.Post;
import buddychallenge.gui.presenters.ShowProfilePresenter;
import buddychallenge.gui.views.interfaces.ShowProfileView;
import buddychallenge.util.Gender;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class ShowProfileJFrame.
 */
public class ShowProfileJFrame extends JFrame implements ShowProfileView {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The main frame. */
	private JFrame mainFrame;
	
	/** The btn add buddy. */
	private JButton btnAddBuddy;
	
	/** The lbl profile name. */
	private JLabel lblProfileName;
	
	/** The lbl gender. */
	private JLabel lblGender;
	
	/** The list model. */
	private DefaultListModel<String> listModel;
	
	/** The list posts. */
	private JList<String> listPosts;

	/** The presenter. */
	private ShowProfilePresenter presenter;
	
	/** The btn refresh. */
	private JButton btnRefresh;

	/**
	 * Instantiates a new show profile j frame.
	 *
	 * @param frame the frame
	 */
	public ShowProfileJFrame(JFrame frame) {
		this.mainFrame = frame;
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.ORANGE);
		
		btnAddBuddy = new JButton("Add Buddy");
		btnAddBuddy.setBackground(new Color(255, 99, 71));
		btnAddBuddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.addBuddy();
			}
		});
		btnAddBuddy.setBounds(154, 24, 131, 23);
		getContentPane().add(btnAddBuddy);

		listModel = new DefaultListModel<String>();
		listPosts = new JList<String>(listModel);
		listPosts.setBounds(32, 170, 372, 147);
		getContentPane().add(listPosts);

		lblProfileName = new JLabel("");
		lblProfileName.setBounds(168, 91, 137, 23);
		getContentPane().add(lblProfileName);
		
		Icon refreshIcon = new ImageIcon(this.getClass().getResource("/refresh.png"));
		btnRefresh = new JButton(refreshIcon);
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refresh();
			}
		});
		btnRefresh.setBackground(Color.ORANGE);
		btnRefresh.setBounds(387, 24, 30, 30);
		getContentPane().add(btnRefresh);

		lblGender = new JLabel("");
		lblGender.setBounds(195, 58, 50, 50);
		
		this.setSize(450, 500);

	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.ShowProfileView#open()
	 */
	@Override
	public void open() {
		this.setVisible(true);
		if(presenter.getCurrentUser().hasBuddy(presenter.getProfileUser()))
			btnAddBuddy.setVisible(false);
		else 
			btnAddBuddy.setVisible(true);
		
		if(!listModel.isEmpty())
			listModel.clear();
		
		for (Post p : presenter.getPosts()) {
			listModel.addElement("ID: "+p.getPostID()+",Post: "+p.getText());
		}
		
		listPosts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				presenter.showPostDetails();			
			}
		});

		lblProfileName.setText(presenter.getProfileName());
		Gender gender = presenter.getGender();

		Image img;
		if (gender.equals(Gender.Gender1)){
			img = new ImageIcon(this.getClass().getResource("/male.png"))
					.getImage();
			lblGender.setToolTipText("Male");
		}else{
			img = new ImageIcon(this.getClass().getResource("/female.png"))
					.getImage();
			lblGender.setToolTipText("Female");
		}
		lblGender.setIcon(new ImageIcon(img));
		getContentPane().add(lblGender);
		
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}
	
	private void refresh(){
		if(presenter.getCurrentUser().hasBuddy(presenter.getProfileUser()))
			btnAddBuddy.setVisible(false);
		else 
			btnAddBuddy.setVisible(true);
		if(!listModel.isEmpty())
			listModel.clear();
		
		for (Post p : presenter.getPosts()) {
			listModel.addElement("ID: "+p.getPostID()+",Post: "+p.getText());
		}
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.ShowProfileView#close()
	 */
	@Override
	public void close() {
		this.setVisible(false);
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.ShowProfileView#setShowProfilePresenter(buddychallenge.gui.presenters.ShowProfilePresenter)
	 */
	@Override
	public void setShowProfilePresenter(ShowProfilePresenter presenter) {
		this.presenter = presenter;
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.ShowProfileView#showMessage(java.lang.String)
	 */
	@Override
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.ShowProfileView#getMainFrame()
	 */
	@Override
	public JFrame getMainFrame() {
		return this.mainFrame;
	}

	@Override
	public String getSelectedValue() {
		String value = "";
		try{
			value = (String) listPosts.getSelectedValue().toString();
		}catch(NullPointerException e){
			showMessage("No post selected");
			value = null;
		}
		return value;
	}
}
