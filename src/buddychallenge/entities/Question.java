/*
 * Describes A Question Entity
 */
package buddychallenge.entities;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Question.
 */
public class Question {
	
	/** The id. */
	private static int id;
	
	/** The Question id. */
	private int QuestionID;
	
	/** The question. */
	private String question;
	
	/** The options. */
	private List<String> options;
	
	/**
	 * Instantiates a new question.
	 *
	 * @param question the String instance of question text
	 * @param options the List<String> instance , the options of question
	 */
	public Question(String question, List<String> options) {
		QuestionID = id++;
		setQuestion(question);
		setOptions(options);
	}
	
	/**
	 * Instantiates a new question.
	 */
	public Question(){
		this("Uknown", new ArrayList<String>());
	}
	
	/**
	 * Adds the option.
	 *
	 * @param option the String instance that will be added to options list.
	 */
	public void addOption(String option){
		options.add(option);
	}
	
	/**
	 * Removes the option.
	 *
	 * @param option the String instance that will be removed
	 * @return true, if the option delete successfuly
	 */
	public boolean removeOption(String option){
		for(String opt : options){
			if (opt.trim().equalsIgnoreCase(option)){
				options.remove(opt);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Gets the question id.
	 *
	 * @return the question id
	 */
	public int getQuestionID() {
		return QuestionID;
	}

	/**
	 * Gets the question.
	 *
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * Sets the question.
	 *
	 * @param question the new question
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * Gets the options.
	 *
	 * @return the options
	 */
	public List<String> getOptions() {
		return options;
	}

	/**
	 * Sets the options.
	 *
	 * @param options the new options
	 */
	public void setOptions(List<String> options) {
		this.options = options;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return String.format("Question: %s\n Options: %s\n ", this.question, this.options);
	}
	
	/**
	 * Gets the questions admin.
	 *
	 * @return the questions admin
	 */
	public String getQuestionsAdmin(){
		return String.format("ID: %d\nQuestion: %s", getQuestionID(),getQuestion());
	}
}
