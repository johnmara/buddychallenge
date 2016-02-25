/*
 * 
 */
package buddychallenge.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import buddychallenge.entities.Question;
import buddychallenge.entities.User;
import buddychallenge.exceptions.BuddyException;
import buddychallenge.util.RandomQuestionGenerator;

// TODO: Auto-generated Javadoc
/**
 * The Class BuddyRequest.
 */
public class BuddyRequestService {
	
	/** The id. */
	private static int id;
	
	/** The request id. */
	private int requestID;
	
	/** The sender. */
	private User sender;
	
	/** The receiver. */
	private User receiver;
	
	/** The result. */
	private boolean result;
	
	/** The answers. */
	private Map<Question, String> answers;
	
	/** The questions. */
	private RandomQuestionGenerator questions; 
	
	/** The keys. */
	private List<Question> keys;

	/**
	 * Instantiates a new buddy request.
	 *
	 * @param sender the sender
	 * @param receiver the receiver
	 */
	public BuddyRequestService(User sender, User receiver) {
		requestID = id++;
		result = false;
		setSender(sender);
		setReceiver(receiver);
		keys = new ArrayList<Question>(receiver.getQuestions()
				.keySet());
		answers = new HashMap<Question, String>();
		questions = new RandomQuestionGenerator(keys);
	} 

	/**
	 * Instantiates a new buddy request.
	 */
	public BuddyRequestService() {
		this(null, null);
	}
	
	/**
	 * Gets the question.
	 *
	 * @return the question
	 */
	public Question getQuestion(){
		return questions.getQuestion();
	}
	
	/**
	 * Answer question.
	 *
	 * @param q the q
	 * @param answer the answer
	 */
	public void answerQuestion(Question q, String answer){
		answers.put(q,answer);
	}

	/**
	 * Calculate the percentage of the questions that the sender equels the receiver.
	 */
	public void calculate() {
		int correct = 0;
		for (Map.Entry<Question, String> answer : answers.entrySet()) {
			for (Map.Entry<Question, String> receiverAnswers : receiver.getQuestions()
					.entrySet()) {
				if (answer.getKey().equals(receiverAnswers.getKey())) {
					if (answer.getValue().equals(receiverAnswers.getValue())) {
						correct++;
					}
				}
			}
		}
		if (correct >= 3 && correct <= 10) {
			result = true;
		}
	}

	/**
	 * Checks if is result. If its true the 2 users become buddies.
	 *
	 * @return true, if is result
	 */
	public boolean isResult() {
		if (result) {
			try {
				sender.addBuddy(receiver);
				receiver.addBuddy(sender);
			} catch (BuddyException e) {
				return false;
			}
			return true;
		}

		return false;
	}

	/**
	 * Gets the sender.
	 *
	 * @return the sender
	 */
	public User getSender() {
		return sender;
	}

	/**
	 * Sets the sender.
	 *
	 * @param sender the new sender
	 */
	public void setSender(User sender) {
		this.sender = sender;
	}

	/**
	 * Gets the receiver.
	 *
	 * @return the receiver
	 */
	public User getReceiver() {
		return receiver;
	}

	/**
	 * Sets the receiver.
	 *
	 * @param receiver the new receiver
	 */
	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	/**
	 * Gets the request id.
	 *
	 * @return the request id
	 */
	public int getRequestID() {
		return requestID;
	}
	
	

	/**
	 * Gets the answers.
	 *
	 * @return the answers
	 */
	public Map<Question, String> getAnswers() {
		return new HashMap<Question,String>(answers);
	}

	/**
	 * Sets the answers.
	 *
	 * @param answers the answers
	 */
	public void setAnswers(Map<Question, String> answers) {
		this.answers = new HashMap<Question,String>(answers);
	}
}
