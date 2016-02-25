/*
 * 
 */
package buddychallenge.util;

import java.util.List;
import java.util.Random;

import buddychallenge.entities.Question;

// TODO: Auto-generated Javadoc
/**
 * The Class RandomQuestionGenerator.
 */
public class RandomQuestionGenerator extends Random {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The questions list. */
	private List<Question> questionsList;
	
	/**
	 * Instantiates a new random question generator.
	 *
	 * @param questionsList the questions list
	 */
	public RandomQuestionGenerator(List<Question> questionsList){
		this.questionsList = questionsList;
	}
	
	/**
	 * Gets a random question from question list.
	 *
	 * @return the question
	 */
	public Question getQuestion(){
		
		int r = nextInt(questionsList.size());
		Question q = this.questionsList.get(r);
		
		if(q==null){
			System.out.println("null");
			return null;
		}else{
			this.questionsList.remove(r);
			return q;
		}
		
	}
	
	/**
	 * Gets the question by id.
	 *
	 * @param id the id
	 * @return the question
	 */
	public Question getQuestion(int id){
		for (Question q: questionsList) {
			if(q.getQuestionID() == id){
				return q;
			}
		}
		return null;
	}

}