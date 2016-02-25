package buddychallenge.gui;

import javax.swing.JFrame;

import buddychallenge.gui.presenters.ManageReportsPresenter;
import buddychallenge.gui.views.interfaces.ManageReportsView;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManageReportsJFrame extends JFrame implements ManageReportsView {

	private static final long serialVersionUID = 1L;
	JList<String> list;
	DefaultListModel<String> listModel;
	ManageReportsPresenter presenter;
	private JButton btnRefresh;

	public ManageReportsJFrame() {
		setSize(450, 400);
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		
		listModel = new DefaultListModel<String>();
		list = new JList<String>(listModel);
		list.setBounds(100, 45, 250, 157);
		getContentPane().add(list);
		
		JButton btnDeletePost = new JButton("Delete Post");
		btnDeletePost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				presenter.deletePost();
			}
		});
		btnDeletePost.setBackground(new Color(255, 99, 71));
		btnDeletePost.setBounds(262, 234, 117, 25);
		getContentPane().add(btnDeletePost);
		
		JButton btnDeleteReport = new JButton("Delete Report");
		btnDeleteReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				presenter.deleteReport(); 
			}
		});
		btnDeleteReport.setBackground(new Color(255, 99, 71));
		btnDeleteReport.setBounds(66, 234, 151, 25);
		getContentPane().add(btnDeleteReport);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnCancel.setBackground(new Color(255, 215, 0));
		btnCancel.setBounds(177, 271, 117, 25);
		getContentPane().add(btnCancel);
		
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

		
	}

	@Override
	public void open() {
		setVisible(true);
		for(String s : presenter.getReportsList()){
			listModel.addElement(s);
		}
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				presenter.showReportDetails();			
			}
		});
	}
	
	private void refresh(){
		if(!listModel.isEmpty())
			listModel.clear();
		
		for(String s : presenter.getReportsList()){
			listModel.addElement(s);
		}
	}

	@Override
	public void close() {
		setVisible(false);
	}

	@Override
	public void setManageReportsPresenter(ManageReportsPresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public void showMessage(String message) {	
		JOptionPane.showMessageDialog(this,message);
	}
	
	@Override
	public String getSelectedValue() {
		String value = "";
		try{
			value = (String) list.getSelectedValue().toString();
		}catch(NullPointerException e){
			showMessage("No report selected");
			value = null;
		}
		return value;
	}
}
