package buddychallenge.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import buddychallenge.gui.presenters.QuestionManagePresenter;
import buddychallenge.gui.views.interfaces.QuestionManageView;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuestionManageJPanel extends JPanel implements QuestionManageView {


	private static final long serialVersionUID = 1L;

	/** The main frame. */
	private JFrame mainFrame;
	
	private QuestionManagePresenter presenter;
	
	/** The previus panel. */
	private JPanel previusPanel;
	private JTextField textFieldQuestion;
	private JTextField textFieldOption1;
	private JTextField textFieldOption2;
	private JButton btnCancel;
	

	public QuestionManageJPanel(JFrame frame){
		setBackground(Color.ORANGE);
		this.mainFrame = frame;
		setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question:");
		lblQuestion.setBounds(100, 49, 69, 14);
		add(lblQuestion);
		
		textFieldQuestion = new JTextField();
		textFieldQuestion.setBounds(179, 46, 122, 20);
		add(textFieldQuestion);
		textFieldQuestion.setColumns(10);
		
		JLabel lblOptions = new JLabel("Options:");
		lblOptions.setBounds(107, 80, 62, 14);
		add(lblOptions);
		
		textFieldOption1 = new JTextField();
		textFieldOption1.setBounds(179, 77, 86, 20);
		add(textFieldOption1);
		textFieldOption1.setColumns(10);
		
		textFieldOption2 = new JTextField();
		textFieldOption2.setBounds(179, 108, 86, 20);
		add(textFieldOption2);
		textFieldOption2.setColumns(10);
		
		JButton btnAddQuestion = new JButton("Add Question");
		btnAddQuestion.setBackground(new Color(255, 99, 71));
		btnAddQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				presenter.addQuestion();
				presenter.cancel();
			}
		});
		btnAddQuestion.setBounds(201, 139, 136, 23);
		add(btnAddQuestion);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				presenter.cancel();
			}
		});
		btnCancel.setBackground(new Color(255, 215, 0));
		btnCancel.setBounds(93, 140, 96, 25);
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
	
	@Override
	public String getQuestionString(){
		return textFieldQuestion.getText();
	}
	
	@Override
	public String getOption1String(){
		return textFieldOption1.getText();
	}
	
	@Override
	public String getOption2String(){
		return textFieldOption2.getText();
	}
	
	@Override
	public void setPresenter(QuestionManagePresenter questionManagePresenter) {
		this.presenter = questionManagePresenter;
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