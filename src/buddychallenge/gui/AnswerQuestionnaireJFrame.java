/*
 * 
 */
package buddychallenge.gui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import buddychallenge.entities.Question;
import buddychallenge.gui.presenters.AnswerQuestionnairePresenter;
import buddychallenge.gui.views.interfaces.AnswerQuestionnaireView;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


// TODO: Auto-generated Javadoc
/**
 * The Class AnswerQuestionnaireJFrame.
 */
public class AnswerQuestionnaireJFrame extends JPanel implements AnswerQuestionnaireView{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The main frame. */
	private JFrame mainFrame;
	
	/** The previous panel. */
	private Container previousPanel;
	
	/** The presenter. */
	private AnswerQuestionnairePresenter presenter;	
	
	/** The lbl new label. */
	JLabel lblNewLabel;
	
	/** The btngroup1. */
	private ButtonGroup btngroup1;
	
	/** The lbl q1. */
	JLabel lblQ1;
	
	/** The lbl question1. */
	JLabel lblQuestion1;
	
	/** The panel1. */
	JPanel panel1;
	
	/** The rdbtn q1 o1. */
	JRadioButton rdbtnQ1O1;
	
	/** The rdbtn q1 o2. */
	JRadioButton rdbtnQ1O2;
	
	/** The btngroup2. */
	private ButtonGroup btngroup2;
	
	/** The lbl q2. */
	JLabel lblQ2;
	
	/** The lbl question2. */
	JLabel lblQuestion2;
	
	/** The panel2. */
	JPanel panel2;
	
	/** The rdbtn q2 o1. */
	JRadioButton rdbtnQ2O1;
	
	/** The rdbtn q2 o2. */
	JRadioButton rdbtnQ2O2;
	
	/** The btngroup3. */
	private ButtonGroup btngroup3;
	
	/** The lbl q3. */
	JLabel lblQ3;
	
	/** The lbl question3. */
	JLabel lblQuestion3;
	
	/** The panel3. */
	JPanel panel3;
	
	/** The rdbtn q3 o1. */
	JRadioButton rdbtnQ3O1;
	
	/** The rdbtn q3 o2. */
	JRadioButton rdbtnQ3O2;
	
	/** The btngroup4. */
	private ButtonGroup btngroup4;
	
	/** The lbl q4. */
	JLabel lblQ4;
	
	/** The lbl question4. */
	JLabel lblQuestion4;
	
	/** The panel4. */
	JPanel panel4;
	
	/** The rdbtn q4 o1. */
	JRadioButton rdbtnQ4O1;
	
	/** The rdbtn q4 o2. */
	JRadioButton rdbtnQ4O2;
	
	/** The btngroup5. */
	private ButtonGroup btngroup5;
	
	/** The lbl q5. */
	JLabel lblQ5;
	
	/** The lbl question5. */
	JLabel lblQuestion5;
	
	/** The panel5. */
	JPanel panel5;
	
	/** The rdbtn q5 o1. */
	JRadioButton rdbtnQ5O1;
	
	/** The rdbtn q5 o2. */
	JRadioButton rdbtnQ5O2;
	
	/** The btngroup6. */
	private ButtonGroup btngroup6;
	
	/** The lbl q6. */
	JLabel lblQ6;
	
	/** The lbl question6. */
	JLabel lblQuestion6;
	
	/** The panel6. */
	JPanel panel6;
	
	/** The rdbtn q6 o1. */
	JRadioButton rdbtnQ6O1;
	
	/** The rdbtn q6 o2. */
	JRadioButton rdbtnQ6O2;
	
	/** The btngroup7. */
	private ButtonGroup btngroup7;
	
	/** The lbl q7. */
	JLabel lblQ7;
	
	/** The lbl question7. */
	JLabel lblQuestion7;
	
	/** The panel7. */
	JPanel panel7;
	
	/** The rdbtn q7 o1. */
	JRadioButton rdbtnQ7O1;
	
	/** The rdbtn q7 o2. */
	JRadioButton rdbtnQ7O2;
	
	/** The q1. */
	Question q1;
	
	/** The q2. */
	Question q2;
	
	/** The q3. */
	Question q3;
	
	/** The q4. */
	Question q4;
	
	/** The q5. */
	Question q5;
	
	/** The q6. */
	Question q6;
	
