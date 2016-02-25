package buddychallenge.services;

import buddychallenge.dao.QuestionsDAO;
import buddychallenge.entities.Question;

public class QuestionManageService {
	
	
	private Question question;
	private QuestionsDAO questions;
	
	public QuestionManageService(Question question){
		this.question = question;
		questions = new QuestionsDAO();
	}

	public void addQuestion() {
		questions.addQuestion(question);
	}

}
