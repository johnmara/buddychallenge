/*
 * 
 */
package buddychallenge.gui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import buddychallenge.entities.User;
import buddychallenge.gui.presenters.SearchPresenter;
import buddychallenge.gui.views.interfaces.SearchView;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class SearchJPanel.
 */
public class SearchJPanel extends JPanel implements SearchView{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The main frame. */
	private JFrame mainFrame;
	
	/** The tabbed pane. */
	private JTabbedPane tabbedPane;
	
	/** The previus panel. */
	private Container previusPanel;
	
	/** The presenter. */
	private SearchPresenter presenter;
	
	/** The text field. */
	private JTextField textField;
	
	/** The list model. */
	DefaultListModel<String> listModel;
	
	/** The list. */
	private JList<String> list;
	
	/** The btn logout. */
	private JButton btnLogout;
	
	/**
	 * Instantiates a new search j panel.
	 *
	 * @param frame the frame
	 * @param tabbedPane the tabbed pane
	 */
	public SearchJPanel(JFrame frame, JTabbedPane tabbedPane) {
		previusPanel = frame.getContentPane();
		mainFrame = frame;
		
		setBackground(Color.ORANGE);
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(182, 75, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblSearchUser = new JLabel("Search User");
		lblSearchUser.setBounds(170, 12, 122, 24);
		lblSearchUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblSearchUser);
		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(new Color(255, 99, 71));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!listModel.isEmpty())
					listModel.clear();	
				presenter.setProfileNameString(textField.getText());
				List<User> userList =  presenter.action();
				if(!userList.isEmpty()){
					for(User u : userList){
						listModel.addElement(u.getUserID() + ":" + u.getFirstname() + " " + u.getLastname());
					}
				}
				list.setVisible(true);
			}
		});
		
		btnSearch.setBounds(182, 106, 89, 23);
		add(btnSearch);
		listModel = new DefaultListModel<String>();
		list = new JList<String>(listModel);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				presenter.showProfile();			
			}
		});

		list.setBounds(170, 155, 122, 97);
		add(list);
		
		this.tabbedPane = tabbedPane;
		
		btnLogout = new JButton("Logout");
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
	 * @see buddychallenge.gui.views.interfaces.SearchView#getSelectedValue()
	 */
	public String getSelectedValue(){
		String value = "";
		try{
			value = (String) list.getSelectedValue().toString();
		}catch(NullPointerException e){
			showMessage("no user selected");
			value = null;
		}
		return value;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SearchView#getMainFrame()
	 */
	public JFrame getMainFrame(){
		return mainFrame;
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SearchView#open()
	 */
	@Override
	public void open() {
		//previusPanel = mainFrame.getContentPane();
		tabbedPane.setSelectedIndex(2);
		mainFrame.revalidate();
		mainFrame.repaint();
		this.setVisible(true);
		this.textField.setText("");
		listModel.clear();
		list.setVisible(false);
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SearchView#close()
	 */
	@Override
	public void close() {
		removeAll();
		mainFrame.setContentPane(previusPanel);
		mainFrame.revalidate();
		mainFrame.repaint();
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SearchView#setSearchPresenter(buddychallenge.gui.presenters.SearchPresenter)
	 */
	@Override
	public void setSearchPresenter(SearchPresenter presenter) {
		this.presenter = presenter;
	}


	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.SearchView#showMessage(java.lang.String)
	 */
	@Override
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}
	
	
}
