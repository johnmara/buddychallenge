package buddychallenge.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import buddychallenge.entities.Comment;
import buddychallenge.gui.presenters.ShowPostDetailsPresenter;
import buddychallenge.gui.views.interfaces.ShowPostDetailsView;
import buddychallenge.util.Category;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class ShowPostDetailsJFrame extends JFrame implements ShowPostDetailsView{

	private static final long serialVersionUID = 1L;
	
	private JList<String> list;
	private DefaultListModel<String> listModel;
	
	private JRadioButton rdbtnCat1;
	private JRadioButton rdbtnCat2;
	private JRadioButton rdbtnCat3;
	private ButtonGroup btgGroup;
	
	private ShowPostDetailsPresenter presenter;
	private JTextField textReason;
	private JTextField textFieldCommentText;
	
	private JLabel labelPostText;
	private JButton btnRefresh;
	
	public ShowPostDetailsJFrame(){
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setSize(538, 391);
		
		
		listModel = new DefaultListModel<String>();
		list = new JList<String>(listModel);
		list.setBounds(23, 102, 288, 116);
		getContentPane().add(list);
		
		JButton btnAddComment = new JButton("Add Comment");
		btnAddComment.setBackground(new Color(255, 99, 71));
		btnAddComment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.addComment();
			}
		});
		btnAddComment.setBounds(94, 276, 141, 23);
		getContentPane().add(btnAddComment);
		
		labelPostText = new JLabel("");
		labelPostText.setBounds(84, 10, 236, 50);
		getContentPane().add(labelPostText);

		
		JButton btnReport = new JButton("");
		btnReport.setBackground(new Color(255, 99, 71));
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				presenter.reportPost();
			}
		});
		btnReport.setIcon(new ImageIcon(ShowPostDetailsJFrame.class.getResource("/javax/swing/plaf/metal/icons/Warn.gif")));
		btnReport.setBounds(384, 169, 40, 50);
		getContentPane().add(btnReport);
		
		Icon refreshIcon = new ImageIcon(this.getClass().getResource("/refresh.png"));
		btnRefresh = new JButton(refreshIcon);
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refresh();
			}
		});
		btnRefresh.setBackground(Color.ORANGE);
		btnRefresh.setBounds(23, 10, 30, 30);
		getContentPane().add(btnRefresh);
		
		
		textReason = new JTextField();
		textReason.setToolTipText("Reason");
		textReason.setBounds(343, 8, 155, 31);
		getContentPane().add(textReason);
		textReason.setColumns(10);
		
		rdbtnCat1 = new JRadioButton("Violation");
		rdbtnCat1.setBackground(Color.ORANGE);
		rdbtnCat1.setBounds(343, 46, 103, 31);
		rdbtnCat1.setSelected(true);
		getContentPane().add(rdbtnCat1);
		
		rdbtnCat2 = new JRadioButton("Racism");
		rdbtnCat2.setBackground(Color.ORANGE);
		rdbtnCat2.setBounds(343, 80, 103, 31);
		getContentPane().add(rdbtnCat2);
		
		rdbtnCat3 = new JRadioButton("Spam");
		rdbtnCat3.setBackground(Color.ORANGE);
		rdbtnCat3.setBounds(343, 117, 103, 31);
		getContentPane().add(rdbtnCat3);
		
		btgGroup = new ButtonGroup();
		btgGroup.add(rdbtnCat1);
		btgGroup.add(rdbtnCat2);
		btgGroup.add(rdbtnCat3);
		
		textFieldCommentText = new JTextField();
		textFieldCommentText.setBounds(84, 241, 176, 23);
		getContentPane().add(textFieldCommentText);
		textFieldCommentText.setColumns(10);
		
	}
	

	private void refresh() {
		if(!listModel.isEmpty())
			listModel.clear();
		
		List<Comment> commentList = presenter.getComments();
		for(Comment c : commentList){
			listModel.addElement(c.getUser().getFirstname() +" "+c.getUser().getLastname() + ":" +c.getText());
		}
		
	}


	@Override
	public void open() {
		this.setVisible(true);
		labelPostText.setText(presenter.getPostText());
		if(!listModel.isEmpty())
			listModel.clear();
		
		List<Comment> commentList = presenter.getComments();
		for(Comment c : commentList){
			listModel.addElement(c.getUser().getFirstname() +" "+c.getUser().getLastname() + ":" +c.getText());
		}
	}

	@Override
	public void close() {
		this.setVisible(false);
	}
	
	@Override
	public String getReasonString() {
		return textReason.getText();
	}


	@Override
	public Category getCategory() {
		if(rdbtnCat1.isSelected())
			return Category.category1;
		else if(rdbtnCat2.isSelected())
			return Category.category2;
		else
			return Category.category3;
			
	}
	
	@Override
	public String getCommentString() {
		return textFieldCommentText.getText();
	}

	@Override
	public void setShowPostDetailsPresenter(ShowPostDetailsPresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);		
	}

	@Override
	public String getSelectedValue() {
		
		return null;
	}
}
