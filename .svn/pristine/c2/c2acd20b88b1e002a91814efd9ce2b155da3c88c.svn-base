	/*
 * 
 */
package buddychallenge.gui;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import buddychallenge.entities.Question;
import buddychallenge.gui.presenters.BuddyRequestPresenter;
import buddychallenge.gui.views.interfaces.BuddyRequestView;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class BuddyRequestJFrame.
 */
public class BuddyRequestJFrame extends JFrame implements BuddyRequestView{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The presenter. */
	private BuddyRequestPresenter presenter;
	
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
	
	/** The previus frame. */
	private JFrame previusFrame;
	
	/** The q1. */
	private Question q1;
	
	/** The q2. */
	private Question q2;
	
	/** The q3. */
	private Question q3;
	
	/** The q4. */
	private Question q4;
	
	/** The q5. */
	private Question q5;
	
	
	
	/**
	 * Instantiates a new buddy request j frame.
	 *
	 * @param frame the frame
	 */
	public BuddyRequestJFrame(JFrame frame) {
		
		this.setPreviusFrame(frame);
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		setSize(430, 420);
		
		JLabel lblNewLabel = new JLabel("Answer questions");
		lblNewLabel.setBounds(169, 12, 128, 15);
		getContentPane().add(lblNewLabel);
		
		lblQ1 = new JLabel("Question 1:");
		lblQ1.setBounds(12, 31, 90, 15);
		getContentPane().add(lblQ1);
		
		lblQuestion1 = new JLabel("");
		lblQuestion1.setBounds(109, 31, 307, 15);
		getContentPane().add(lblQuestion1);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.ORANGE);
		panel1.setBounds(109, 52, 200, 25);
		getContentPane().add(panel1);
		
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
		getContentPane().add(lblQ2);
		
		lblQuestion2 = new JLabel("");
		lblQuestion2.setBounds(109, 89, 307, 15); //y+58
		getContentPane().add(lblQuestion2);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.ORANGE);
		panel2.setBounds(109, 107, 200, 25); //y+55
		getContentPane().add(panel2);
		
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
		getContentPane().add(lblQ3);
		
		lblQuestion3 = new JLabel("");
		lblQuestion3.setBounds(109, 147, 307, 15); //y+58
		getContentPane().add(lblQuestion3);
		
		panel3 = new JPanel();
		panel3.setBackground(Color.ORANGE);
		panel3.setBounds(109, 165, 200, 25); //y+55
		getContentPane().add(panel3);
		
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
		getContentPane().add(lblQ4);
				
		lblQuestion4 = new JLabel("");
		lblQuestion4.setBounds(109, 205, 307, 15); //y+58
		getContentPane().add(lblQuestion4);
				
		panel4 = new JPanel();
		panel4.setBackground(Color.ORANGE);
		panel4.setBounds(109, 223, 200, 25); //y+55
		getContentPane().add(panel4);
				
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
		getContentPane().add(lblQ5);
				
		lblQuestion5 = new JLabel("");
		lblQuestion5.setBounds(109, 263, 307, 15); //y+58
		getContentPane().add(lblQuestion5);
				
		panel5 = new JPanel();
		panel5.setBackground(Color.ORANGE);
		panel5.setBounds(109, 281, 200, 25); //y+55
		getContentPane().add(panel5);
				
		rdbtnQ5O1 = new JRadioButton("");
		rdbtnQ5O1.setBackground(Color.ORANGE);
		panel5.add(rdbtnQ5O1);
				
		rdbtnQ5O2 = new JRadioButton("");
		rdbtnQ5O2.setBackground(Color.ORANGE);
		panel5.add(rdbtnQ5O2);
				
		btngroup5 = new ButtonGroup();
		btngroup5.add(rdbtnQ5O1);
		btngroup5.add(rdbtnQ5O2);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.sendQuestions();
			}
		});
		btnSubmit.setBackground(new Color(255, 99, 71));
		btnSubmit.setBounds(152, 318, 117, 25);
		getContentPane().add(btnSubmit);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.BuddyRequestView#open()
	 */
	@Override
	public void open() {
		this.setVisible(true);
		initialize();
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}

	/**
	 * Initialize.
	 */
	private void initialize() {
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
		
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.BuddyRequestView#close()
	 */
	@Override
	public void close() {
		this.setVisible(false);
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.BuddyRequestView#showMessage(java.lang.String)
	 */
	@Override
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.BuddyRequestView#setBuddyRequestPresenter(buddychallenge.gui.presenters.BuddyRequestPresenter)
	 */
	@Override
	public void setBuddyRequestPresenter(
			BuddyRequestPresenter buddyRequestPresenter) {
		presenter = buddyRequestPresenter;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.BuddyRequestView#getQuestion1()
	 */
	public Question getQuestion1(){
		return q1;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.BuddyRequestView#getAnswer1()
	 */
	public String getAnswer1(){
		if(rdbtnQ1O1.isSelected())
			return rdbtnQ1O1.getText();
		else if(rdbtnQ1O2.isSelected())
			return rdbtnQ1O2.getText();
		else return null;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.BuddyRequestView#getQuestion2()
	 */
	public Question getQuestion2(){
		return q2;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.BuddyRequestView#getAnswer2()
	 */
	public String getAnswer2(){
		if(rdbtnQ2O1.isSelected())
			return rdbtnQ2O1.getText();
		else if(rdbtnQ2O2.isSelected())
			return rdbtnQ2O2.getText();
		else return null;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.BuddyRequestView#getQuestion3()
	 */
	public Question getQuestion3(){
		return q3;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.BuddyRequestView#getAnswer3()
	 */
	public String getAnswer3(){
		if(rdbtnQ3O1.isSelected())
			return rdbtnQ3O1.getText();
		else if(rdbtnQ3O2.isSelected())
			return rdbtnQ3O2.getText();
		else return null;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.BuddyRequestView#getQuestion4()
	 */
	public Question getQuestion4(){
		return q4;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.BuddyRequestView#getAnswer4()
	 */
	public String getAnswer4(){
		if(rdbtnQ4O1.isSelected())
			return rdbtnQ4O1.getText();
		else if(rdbtnQ4O2.isSelected())
			return rdbtnQ4O2.getText();
		else return null;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.BuddyRequestView#getQuestion5()
	 */
	public Question getQuestion5(){
		return q5;
	}
	
	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.BuddyRequestView#getAnswer5()
	 */
	public String getAnswer5(){
		if(rdbtnQ5O1.isSelected())
			return rdbtnQ5O1.getText();
		else if(rdbtnQ5O2.isSelected())
			return rdbtnQ5O2.getText();
		else return null;
	}

	/* (non-Javadoc)
	 * @see buddychallenge.gui.views.interfaces.BuddyRequestView#getPreviusFrame()
	 */
	public JFrame getPreviusFrame() {
		return previusFrame;
	}

	/**
	 * Sets the previus frame.
	 *
	 * @param previusFrame the new previus frame
	 */
	public void setPreviusFrame(JFrame previusFrame) {
		this.previusFrame = previusFrame;
	}
}
