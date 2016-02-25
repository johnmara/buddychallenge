/*
 * 
 */
package buddychallenge.services;

import java.util.HashMap;
import java.util.Map;

import buddychallenge.dao.QuestionsDAO;
import buddychallenge.entities.Question;
import buddychallenge.entities.User;
import buddychallenge.util.RandomQuestionGenerator;

// TODO: Auto-generated Javadoc
/**
 * The Class SignUpQuestionnaire.
 */
public class SignUpQuestionnaire {
	
	/** The user. */
	private User user;
	
	/** The questions dao. */
	private QuestionsDAO questionsDAO;
	
	/** The random question. */
	private RandomQuestionGenerator randomQuestion;
	
	/** The answers. */
	private Map<Question,String> answers;
	
	/** The size. */
	private int size;
	
	/** The counter. */
	private int counter = 0;
	
	/**
	 * Instantiates a new sign up questionnaire.
	 *
	 * @param user the user
	 * @param questionsDAO the questions dao
	 * @param size the size
	 */
	public SignUpQuestionnaire(User user, QuestionsDAO questionsDAO, int size){
		this.user = user;
		this.questionsDAO = questionsDAO;
		answers = new HashMap<Question,String>();
		randomQuestion = new RandomQuestionGenerator(questionsDAO.getList());
		this.size = size;
	}
	
	/**
	 * Instantiates a new sign up questionnaire.
	 */
	public SignUpQuestionnaire(){
		this(null, null, 7);
	}
	
	/**
	 * Gets the question.
	 *
	 * @return the question
	 */
	public Question getQuestion(){
		if(counter <= size){
			Question q  = randomQuestion.getQuestion();
			answers.put(q,null);
			counter++;
			return q;
		}
		else{
			return null;
		}
	}
	
	/**
	 * Gets the question.
	 *
	 * @param id the id
	 * @return the question
	 */
	public Question getQuestion(int id){
		if(counter <= size){
			Question q  = randomQuestion.getQuestion(id);
			answers.put(q,"");
			counter++;
			return q;
		}
		else{
			return null;
		}
	}
	
	/**
	 * Answer question.
	 *
	 * @param q the question instance that will be answered
	 * @param answer the String instance that will be the answer of question
	 */
	public void answerQuestion(Question q, String answer){
		
		for (Map.Entry<Question, String> a : answers.entrySet()) {
			if(a.getKey().equals(q)){
				answers.put(q,answer);
				user.addQuestion(q, answer);
			}
		}
		
	}
	

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Sets the user.
	 *
	 * @param user the new user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Gets the questions dao.
	 *
	 * @return the questions dao
	 */
	public QuestionsDAO getQuestionsDAO() {
		return questionsDAO;
	}

	/**
	 * Sets the questions dao.
	 *
	 * @param questionsDAO the new questions dao
	 */
	public void setQuestionsDAO(QuestionsDAO questionsDAO) {
		this.questionsDAO = questionsDAO;
	}

	/**
	 * Gets the answers.
	 *
	 * @return the answers
	 */
	public Map<Question, String> getAnswers() {
		return answers;
	}

	/**
	 * Sets the answers.
	 *
	 * @param answers the answers
	 */
	public void setAnswers(Map<Question, String> answers) {
		this.answers = answers;
	}
	
	
	
}
