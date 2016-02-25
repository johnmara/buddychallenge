/*
 * 
 */

package buddychallenge.dao;

import java.util.ArrayList;
import java.util.List;

import buddychallenge.entities.Question;

// TODO: Auto-generated Javadoc
/**
 * The Class QuestionsDAO.
 */
public class QuestionsDAO {
	
	/** The questions. */
	List<Question> questions;
	

	/**
	 * Instantiates a new questions dao.
	 */
	public QuestionsDAO(){
		questions = new ArrayList<Question>();
		Question q1 = new Question();
		q1.setQuestion("What music do you like?");
		q1.addOption("rock");
		q1.addOption("rnb");

		Question q2 = new Question();
		q2.setQuestion("What colour do you like?");
		q2.addOption("blue");
		q2.addOption("red");

		Question q3 = new Question();
		q3.setQuestion("Uni?");
		q3.addOption("aueb");
		q3.addOption("papei");

		Question q4 = new Question();
		q4.setQuestion("Brand");
		q4.addOption("adidas");
		q4.addOption("nike");
		
		Question q5 = new Question();
		q5.setQuestion("Food");
		q5.addOption("pizza");
		q5.addOption("burger");
		
		Question q6 = new Question();
		q6.setQuestion("Entertainment");
		q6.addOption("cinema");
		q6.addOption("theater");
		
		Question q7 = new Question();
		q7.setQuestion("Country");
		q7.addOption("England");
		q7.addOption("Germany");
		
		Question q8 = new Question();
		q8.setQuestion("Singer");
		q8.addOption("Elvis");
		q8.addOption("Jackson");
		
		Question q9 = new Question();
		q9.setQuestion("Team");
		q9.addOption("Barca");
		q9.addOption("Real");
		
		Question q10 = new Question();
		q10.setQuestion("Sport");
		q10.addOption("football");
		q10.addOption("basketball");
		
		Question q11 = new Question();
		q11.setQuestion("Vacation");
		q11.addOption("mountain");
		q11.addOption("sea");
		
		Question q12 = new Question();
		q12.setQuestion("Transport");
		q12.addOption("plane");
		q12.addOption("train");
		
		Question q13 = new Question();
		q13.setQuestion("Accomodation");
		q13.addOption("hotel");
		q13.addOption("camping");
		
		Question q14 = new Question();
		q14.setQuestion("Social");
		q14.addOption("facebook");
		q14.addOption("twitter");
		
		Question q15 = new Question();
		q15.setQuestion("Night life");
		q15.addOption("club");
		q15.addOption("pub");
		
		
		questions.add(q1);
		questions.add(q2);
		questions.add(q3);
		questions.add(q4);
		questions.add(q5);
		questions.add(q6);
		questions.add(q7);
		questions.add(q8);
		questions.add(q9);
		questions.add(q10);
		questions.add(q11);
		questions.add(q12);
		questions.add(q13);
		questions.add(q14);
		questions.add(q15);
		
	}
	
	/**
	 * Adds the question.
	 *
	 * @param q the q
	 */
	public void addQuestion(Question q){
		questions.add(q);
	}
	
	/**
	 * Removes the question.
	 *
	 * @param q the q
	 * @return true, if successful
	 */
	public boolean removeQuestion(Question q){
		for(Question q2 : questions){
			if(q2.equals(q)){
				questions.remove(q2);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Gets the question by id.
	 *
	 * @param ID the id
	 * @return the question by id
	 */
	public Question getQuestionByID(int ID){
		for(Question q : questions){
			if(q.getQuestionID() == ID){
				return q;
			}
		}
		return null;
	}
	
	/**
	 * Gets the list.
	 *
	 * @return the list
	 */
	public List<Question> getList() {
		return new ArrayList<Question>(questions);
	}

}