	/** The q7. */
	Question q7;
	
	/** The submit. */
	private JButton submit;
	
	/**
	 * Instantiates a new answer questionnaire j frame.
	 *
	 * @param frame the frame
	 */
	public AnswerQuestionnaireJFrame(JFrame frame) {
		setBackground(Color.ORANGE);
		setLayout(null);
		mainFrame = frame;
		
		lblNewLabel = new JLabel("Answer the following Questions");
		lblNewLabel.setBounds(109, 12, 240, 15);
		add(lblNewLabel);
		
		lblQ1 = new JLabel("Question 1:");
		lblQ1.setBounds(12, 31, 90, 15);
		add(lblQ1);
		
		lblQuestion1 = new JLabel("");
		lblQuestion1.setBounds(109, 31, 307, 15);
		add(lblQuestion1);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.ORANGE);
		panel1.setBounds(109, 49, 200, 25);
		add(panel1);
		
		rdbtnQ1O1 = new JRadioButton("");
		rdbtnQ1O1.setBackground(Color.ORANGE);
		panel1.add(rdbtnQ1O1);
		
		rdbtnQ1O2 = new JRadioButton("");
		rdbtnQ1O2.setBackground(Color.ORANGE);
		panel1.add(rdbtnQ1O2);
		
		btngroup1 = new ButtonGroup();
		btngroup1.add(rdbtnQ1O1);
		btngroup1.add(rdbtnQ1O2);
		//question 2
		lblQ2 = new JLabel("Question 2:");
		lblQ2.setBounds(12, 89, 90, 15); //y+58
		add(lblQ2);
		
		lblQuestion2 = new JLabel("");
		lblQuestion2.setBounds(109, 89, 307, 15); //y+58
		add(lblQuestion2);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.ORANGE);
		panel2.setBounds(109, 107, 200, 25); //y+55
		add(panel2);
		
		rdbtnQ2O1 = new JRadioButton("");
		rdbtnQ2O1.setBackground(Color.ORANGE);
		panel2.add(rdbtnQ2O1);
		
		rdbtnQ2O2 = new JRadioButton("");
		rdbtnQ2O2.setBackground(Color.ORANGE);
		panel2.add(rdbtnQ2O2);
		
		btngroup2 = new ButtonGroup();
		btngroup2.add(rdbtnQ2O1);
		btngroup2.add(rdbtnQ2O2);
		
		//question 3
		lblQ3 = new JLabel("Question 3:");
		lblQ3.setBounds(12, 147, 90, 15); //y+58
		add(lblQ3);
		
		lblQuestion3 = new JLabel("");
		lblQuestion3.setBounds(109, 147, 307, 15); //y+58
		add(lblQuestion3);
		
		panel3 = new JPanel();
		panel3.setBackground(Color.ORANGE);
		panel3.setBounds(109, 165, 200, 25); //y+55
		add(panel3);
		
		rdbtnQ3O1 = new JRadioButton("");
		rdbtnQ3O1.setBackground(Color.ORANGE);
		panel3.add(rdbtnQ3O1);
		
		rdbtnQ3O2 = new JRadioButton("");
		rdbtnQ3O2.setBackground(Color.ORANGE);
		panel3.add(rdbtnQ3O2);
		
		btngroup3 = new ButtonGroup();
		btngroup3.add(rdbtnQ3O1);
		btngroup3.add(rdbtnQ3O2);
		
		//question 4
		lblQ4 = new JLabel("Question 4:");
		lblQ4.setBounds(12, 205, 90, 15); //y+58
		add(lblQ4);
				
		lblQuestion4 = new JLabel("");
		lblQuestion4.setBounds(109, 205, 307, 15); //y+58
		add(lblQuestion4);
				
		panel4 = new JPanel();
		panel4.setBackground(Color.ORANGE);
		panel4.setBounds(109, 223, 200, 25); //y+55
		add(panel4);
				
		rdbtnQ4O1 = new JRadioButton("");
		rdbtnQ4O1.setBackground(Color.ORANGE);
		panel4.add(rdbtnQ4O1);
				
		rdbtnQ4O2 = new JRadioButton("");
		rdbtnQ4O2.setBackground(Color.ORANGE);
		panel4.add(rdbtnQ4O2);
				
		btngroup4 = new ButtonGroup();
		btngroup4.add(rdbtnQ4O1);
		btngroup4.add(rdbtnQ4O2);
		
		//question 5
		lblQ5 = new JLabel("Question 5:");
		lblQ5.setBounds(12, 263, 90, 15); //y+58
		add(lblQ5);
				
		lblQuestion5 = new JLabel("");
		lblQuestion5.setBounds(109, 263, 307, 15); //y+58
		add(lblQuestion5);
				
		panel5 = new JPanel();
		panel5.setBackground(Color.ORANGE);
		panel5.setBounds(109, 281, 200, 25); //y+55
		add(panel5);
				
		rdbtnQ5O1 = new JRadioButton("");
		rdbtnQ5O1.setBackground(Color.ORANGE);
		panel5.add(rdbtnQ5O1);
				
		rdbtnQ5O2 = new JRadioButton("");
		rdbtnQ5O2.setBackground(Color.ORANGE);
		panel5.add(rdbtnQ5O2);
				
		btngroup5 = new ButtonGroup();
		btngroup5.add(rdbtnQ5O1);
		btngroup5.add(rdbtnQ5O2);
		
		//question 6
		lblQ6 = new JLabel("Question 6:");
		lblQ6.setBounds(12, 321, 90, 15); //y+58
		add(lblQ6);
				
		lblQuestion6 = new JLabel("");
		lblQuestion6.setBounds(109, 321, 307, 15); //y+58
		add(lblQuestion6);
				
		panel6 = new JPanel();
		panel6.setBackground(Color.ORANGE);
		panel6.setBounds(109, 339, 200, 25); //y+55
		add(panel6);
				
		rdbtnQ6O1 = new JRadioButton("");
		rdbtnQ6O1.setBackground(Color.ORANGE);
		panel6.add(rdbtnQ6O1);
				
		rdbtnQ6O2 = new JRadioButton("");
		rdbtnQ6O2.setBackground(Color.ORANGE);
		panel6.add(rdbtnQ6O2);
				
		btngroup6 = new ButtonGroup();
		btngroup6.add(rdbtnQ6O1);
		btngroup6.add(rdbtnQ6O2);
		
		//question 7
		lblQ7 = new JLabel("Question 7:");
		lblQ7.setBounds(12, 379, 90, 15); //y+58
		add(lblQ7);
				
		lblQuestion7 = new JLabel("");
		lblQuestion7.setBounds(109, 379, 307, 15); //y+58
		add(lblQuestion7);
				
		panel7 = new JPanel();
		panel7.setBackground(Color.ORANGE);
		panel7.setBounds(109, 397, 200, 25); //y+55
		add(panel7);
				
		rdbtnQ7O1 = new JRadioButton("");
		rdbtnQ7O1.setBackground(Color.ORANGE);
		panel7.add(rdbtnQ7O1);
				
		rdbtnQ7O2 = new JRadioButton("");
		rdbtnQ7O2.setBackground(Color.ORANGE);
		panel7.add(rdbtnQ7O2);
				
		btngroup7 = new ButtonGroup();
		btngroup7.add(rdbtnQ7O1);
		btngroup7.add(rdbtnQ7O2);
		
		submit = new JButton("submit");
		submit.setBackground(new Color(255, 99, 71));
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.submit();
			}
		});
		submit.setBounds(190,440,100,20);
		add(submit);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.cancel();
			}
		});
		btnCancel.setBackground(new Color(255, 215, 0));
		btnCancel.setBounds(66, 440, 100, 20);
		add(btnCancel);
		
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#open()
	 */
	@Override
	public void open() {
		previousPanel = mainFrame.getContentPane();
		initialize();
		mainFrame.setContentPane(this);
		mainFrame.revalidate();
		mainFrame.repaint();
		this.setVisible(true);
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#close()
	 */
	@Override
	public void close() {
		removeAll();
		mainFrame.setContentPane(previousPanel);
		mainFrame.revalidate();
		mainFrame.repaint();
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#setAnswerQuestionnairePresenter(buddychallenge.gui.presenters.AnswerQuestionnairePresenter)
	 */
	@Override
	public void setAnswerQuestionnairePresenter(
			AnswerQuestionnairePresenter presenter) {
		this.presenter = presenter;
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#showMessage(java.lang.String)
	 */
	@Override
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}
	
	/**
	 * Initialize.
	 */
	private void initialize(){
		q1 = presenter.getQuestion();		
		lblQuestion1.setText(q1.getQuestion());
		rdbtnQ1O1.setText(q1.getOptions().get(0));
		rdbtnQ1O2.setText(q1.getOptions().get(1));
		
		q2 = presenter.getQuestion();
		lblQuestion2.setText(q2.getQuestion());
		rdbtnQ2O1.setText(q2.getOptions().get(0));
		rdbtnQ2O2.setText(q2.getOptions().get(1));
		
		q3 = presenter.getQuestion();
		lblQuestion3.setText(q3.getQuestion());
		rdbtnQ3O1.setText(q3.getOptions().get(0));
		rdbtnQ3O2.setText(q3.getOptions().get(1));
		
		q4 = presenter.getQuestion();
		lblQuestion4.setText(q4.getQuestion());
		rdbtnQ4O1.setText(q4.getOptions().get(0));
		rdbtnQ4O2.setText(q4.getOptions().get(1));
		
		q5 = presenter.getQuestion();
		lblQuestion5.setText(q5.getQuestion());
		rdbtnQ5O1.setText(q5.getOptions().get(0));
		rdbtnQ5O2.setText(q5.getOptions().get(1));
		
		q6 = presenter.getQuestion();
		lblQuestion6.setText(q6.getQuestion());
		rdbtnQ6O1.setText(q6.getOptions().get(0));
		rdbtnQ6O2.setText(q6.getOptions().get(1));
		
		q7 = presenter.getQuestion();
		lblQuestion7.setText(q7.getQuestion());
		rdbtnQ7O1.setText(q7.getOptions().get(0));
		rdbtnQ7O2.setText(q7.getOptions().get(1));
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#getQuestion1()
	 */
	public Question getQuestion1(){
		return q1;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#getAnswer1()
	 */
	public String getAnswer1(){
		if(rdbtnQ1O1.isSelected())
			return rdbtnQ1O1.getText();
		else if(rdbtnQ1O2.isSelected())
			return rdbtnQ1O2.getText();
		else return null;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#getQuestion2()
	 */
	public Question getQuestion2(){
		return q2;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#getAnswer2()
	 */
	public String getAnswer2(){
		if(rdbtnQ2O1.isSelected())
			return rdbtnQ2O1.getText();
		else if(rdbtnQ2O2.isSelected())
			return rdbtnQ2O2.getText();
		else return null;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#getQuestion3()
	 */
	public Question getQuestion3(){
		return q3;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#getAnswer3()
	 */
	public String getAnswer3(){
		if(rdbtnQ3O1.isSelected())
			return rdbtnQ3O1.getText();
		else if(rdbtnQ3O2.isSelected())
			return rdbtnQ3O2.getText();
		else return null;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#getQuestion4()
	 */
	public Question getQuestion4(){
		return q4;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#getAnswer4()
	 */
	public String getAnswer4(){
		if(rdbtnQ4O1.isSelected())
			return rdbtnQ4O1.getText();
		else if(rdbtnQ4O2.isSelected())
			return rdbtnQ4O2.getText();
		else return null;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#getQuestion5()
	 */
	public Question getQuestion5(){
		return q5;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#getAnswer5()
	 */
	public String getAnswer5(){
		if(rdbtnQ5O1.isSelected())
			return rdbtnQ5O1.getText();
		else if(rdbtnQ5O2.isSelected())
			return rdbtnQ5O2.getText();
		else return null;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#getQuestion6()
	 */
	public Question getQuestion6(){
		return q6;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#getAnswer6()
	 */
	public String getAnswer6(){
		if(rdbtnQ6O1.isSelected())
			return rdbtnQ6O1.getText();
		else if(rdbtnQ6O2.isSelected())
			return rdbtnQ6O2.getText();
		else return null;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#getQuestion7()
	 */
	public Question getQuestion7(){
		return q7;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.AnswerQuestionnaireView#getAnswer7()
	 */
	public String getAnswer7(){
		if(rdbtnQ7O1.isSelected())
			return rdbtnQ7O1.getText();
		else if(rdbtnQ7O2.isSelected())
			return rdbtnQ7O2.getText();
		else return null;
	}
}
